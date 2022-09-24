@shopping_test
Feature: Shopping_testing

  Scenario Outline: Shopping_Scenario

    Given user opens the URL "http://automationexercise.com"
    Then Verify that home page is visible successfully
    When Click Signup-Login button
    And Enter name as "<name>" and email as "<email>" and click on SignUp Button
    And Fill all details in Signup and create account
    Then Verify ACCOUNT CREATED! and click Continue button
    And Verify  Logged in as username at top
    When Add products to cart
    And Click Cart button
    Then Verify that cart page is displayed
    When Click Proceed To Checkout
    Then Verify that the delivery address and billing address are same
    When Click logout button
    Then Verify that user logged out
    And close the application
    Examples:
      | name | email                         |
      | John | john.doe.12_34599@yahoo.com   |
      | John | john.doe.12_35699@yahoo.co.uk |