@B30G1-174
Feature: As a user, I want to see edit car info icons from the Vehicle page.

  Background: User is already in the login page
    Given Users is on the login page
  @B30G1-165
  Scenario Outline: User logs in as different User Types
    Given  the users logged in as "<userType>"
    And the user hovers Fleet and clicks on veichle
    Then the user should see edit car info icon


    Examples:
      | userType     |
      | driver       |
      | storemanager |
      | salesmanager |

