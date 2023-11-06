@B30G1-175
Feature: As a user, I should be able to select any vehicle from the Vehicle page

  Background: User logs in
    Given Users is on the login page

  @B30G1-166

  Scenario Outline: User logs in as different User Types
    Given  the users logged in as "<userType>"
    When the user hovers Fleet and clicks on veichle
    Then the user checks whether all the checkboxes are unchecked

    Examples:
      | userType     |
      | storemanager |
      | salesmanager |

  @B30G1-167

  Scenario Outline: User logs in as different User Types
    Given  the users logged in as "<userType>"
    When the user hovers Fleet and clicks on veichle
    And the user clicks first checkbox to check all the checkboxes
    Then the user ensures that all the checkboxes are checked

    Examples:
      | userType     |
      | storemanager |
      | salesmanager |

  @B30G1-168
  Scenario Outline: User logs in as different User Types
    Given  the users logged in as "<userType>"
    When the user hovers Fleet and clicks on veichle
    Then user selects any veichle checkbox


    Examples:
      | userType     |
      | storemanager |
      | salesmanager |

