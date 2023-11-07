@B30G1-161
Feature: Create a recurring calender event

  User Story:
  As a user, I want to create a recurring(repetitive) calender event

  Background: User is already in the login page
    #@B30G1-138
    Given user is on the login page

  @B30G1-156
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




  @B30G1-157
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

