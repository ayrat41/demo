Feature: Facebook
Scenario: Test Login Page
Background:
Given User navigates to login page
When Title of page if "Facebook"
Then User enters username "kamila.aibedullova@gmail.com" and password "Kamila2779"
Then User clicks submit button
Then User on homepage "Facebook"

@SmokeTest
Scenario: Test Messenger
Then User clicks button Messenger and page "Messenger" opens
And User closes browser

@SmokeTest
Scenario: Test Marketplace
Then User clicks button Marketplace and page "Marketplace" opens
And User closes browser

@ SmokeTest @RegressionTest
Scenario: Test Groups
Then User clicks button Groups and page "Group Discovery" opens
And User closes browser

@ SmokeTest @RegressionTest
Scenario: Test Events
Then User clicks button Events and page "Events" opens
And User closes browser

@ SmokeTest @RegressionTest
Scenario: Test Saved
Then User clicks button Saved and page "Saved" opens
And User closes browser



