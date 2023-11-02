@seren
@US_13
Feature: Manage filter functionality on the Vehicle Costs page

  Agile Story: As a user, I want to manage filters on the Vehicle Costs page.

  Background:
    Given user is on the login page

  @AC01
  Scenario Outline: Driver should see 3 columns on the Vehicle Model page.
    When the users logged in as "<userType>"
    And user hovers over Fleet module and clicks the Vehicle Costs
    Then user should be able to see following columns
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

    Examples:
      | userType     |
      | driver       |
      | storemanager |
      | salesmanager |

  @AC02
  Scenario Outline: Store manager check the first checkbox to check all the Vehicle Costs
    When the users logged in as "<userType>"
    And user hovers over Fleet module and clicks the Vehicle Costs
    And user clicks the first checkbox
    Then user should select all the Vehicle Costs

    Examples:
      | userType     |
      | storemanager |
      | salesmanager |
