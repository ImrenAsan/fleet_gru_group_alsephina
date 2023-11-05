@yasin4
Feature: access to Vehicle contracts page
  Agile story: As a user, I want to access to Vehicle contracts page

  Background:
    Given user is on the login page


  @AC01
  Scenario Outline: Store manager sales manager should access the Vehicle contracts page.
    When the users logged in as "<userType>"
    And  user hovers over Fleet module and clicks the Vehicle Contracts page
    Then user should access the Vehicle contracts page.



    Examples:
      | userType     |
      | storemanager |
      | salesmanager |


  @AC02
  Scenario: Drivers should NOT able to access the Vehicle contracts page, the app should display “You do not have permission to perform this action.”
    When user logs in as driver with correct credentials
    And  user hovers over Fleet module and clicks the Vehicle Contracts page
    Then driver should be able to see the error message

