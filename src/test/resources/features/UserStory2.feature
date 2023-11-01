@US2
Feature:

  Background: User is already in the login page
    Given Users is on the login page

  @AC1
  Scenario Outline:
    When the users logged in as "<userType>"
    Then the users see on the "<pageSubtitle>" page
    When  the user click the question mark
    Then 'https://doc.oroinc.com/' site should be opened


    Examples:
      | userType     | pageSubtitle    |
      | driver       | Quick Launchpad |
      | storemanager | Dashboard       |
      | salesmanager | Dashboard       |