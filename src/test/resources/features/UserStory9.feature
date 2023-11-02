@US9
Feature: Error messages for invalid integers into the repeat Every input

  User Story:
  As a user, I should see error messages when I enter an invalid integer into the calender repeat day input box

  Background: User is already in the login page
    Given user is on the login page

  @US9_AC1_TC1
  Scenario Outline: Users should see error message for entering integer less than 1
    When the users logged in as "<userType>"
    And user hovers over Activities module and clicks the Calender Events
    And user clicks on the Create Calender Event button
    And user selects the Repeat checkbox
    And user clears the Calender event repeat field
    When user enters a number less than 1
    Then user should see "The value have not to be less than 1."


    Examples:
      | userType     |
      | driver       |
      | storemanager |
      | salesmanager |

  @US9_AC1_TC2
  Scenario Outline: Users should see error message for entering integer more than 99
    When the users logged in as "<userType>"
    And user hovers over Activities module and clicks the Calender Events
    And user clicks on the Create Calender Event button
    And user selects the Repeat checkbox
    And user clears the Calender event repeat field
    When user enters a number more than 99
    Then user should see "The value have not to be more than 99."


    Examples:
      | userType     |
      | driver       |
      | storemanager |
      | salesmanager |