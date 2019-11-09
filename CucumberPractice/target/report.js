$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/KamilaFeatures/Facebook.features");
formatter.feature({
  "line": 1,
  "name": "Test Facebook",
  "description": "",
  "id": "test-facebook",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test login page",
  "description": "",
  "id": "test-facebook;test-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigates to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title \"Facebook\" is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters username \"kamila.aibedullova@gmail.com\" and password \"Kamila2779\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User clicks submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User on home page",
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
formatter.match({});
formatter.result({
  "status": "undefined"
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