Feature: Expedia

@smoke
Scenario:
When User open chrome browser and navigate to "https://www.expedia.com/"
Then Home page is open and Title wil contain "Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacations" text

@smoke
Scenario:
When User clicks Flight button user nanvigated to Book Flight window
Then "Flying from" and "Flying to" boxes are displayed

@regression
Scenario:
When user tape "Washington" in Flying from recommended choise will displayed and user click First option "Washington, DC (IAD-Washington Dulles Intl.)"
When user tape "Paris" in Flying To recommended choise will displayed and user click First option "Paris, France (XDT-Charles de Gaulle Airport TGV Train Station)" will appear in Flying to edit box
Then user close and quit the browser

