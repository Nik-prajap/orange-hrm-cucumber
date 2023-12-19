@authorTeam-Java @regression
Feature: Verify the login feature

  @sanity @smoke
  Scenario: Verify the user should login successfully
    Given I am on Login page
    When I am using valid credential
    And Enter login username
    And Enter login password
    And Click on Login Button

  @sanity
  Scenario: Verify that the logo display on home page
    Given I am on Login page
    When I am using valid credential
    And Enter login username
    And Enter login password
    And Click on Login Button

  @smoke
  Scenario: Verify user should logout successfully
    Given I am on Login page
    When I am using valid credential
    And Enter login username
    And Enter login password
    And Click on Login Button
    And Click on User Profile logo
    And Mouse hover on Logout and click
    Then Verify the text "Login" is displayed

  @sanity
  Scenario Outline: Verify error message with invalid credentials
    Given I am on Login page
    And Enter username "<username>"
    And Enter password "<password>"
    And Click on Login Button
    Then Verify Error message "<errorMessage>"
    Examples:
      | username          | password | errorMessage        |
      |                   |          | Required            |
      | test123@gmail.com |          | Required            |
      |                   | test123  | Required            |
      | test123@gmail.com | test123  | Invalid credentials |