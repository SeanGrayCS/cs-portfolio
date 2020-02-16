function onOpen() {
  var ui = SpreadsheetApp.getUi();
  // Or DocumentApp or FormApp.
  ui.createMenu('Attributes')
      .addItem('Update', 'updateAttributes')
      .addToUi();
}

function updateAttributes() {
  main();
}