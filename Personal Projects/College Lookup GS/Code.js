function getIDs(inSheet)
{
  var numRows = inSheet.getMaxRows();
  return inSheet.getRange("C2:C" + numRows).getValues();
}

function getAttributes(IDs) {
  
  var attributes = [];
  
  var fields = "id,2017.admissions.sat_scores,school.men_only,school.city,school.state,2017.admissions.admission_rate.overall,school.name";
  
  for (var i = 0; i < IDs.length; i++)
  {
    var ID = IDs[i];
    if (ID != "")
    {
      var url = "https://api.data.gov/ed/collegescorecard/v1/schools.json"
      + "?api_key=sjKVBOXcd6ZaQ1PWhbbxClPe6V1kOKaI7eJfItMa"
      + "&id=" + ID
      + "&fields=" + fields;
      
      var response = UrlFetchApp.fetch(url, {'muteHttpExceptions': true});
      var json = response.getContentText();
      var data = JSON.parse(json);
      
      var keys = Object.keys(data);
      
      attributes.push(data.results[0]["school.name"]);
      attributes.push(data.results[0]["school.city"]);
      attributes.push(data.results[0]["school.state"]);
      attributes.push(data.results[0]["id"]);
      attributes.push(data.results[0]["2017.admissions.admission_rate.overall"]);
      attributes.push(data.results[0]["2017.admissions.sat_scores.average.overall"]);
    }
  }
  return attributes;
}

function outputResults(outSheet, attributes) {
  outSheet.clear();
  outSheet.getRange("A1").setValue("School Name");
  outSheet.getRange("B1").setValue("School City");
  outSheet.getRange("C1").setValue("School State");
  outSheet.getRange("D1").setValue("School ID");
  outSheet.getRange("E1").setValue("Admission Rate");
  outSheet.getRange("F1").setValue("Average SAT Score");
  var i = 0
  var row = i + 2;
  while (i < attributes.length)
  {
    outSheet.getRange("A" + row).setValue(attributes[i]);
    outSheet.getRange("B" + row).setValue(attributes[i + 1]);
    outSheet.getRange("C" + row).setValue(attributes[i + 2]);
    outSheet.getRange("D" + row).setValue(attributes[i + 3]);
    outSheet.getRange("E" + row).setValue(attributes[i + 4]);
    outSheet.getRange("F" + row).setValue(attributes[i + 5]);
    i += 6;
    row++;
  }
}

function main() {
  
  var ss = SpreadsheetApp.getActiveSpreadsheet();
  var inSheet = ss.getSheetByName("Schools");
  var outSheet = ss.getSheetByName("Results");
  
  var IDs = getIDs(inSheet);

  var attributes = getAttributes(IDs);
  
  outputResults(outSheet, attributes);
  
}