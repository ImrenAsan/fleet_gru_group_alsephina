@yasin4
Feature: access to Vehicle contracts page
  Agile story: As a user, I want to access to Vehicle contracts page

  Background:
    Given user is on the login page

  @AC01
  Scenario Outline: Store manager and Sales manager should access  Vehicle Contracts Page
    When the users logged in as "<userType>"
    And  user hovers over Fleet module and clicks the Vehicle Contracts page
    Then user should access the Vehicle contracts page


    Examples:
      | userType     |
      | storemanager |
      | salesmanager |


  @AC02
  Scenario: Driver should be able to see error message that there is no permission to display the columns above.
    When user logs in as driver with correct credentials
    And  user hovers over Fleet module and clicks the Vehicle Contracts page
    Then user should be able to see the error message
