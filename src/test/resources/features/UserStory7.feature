@US7
Feature: As a user, I should be able to select any vehicle from the Vehicle page

  Background: User logs in
    Given Users is on the login page

  Scenario Outline: User logs in as different User Types
    Given  the users logged in as "<userType>"
    And the user hovers Fleet and clicks on veichle
    Then user selects any veichle checkbox


    Examples:
      | userType     |
      | driver       |
      | storemanager |
      | salesmanager |
