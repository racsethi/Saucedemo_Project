Feature: Product Selection

  Background: Open the Login Page

  Scenario Outline: User is able to select product on product page
    When User enters correct username "<UserName>" and password "<Password>"
    And User clicks on Login Button
    And User add a product "<Product Name>" to the cart
    Then Product should be added to the cart

    Examples: 
      | UserName      | Password     | Product_Name        |
      | standard_user | secret_sauce | Sauce Labs Backpack |
