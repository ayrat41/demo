Feature: Login page verification

Background: 
Given User open the browser and navigate to amazon.com
And User click on Your Amazon.com link

@regression
Scenario: Open browser, navigate to www.amazon.com, click to your_amazon.com open login page

Then login page is displayed
And username, pw links and submit button
And close the application

@smoke
Scenario: Login success validation

When User entars valid username "tester13@gmail.com" and pw "tester123" and click sign in
Then verify user is logged in succesfully
And close the application

@soexamples @smoke @regression

Scenario Outline:

When User entars valid username "<email>" and pw "<password>" and click sign in
Then verify user is logged in succesfully
And close the application

Examples:

|email             |password |
|tester1@gfmail.com|tester123|
|tester2@gfmail.com|tester123|
|tester3@gfmail.com|tester123|
|tester4@gfmail.com|tester123|
|tester4@gfmail.com|tester123|

@register
Scenario: Register new user error messages validation

When User enters below credentials verify error messages
|your name|email|password|re-password|
|||||
|tester||||
|tester|tester@tester.com|||
|tester|tester@tester.com|tester123||
|tester|tester@tester.com|tester123|tester123|
And close the application