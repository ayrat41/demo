$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features.feature");
formatter.feature({
  "line": 1,
  "name": "Test1",
  "description": "",
  "id": "test1",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user open the browser and navigate to \"https://www.amazon.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "home page is open",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com/",
      "offset": 39
    }
  ],
  "location": "NewTest.user_open_the_browser_and_navigate_to(String)"
});
formatter.result({
  "duration": 9656903800,
  "status": "passed"
});
formatter.match({
  "location": "NewTest.home_page_is_open()"
});
formatter.result({
  "duration": 42093900,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat stepDefinition.NewTest.home_page_is_open(NewTest.java:34)\r\n\tat ✽.Then home page is open(Features.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": "test1;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user click signin button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "sign in page is open",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close and quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTest.user_click_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.sign_in_page_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.close_and_quit_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4502907600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user open the browser and navigate to \"https://www.amazon.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "home page is open",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com/",
      "offset": 39
    }
  ],
  "location": "NewTest.user_open_the_browser_and_navigate_to(String)"
});
formatter.result({
  "duration": 10034677700,
  "status": "passed"
});
formatter.match({
  "location": "NewTest.home_page_is_open()"
});
formatter.result({
  "duration": 67275600,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat stepDefinition.NewTest.home_page_is_open(NewTest.java:34)\r\n\tat ✽.Then home page is open(Features.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "",
  "id": "test1;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "user click signin button and sign in page is open",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user input no data no User name and Password and hit submit button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Error messages should be dissplayed",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "close and quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTest.user_click_signin_button_and_sign_in_page_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.user_input_no_data_no_User_name_and_Password_and_hit_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.error_messages_should_be_dissplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.close_and_quit_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2844284000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user open the browser and navigate to \"https://www.amazon.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "home page is open",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com/",
      "offset": 39
    }
  ],
  "location": "NewTest.user_open_the_browser_and_navigate_to(String)"
});
formatter.result({
  "duration": 10236800800,
  "status": "passed"
});
formatter.match({
  "location": "NewTest.home_page_is_open()"
});
formatter.result({
  "duration": 41640000,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat stepDefinition.NewTest.home_page_is_open(NewTest.java:34)\r\n\tat ✽.Then home page is open(Features.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "",
  "id": "test1;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "user click signin button and sign in page is open",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user input \"tester@gmail.com\" in User name edit box and no data no to Password and hit submit button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Error message should be dissplayed",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "close and quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTest.user_click_signin_button_and_sign_in_page_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "tester@gmail.com",
      "offset": 12
    }
  ],
  "location": "NewTest.user_input_in_User_name_edit_box_and_no_data_no_to_Password_and_hit_submit_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.error_message_should_be_dissplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.close_and_quit_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3034391300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user open the browser and navigate to \"https://www.amazon.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "home page is open",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com/",
      "offset": 39
    }
  ],
  "location": "NewTest.user_open_the_browser_and_navigate_to(String)"
});
formatter.result({
  "duration": 10935114300,
  "status": "passed"
});
formatter.match({
  "location": "NewTest.home_page_is_open()"
});
formatter.result({
  "duration": 15751400,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat stepDefinition.NewTest.home_page_is_open(NewTest.java:34)\r\n\tat ✽.Then home page is open(Features.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 24,
  "name": "",
  "description": "",
  "id": "test1;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user click signin button and sign in page is open",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user input \"tester@gmail.com\" in User name edit box and \"tester123\" in Password edit box and hit submit button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User navigate to Account page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "close and quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTest.user_click_signin_button_and_sign_in_page_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "tester@gmail.com",
      "offset": 12
    },
    {
      "val": "tester123",
      "offset": 57
    }
  ],
  "location": "NewTest.user_input_in_User_name_edit_box_and_in_Password_edit_box_and_hit_submit_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.user_navigate_to_Account_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.close_and_quit_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3010052100,
  "status": "passed"
});
});