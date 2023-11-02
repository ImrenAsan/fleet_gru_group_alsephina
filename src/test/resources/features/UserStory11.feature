@B30G1-137
Feature: Odometer info functionality on Vehicle Odometer page
  Agile Story: As a user, I want to view car odometer info on Vehicles Odometer page

  Background:
    Given user is on the login page

  @B30G1-134
  Scenario Outline: Store manager and sales manager should be able to see error message "You do not have permission to perform this action".
    And the users logged in as "<userType>"
    When user hovers over Fleet module and clicks the Vehicle Odometer page
    Then user displays the error message

    Examples:
      | userType     |
      | storemanager |
      | salesmanager |

  @B30G1-135
    Scenario: Driver should be able to see the default page as 1
      And user logs in as driver with correct credentials
      When user hovers over Fleet module and clicks the Vehicle Odometer page
      Then user displays default page as "1"

  @B30G1-136
  Scenario: Driver should be able to see the View Per Page as 25
    And user logs in as driver with correct credentials
    When user hovers over Fleet module and clicks the Vehicle Odometer page
    Then user displays View Per Page as "25"