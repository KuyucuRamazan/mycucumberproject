@customer_login
Feature: customer_login_feature

  Scenario Outline: login_with_customer_credentials

    Given user opens the URL "https://bluerentalcars.com/"
    When user navigate the login page
    And user enters "<username>" and "<password>" then click on login button
    Then verify the login is successful
    Then close the application
    Examples:
      | username                     | password|
      | customer@bluerentalcars.com  | 12345   |
      | customer1@bluerentalcars.com | 12346   |
