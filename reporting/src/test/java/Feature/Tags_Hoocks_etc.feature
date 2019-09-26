Feature: How tags and hooks works

@Regrsssion
Scenario: Using hooks1
Given open the browser
When navigate to www.demoaut,com
Then home page is displayed

@Regrsssion
Scenario: Using hooks2
Given open the browser navigate to www.demoaut,com home page is displayed
When Click on SIGN_ON button 
Then SIGN_ON is displayed

@Regrsssion
Scenario: Using hooks3
Given open the browser navigate to www.demoaut,com home page is displayed
When Click on REGISTER button 
Then REGISTER is displayed

@Smoke
Scenario: Using hooks4
Given open the browser navigate to www.demoaut,com home page is displayed
When Click on SUPPORT button 
Then SUPPORT is displayed

@Smoke
Scenario: Using hooks5
Given open the browser navigate to www.demoaut,com home page is displayed
When Click on CONTACT button 
Then CONTACT is displayed

@Smoke @Regrsssion
Scenario: Using hooks6
Given open the browser navigate to www.demoaut,com home page is displayed
When User enter UN "tester@testr.com", PW"tester132"Click and click on SIGN_IN button 
Then Registred page is displayed

@Smoke @Regrsssion
Scenario: Using hooks7
Given open the browser navigate to www.demoaut,com home page is displayed
When Click on your destination button 
Then YourDestination is displayed

@Smoke @Run4all
Scenario: Using hooks8
Given open the browser navigate to www.demoaut,com home page is displayed
When Click on featured vacation destinations button 
Then Featured vacation destinations is displayed