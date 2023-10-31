@seren
@US_13
Feature: Manage filter functionality on the Vehicle Costs page

  Agile Story: As a user, I want to manage filters on the Vehicle Costs page.

  Background:
    Given user is on the login page

  @AC01_TC01
  Scenario: Driver should see 3 columns on the Vehicle Model page.
    When user logs in as driver with correct credentials
    And user hovers over Fleet module and clicks the Vehicle Costs
    Then user should be able to see following columns
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |


  @AC01_TC02
  Scenario: Store manager should see 3 columns on the Vehicle Model page.
    When user logs in as store manager with correct credentials
    And user hovers over Fleet module and clicks the Vehicle Costs
    Then user should be able to see following columns
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

  @AC01_TC03
  Scenario: Sales manager should see 3 columns on the Vehicle Model page.
    When user logs in as sales manager with correct credentials
    And user hovers over Fleet module and clicks the Vehicle Costs
    Then user should be able to see following columns
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

  @AC02_TC01
  Scenario: Driver check the first checkbox to check all the Vehicle Costs
    When user logs in as driver with correct credentials
    And user hovers over Fleet module and clicks the Vehicle Costs
    And user clicks the first checkbox
    Then user should select all the Vehicle Costs

  @AC02_TC02
  Scenario: Store manager check the first checkbox to check all the Vehicle Costs
    When user logs in as store manager with correct credentials
    And user hovers over Fleet module and clicks the Vehicle Costs
    And user clicks the first checkbox
    Then user should select all the Vehicle Costs

  @AC02_TC03
  Scenario: Sales manage check the first checkbox to check all the Vehicle Costs
    When user logs in as sales manager with correct credentials
    And user hovers over Fleet module and clicks the Vehicle Costs
    And user clicks the first checkbox
    Then user should select all the Vehicle Costs