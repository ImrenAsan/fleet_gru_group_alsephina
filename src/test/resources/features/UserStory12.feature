@US12
Feature: As a user, I want to filter customers’ info on the Account page.

  Background: User is already in the login page
    Given Users is on the login page

  @AC1
  Scenario Outline:
    When the users logged in as "<userType>"
    Then the users see on the "<pageSubtitle>" page
    When the users navigate to "Customers - Accounts"
    Then the users see filter  items on the Accounts page

    |Account Name|
    |Contact Name|
    |Contact Email|
    |Contact Phone|
    |Owner|
    |Business Unit|
    |Created At|
    |Updated At|

    Examples:
      | userType     | pageSubtitle |
      | storemanager | Dashboard    |
      | salesmanager | Dashboard    |