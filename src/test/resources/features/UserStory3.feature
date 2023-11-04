@yasin3
@US_3
Feature: learn how to use the pinbar.

  Agile Story: As a user, I want to learn how to use the pinbar.

  Background:
    Given user is on the login page

  @AC01
  Scenario Outline:
    When the users logged in as "<userType>"
    And  the users click on the learn how to use space link
    Then user should see how to use Pinbar and use Pin Icon



    Examples:
      | userType     |
      | driver       |
      | storemanager |
      | salesmanager |



  @AC02
  Scenario Outline:
    When the users logged in as "<userType>"
    And  the users click on the learn how to use space link
    Then user should see the image on the page.



    Examples:
      | userType     |
      | driver       |
      | storemanager |
      | salesmanager |















