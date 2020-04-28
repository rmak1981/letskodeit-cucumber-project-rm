Feature: Sign up feature

  As a user I want to sign up and log out


  Scenario: User should sign up successfully
    Given   I am on Home Page
    When    I enter full name "Tony Wilson"
    And     I enter random email address
    And     I enter password "abc123"
    And     I enter Confirm password "abc123"
    And     I select check box for terms and conditions
    And     I click on sign up button
#    Then    I sign up successfully

  Scenario: User should log out successfully
    Given   I am on Home Page
    When    I enter full name "Tony Wilson"
    And     I enter random email address
    And     I enter password "abc123"
    And     I enter Confirm password "abc123"
    And     I select check box for terms and conditions
    And     I click on sign up button
#    Then    I sign up successfully
    And     I click on gravatar
    And     I click on log out
    Then    I am on Home Page


