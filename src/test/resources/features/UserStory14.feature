@seren
@US_14
Feature: Manage filter functionality on the Marketing page

  Background:
    Given user is on the login page

  @AC01_TC01
  Scenario: Store manager should see 3 columns on the Vehicle Model page.
    When user logs in as store manager with correct credentials
    And user hovers over Marketing module and clicks the Campaigns
    And user clicks the Manage filters button
    And user should be able to see following filter options
      | Name      |
      | Code      |
      | Start Date|
      | End Date  |
      | Budget    |
    Then all filter options should checked by default.


  @AC01_TC02
  Scenario: Sales manager should see 3 columns on the Vehicle Model page.
    When user logs in as sales manager with correct credentials
    And user hovers over Marketing module and clicks the Campaigns
    And user clicks the Manage filters button
    And user should be able to see following filter options
      | Name      |
      | Code      |
      | Start Date|
      | End Date  |
      | Budget    |
    Then all filter options should checked by default.

  @AC02_TC01
  Scenario: Store manager should unchecked any amount of boxes.(can check only 1, or multiple)
    When user logs in as store manager with correct credentials
    And user hovers over Marketing module and clicks the Campaigns
    Then user should be unchecked any amount of boxes


  @AC02_TC02
  Scenario: Sales manager should unchecked any amount of boxes.(can check only 1, or multiple)
    When user logs in as sales manager with correct credentials
    And user hovers over Marketing module and clicks the Campaigns
    Then user should be unchecked any amount of boxes