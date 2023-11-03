@B30G1-155
Feature:As a user, I should be access to the Oroinc Documentation page

  Background: User is already in the login page
    Given Users is on the login page

  @B30G1-154
  Scenario Outline:Users access the Oronic Documentation page (https://doc.oroinc.com/) by clicking the question icon.
    When the users logged in as "<userType>"
    Then the users see on the "<pageSubtitle>" page
    When  the user click the question mark
    Then 'https://doc.oroinc.com/' site should be opened


    Examples:
      | userType     | pageSubtitle    |
      | driver       | Quick Launchpad |
      | storemanager | Dashboard       |
      | salesmanager | Dashboard       |