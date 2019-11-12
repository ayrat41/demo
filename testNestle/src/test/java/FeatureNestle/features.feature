
Feature: TesNestle




Scenario: Test Our Stories
Given User navigates "https://www.nestle.com/"
When Title of page is "Home | Nestlé Global"
Then User clicks button "Our stories"
Then Title is "Our stories | Nestlé Global"
Then User exit browser

Scenario: Test Our Impact
Given User navigates "https://www.nestle.com/"
When Title of page is "Home | Nestlé Global"
Then User clicks "Our impact" and chooses "Our ambitions"
Then User clicks "Helping children live healthier lives" and chooses "Nestlé for Healthier Kids global initiative"
Then Title of page is "Nestlé for Healthier Kids | Nestlé Global"
Then User exit browser

Scenario: Test Brands
Given User navigates "https://www.nestle.com/"
When Title of page is "Home | Nestlé Global"
Then User clicks "Brands" and chooses "Baby foods"
Then Title of page is "Baby foods | Nestlé Global"
Then User exit browser

Scenario: Test Innovation
Given User navigates "https://www.nestle.com/"
When Title of page is "Home | Nestlé Global"
Then User clicks "Innovation" and chooses "Our vision"
Then Title of page is "Our vision | Nestlé Global"
Then User exit browser

Scenario: Test Careers
Given User navigates "https://www.nestle.com/"
When Title of page is "Home | Nestlé Global"
Then User clicks "Careers" and chooses "Go to Careers"
Then Title of page is "Nestlé Global Jobs | Careers" 
Then User exit browser









  #
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
