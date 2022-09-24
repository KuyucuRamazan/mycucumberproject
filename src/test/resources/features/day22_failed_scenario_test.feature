@failed_scenario
Feature: failed_test_cases

  Scenario: TC_01
    Given user is on the google page
    And user search for "iPhone" on the google
    Then verify test case fails