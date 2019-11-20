Feature: Test Facebook

Scenario: Test login page
Given User navigates to page "http://facebook.com"
When Title of page is "Facebook – log in or sign up"
Then User enters username "kamila.aibedullova@gmail.com" and password "Kamila2779" and clicks submit button
Then Page with title "(17) Facebook" is displayed