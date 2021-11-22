@LoginFeature
Feature: Login Feature Scenarios

  Scenario Outline: Verify Login Functionality with correct username and password
    Given User has laumched the Swag Labs Application
    When User enters username "<UserName>"
    And User enters password "<Password>"
    And User clicks on Login Button
    Then User Should be landed on the Products Page

    Examples: 
      | UserName      | Password     |
      | standard_user | secret_sauce |

  Scenario Outline: Negetive Login Feature
    Given User Opened Swag Lab Application
    When User Enters username "<UserName>"
    And User Enter Password "<password>"
    And Clicks on Login Button
    Then User Should Get "<Error>"

    Examples: 
      | UserName      | password | Error                                                                     |
      | standard_user | Test1234 | Epic sadface: Username and password do not match any user in this service |
