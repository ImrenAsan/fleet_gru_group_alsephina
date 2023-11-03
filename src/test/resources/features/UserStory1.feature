@B30G1-152
Feature:As a user, I should be accessing all the main modules of the app

  Background: User is already in the login page
    Given Users is on the login page

  @B30G1-150
  Scenario Outline: Store and sales managers should view 8 module names.
    When the users logged in as "<userType>"
    Then the users see on the "<pageSubtitle>" page
    And user is as "<userType>" user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


    Examples:
      | userType     | pageSubtitle |
      | storemanager | Dashboard    |
      | salesmanager | Dashboard    |

  @B30G1-151
  Scenario Outline: Drivers should view 4 module names
    When the users logged in as "<userType>"
    Then the users see on the "<pageSubtitle>" page
    And user is as "<userType>" user should see following options

      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

    Examples:
      | userType | pageSubtitle    |
      | driver   | Quick Launchpad |



