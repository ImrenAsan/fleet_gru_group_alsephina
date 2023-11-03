@B30G1-133
Feature: Web Table on Vehicle Model Page
  Agile story: As a user, I want to view columns on Vehicle Model page.

  Background:
    Given user is on the login page

  @B30G1-131
  Scenario Outline: Store manager should be able to see 10 columns on Vehicle Model Page
    And the users logged in as "<userType>"
    When user hovers over Fleet module and clicks the Vehicle Model page
    Then user should be able to see columns below on the page

      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |


    Examples:
      | userType     |
      | storemanager |
      | salesmanager |


    @B30G1-132
    Scenario: Driver should be able to see error message that there is no permission to display the columns above.
      And user logs in as driver with correct credentials
      When user hovers over Fleet module and clicks the Vehicle Model page
      Then user should be able to see the error message
