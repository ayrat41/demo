$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/loginfeature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login page verification",
  "description": "",
  "id": "login-page-verification",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 40,
  "name": "Register new user error messages validation",
  "description": "",
  "id": "login-page-verification;register-new-user-error-messages-validation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@register"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "User open the browser and navigate to amazon.com",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "User click on Register New User link",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User enters below credentials verify error messages",
  "rows": [
    {
      "cells": [
        "your name",
        "email",
        "password",
        "re-password"
      ],
      "line": 45
    },
    {
      "cells": [
        "",
        "",
        "",
        ""
      ],
      "line": 46
    },
    {
      "cells": [
        "tester",
        "",
        "",
        ""
      ],
      "line": 47
    },
    {
      "cells": [
        "tester",
        "tester@tester.com",
        "",
        ""
      ],
      "line": 48
    },
    {
      "cells": [
        "tester",
        "tester@tester.com",
        "tester123",
        ""
      ],
      "line": 49
    },
    {
      "cells": [
        "tester",
        "tester@tester.com",
        "tester123",
        "tester123"
      ],
      "line": 50
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "close the application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_open_the_browser_and_navigate_to_amazon_com()"
});
formatter.result({
  "duration": 12686334974,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_Register_New_User_link()"
});
formatter.result({
  "duration": 3436910407,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginPageSteps.close_the_application()"
});
formatter.result({
  "status": "skipped"
});
});