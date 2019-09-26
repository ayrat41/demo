Feature: Test1

Background:
Given user open the browser and navigate to "https://www.amazon.com/"
Then home page is open

Scenario:
When user click signin button
Then sign in page is open
Then close and quit the browser

Scenario:
Given user click signin button and sign in page is open
When user input no data no User name and Password and hit submit button
Then Error messages should be dissplayed
Then close and quit the browser

Scenario:
Given user click signin button and sign in page is open
When user input "tester@gmail.com" in User name edit box and no data no to Password and hit submit button
Then Error message should be dissplayed
Then close and quit the browser

Scenario:
Given user click signin button and sign in page is open
When user input "tester@gmail.com" in User name edit box and "tester123" in Password edit box and hit submit button
Then User navigate to Account page
Then close and quit the browser

