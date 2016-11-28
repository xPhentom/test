$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 2,
  "name": "test",
  "description": "",
  "id": "test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@testaze"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "placing a hiring",
  "description": "\r\n\r\nGiven: I am on the place hiring page\r\nWhen: I click on place hiring\r\nThen: The hiring should be saved in the database",
  "id": "test;placing-a-hiring",
  "type": "scenario",
  "keyword": "Scenario"
});
});