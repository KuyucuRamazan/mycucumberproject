@data_tables
Feature: data_tables

  Scenario: customer_login
    Given user opens the URL "https://bluerentalcars.com"
    When user navigate the login page
    And user enters username and password
      | username                    | password |
      | customer@bluerentalcars.com | 12345    |
    Then verify the login is successful
    And capture the screenshot
    Then close the application