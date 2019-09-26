Feature: Gmail Login
   
#Scenario: Gmail Login no parametrs
    #Given Open Chome browser and navigate to url : "https://www.google.com/"
    #And click to Register link on SignIn page
    #When User enter to edit boxes : phone "5716450138" and password "tester" and click SUBMIT button
    #Then User not logged in and message should be displayed
    #And User close the application
  
Scenario Outline: Gmail Login with parametrs
    Given Open Chome browser and navigate to url : "https://www.google.com/"
    And click to Register link on SignIn page
    When User enter to edit boxes : "<phone>" and "<password>" and click SUBMIT button
    Then User not logged in and message should be displayed
    And User close the application
    
Examples:
|phone     |password|
|5716450138|tester  |
