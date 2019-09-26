Feature: Demoaut register a user
    @Passed
  Scenario: User saccessful registration
  
    Given Open Chome browser and navigate to http://demoaut.com/
    And click to Register link on fome page
    When User enter to edit boxes : firstname "tester" and lastname "tester" phone "123456789" email "tester@tester.com" click SUBMIT button
    Then User succesfully registred and message should be displayed
    And User close the application
    @Actual
  Scenario: User login and ticket purchasing
    
    Given Open Chome browser and navigate to http://demoaut.com/
    When User login entering: userename "mercury" and password  "mercury" click SUBMIT button
    Then User succesfully loggedin  and Success login message should be displayed
    When User enter data to edit boxes Departing From "Washington" On month "January" Date "19" Arriving In "Paris" Returning On month "January" Date "21"
    And User chose Service class Economy and Airline preference - No preference and Click Continue button
    Then User navigated to Select Flight page and Text messase is displayed
    When User Click to Blue Skies Airlines radio button at depart and User Click to Pangea Airlines radio button at Return and User Click Continue button
    Then User navigated to Book a Flight page and Success message should be displayed
    When User  enter First Name "Tester" and Last name "Tester" and Select "Vegetarian" in meal preferences select box
    And User Select Visa credit card in Card Type select box and enter "123456781" in Number edit box and Select "01" and "2000" from Expiration select boxes in Credit card
    And User enter Firstname "Airat" Middle empty Last name "Aibedullov" in Credit card edit boxes
    And User enter "123 Capucine Blvd 123" to Adress editbox and "Holyhill" to City edit box and "VA" to Province/State edit box and "123459" to Postal code edit box and select "UNITED STATES" from Country select box and click Secure Purchase button
    Then User navigated to purchase conformation "Your itinerary has been booked!" message should be displayed
    And User close the application
    

