$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Features/features.feature");
formatter.feature({
  "line": 1,
  "name": "Expedia",
  "description": "",
  "id": "expedia",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "expedia;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User open chrome browser and navigate to \"https://www.expedia.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Home page is open and Title wil contain \"Expedia Travel: Search Hotels, Cheap Flights, Car Rentals \u0026 Vacations\" text",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 9,
  "name": "",
  "description": "",
  "id": "expedia;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User clicks Flight button user nanvigated to Book Flight window",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "\"Flying from\" and \"Flying to\" boxes are displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});