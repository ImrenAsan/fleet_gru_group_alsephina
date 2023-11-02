@US8
Feature: Create a recurring calender event

  User Story:
  As a user, I want to create a recurring(repetitive) calender event

  Background: User is already in the login page
    Given user is on the login page

  @US8_AC1
  Scenario Outline: User should see the number "1" by default in the Repeat Every input
  When the users logged in as "<userType>"
    And user hovers over Activities module and clicks the Calender Events
    And user clicks on the Create Calender Event button
    And user selects the Repeat checkbox
    Then user should see the number 1 by default in the Repeat Every input

  Examples:
    | userType     |
    | driver       |
    | storemanager |
    | salesmanager |




  @US8_AC2
  Scenario Outline: User should see an error message "This value should not be blank."
    When the users logged in as "<userType>"
    And user hovers over Activities module and clicks the Calender Events
    And user clicks on the Create Calender Event button
    And user selects the Repeat checkbox
    And user clears the Calender event repeat field
    Then user sees an error message

    Examples:
      | userType     |
      | driver       |
      | storemanager |
      | salesmanager |

