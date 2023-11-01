@seren
@US_14
Feature: Manage filter functionality on the Marketing page

  Background:
    Given user is on the login page

  @AC01
  Scenario Outline: User should see all 5 filter options are checked by default.
    When the users logged in as "<userType>"
    And user hovers over Marketing module and clicks the Campaigns
    And user clicks the Manage filters button
    Then all filter options should checked by default.

    Examples:
      | userType     |
      | storemanager |
      | salesmanager |


  @AC02
  Scenario Outline: User should unchecked any amount of boxes.(can check only 1, or multiple)
    When the users logged in as "<userType>"
    And user hovers over Marketing module and clicks the Campaigns
    And user clicks the Manage filters button
    Then user should be unchecked any amount of boxes

    Examples:
      | userType     |
      | storemanager |
      | salesmanager |

