function main() {
  
  var ss = SpreadsheetApp.getActiveSpreadsheet();
  var inSheet = ss.getSheetByName("Schools");
  var outSheet = ss.getSheetByName("Results");
  
  var IDs = getIDs(inSheet);

  var attributes = getAttributes(IDs);
  
  outputResults(outSheet, attributes);
  
}

function getIDs(inSheet)
{
  return inSheet.getRange("C2:C" + inSheet.getMaxRows()).getValues();
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
      
      attributes.push([data.results[0]["id"], data.results[0]["school.name"], data.results[0]["school.city"], data.results[0]["school.state"], 
                       data.results[0]["2017.admissions.admission_rate.overall"], data.results[0]["2017.admissions.sat_scores.average.overall"]]);
    }
  }
  return attributes;
}

function outputResults(outSheet, attributes) {
  outSheet.clear();
  var outArray = attributes.slice(0);
  outArray.unshift(["School ID", "School Name", "School City", "School State", "Admission Rate", "Average SAT Score"]);
  outSheet.getRange(1, 1, outArray.length, outArray[0].length).setValues(outArray);
}