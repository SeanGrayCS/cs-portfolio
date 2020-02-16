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
  var IDs = inSheet.getRange("C2:C" + inSheet.getMaxRows()).getValues();
  var filteredIDs = [];
  for (var i = 0; i < IDs.length; i++)
  {
    if (IDs[i] != "")
    {
      filteredIDs.push(IDs[i]);
    }
  }
  return filteredIDs;
}

function getAttributes(IDs) {
  
  var attributes = [];
  
  var fields = "id,2017.admissions.sat_scores,school.men_only,school.city,school.state,2017.admissions.admission_rate.overall,school.name";
  
  var IDString = IDs.join(",");
  var url = "https://api.data.gov/ed/collegescorecard/v1/schools.json"
  + "?api_key=sjKVBOXcd6ZaQ1PWhbbxClPe6V1kOKaI7eJfItMa"
  + "&per_page=100"
  + "&id=" + IDString
  + "&fields=" + fields;
      
  var response = UrlFetchApp.fetch(url, {'muteHttpExceptions': true});
  var json = response.getContentText();
  var data = JSON.parse(json);
  var results = data.results;
  for (var i = 0; i < results.length; i++)
  {
    attributes.push([results[i]["id"], results[i]["school.name"], results[i]["school.city"], results[i]["school.state"], 
                     results[i]["2017.admissions.admission_rate.overall"], results[i]["2017.admissions.sat_scores.average.overall"]]);
  }
  return attributes;
}

function outputResults(outSheet, attributes) {
  outSheet.clear();
  var outArray = attributes.slice(0);
  outArray.unshift(["School ID", "School Name", "School City", "School State", "Admission Rate", "Average SAT Score"]);
  outSheet.getRange(1, 1, outArray.length, outArray[0].length).setValues(outArray);
}