$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/test.feature");
formatter.feature({
  "name": "Facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test Messenger",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User open chrome browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User navigate to www.google.com",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Home page is open and Google title is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});