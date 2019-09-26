Feature: Demoaut registration with multy data

@Out
Scenario: open browser, navigate to Demoaut.com register 10 different users
Given User Launches the browser and navigates to www.demoaut.com
And User click to Register button and navigates to User registration page
When User enter all the reristration data and verify the browser
|firstname|lastname |phone     |email             |adress          |city      |state|postalcode|country|username|password |confirmpassword|
|testerfn1|testerln1|8664567890|tester1@tester.com|123 Capucin Blvd|Westminser|Ca   |12345     |USA    |tester1 |tester123|tester123      |
|testerfn2|testerln2|1234567650|tester2@tester.com|456 Capucin Blvd|Westminser|Va   |22345     |USA    |tester2 |tester123|tester123      |
|testerfn3|testerln3|6524567890|tester3@tester.com|789 Capucin Blvd|Westminser|Md   |32345     |USA    |tester3 |tester123|tester123      |
|testerfn4|testerln4|7883491890|tester4@tester.com|147 Capucin Blvd|Westminser|Wa   |42345     |USA    |tester4 |tester123|tester123      |
|testerfn5|testerln5|9994567890|tester5@tester.com|369 Capucin Blvd|Westminser|Il   |52345     |USA    |tester5 |tester123|tester123      |
Then user close the browser

@soregistration
Scenario Outline:

Given User Launches the browser and navigates to www.demoaut.com
And User click to Register button and navigates to User registration page
When User enter all the reristration data "<firstname>", "<lastname>", "<phone>", "<email>", "<adress>", "<city>", "<state>", "<postalcode>", "<country>", "<username>", "<password>", "<confirmpassword"> and verify the browser
Then user close the browser

Examples:
|firstname|lastname |phone     |email             |adress          |city      |state|postalcode|country|username|password |confirmpassword|
|testerfn1|testerln1|8664567890|tester1@tester.com|123 Capucin Blvd|Westminser|Ca   |12345     |USA    |tester1 |tester123|tester123      |
|testerfn2|testerln2|1234567650|tester2@tester.com|456 Capucin Blvd|Westminser|Va   |22345     |USA    |tester2 |tester123|tester123      |
|testerfn3|testerln3|6524567890|tester3@tester.com|789 Capucin Blvd|Westminser|Md   |32345     |USA    |tester3 |tester123|tester123      |
|testerfn4|testerln4|7883491890|tester4@tester.com|147 Capucin Blvd|Westminser|Wa   |42345     |USA    |tester4 |tester123|tester123      |
|testerfn5|testerln5|9994567890|tester5@tester.com|369 Capucin Blvd|Westminser|Il   |52345     |USA    |tester5 |tester123|tester123      |