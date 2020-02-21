function main() {
  var ss = SpreadsheetApp.getActiveSpreadsheet();
  var inSheet = ss.getSheetByName("Schools");
  var outSheet = ss.getSheetByName("Results");
  var mapSheet = ss.getSheetByName("EduCollegeDataMapping");
  
  var fields = getFields(mapSheet);
  var pretties = getPretties(mapSheet);
  
  var IDs = getIDs(inSheet);
  
  var attributes = getAttributes(IDs, fields);
  
  outputResults(outSheet, attributes, pretties);  
}

//get the field names
function getFields(mapSheet)
{
  var vals = mapSheet.getDataRange().getValues();
  var fields = [];
  for (var i = 1; i < vals.length; i++)
  {
    fields.push(vals[i][0]);
  }
  return fields;
}

//get the pretty names
function getPretties(mapSheet)
{
  var vals = mapSheet.getDataRange().getValues();
  var pretties = [];
  for (var i = 1; i < vals.length; i++)
  {
    pretties.push(vals[i][1]);
  }
  return pretties;
}

//get an array of IDs
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

function getAttributes(IDs, fieldArr) {
  
  var attributes = [];
  var fields = fieldArr.join(",");
  
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
    var resultArr = [];
    for (var j = 0; j < fieldArr.length; j++)
    {
      resultArr.push(results[i][fieldArr[j]]);
    }
    attributes.push(resultArr);
  }
  return attributes;
}

function outputResults(outSheet, attributes, pretties) {
  outSheet.clear();
  var outArray = attributes.slice(0);
  outArray.unshift(pretties);
  outSheet.getRange(1, 1, outArray.length, outArray[0].length).setValues(outArray);
}