Feature: Reporting sample Maven+Cucumber
Scenario: Login function Demoaut

Given User open browser and navigates to www.demoaut.com homepage is displayed
When User click to SIGN_ON button SIGN_ON page is displayed
When user input username "tester" and password "tester123" and click submit button
Then Book your flight page is open
Then user close and quit browser

Scenario: Register account

Given User open browser and navigates to www.demoaut.com homepage is displayed
When User click to Register button register page is displayed
When User enters below credentials 
|username|email|
|tester1|tester1@tester.com|tester123|tester123|
|tester2|tester2@tester.com|tester126|tester124|
|tester3|tester3@tester.com|tester125|tester125|
|tester4|tester4@tester.com|tester124|tester126|
And User click submit button
Then Welcome page is displayed
And User close the application