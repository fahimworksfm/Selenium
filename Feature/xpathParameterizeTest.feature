@xpath

Feature: Xpath Parameterize

Scenario: Xpath parameterize test

Given User on Expedia homepage
When User selects tab "Flights"
And User click on "Search"
Then User varify the error message "To continue, please correct the 2 errors below."