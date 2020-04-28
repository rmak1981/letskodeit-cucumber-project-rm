Feature: Log in and Practice

 As User should Log in and select course successfully

  Scenario: I want to log in successfully
    Given   I am on Home Page
    When    I click on login link
    And     I enter email "ram111@gmail.com"
    And     I enter password "abc123"
    And     I click on log in Button
#    Then    I log in successfully

    Scenario: I want navigate to practice page successfully
      Given I am on Home Page
      When  I click on practice link
      Then  I am on practice page


