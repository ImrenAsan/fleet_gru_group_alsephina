@B30G1-163
Feature: Write the "Description" after creating a calendar event

  User Story:
  As a user, I want to write the "Description" when I create a calendar event

  Background: User is already in the login page
    #@B30G1-138
    Given user is on the login page

  @B30G1-160
  Scenario Outline: Users should be able to write messages in the Description field on the calendar event page
    When the users logged in as "<userType>"
    And user hovers over Activities module and clicks the Calender Events
    And user clicks on the Create Calender Event button
    Then user should be able to write message in the Description field


    Examples:
      | userType     |
      | driver       |
      | storemanager |
      | salesmanager |