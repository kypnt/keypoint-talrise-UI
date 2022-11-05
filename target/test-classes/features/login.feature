Feature: Login Feature

  @login
  Scenario: Login with Valid Credentials
    Given the user provides valid credentials
    When the user clicks on login button
    Then the user should be able to logged in successfully


  Scenario: Login with invalid Credentials

  Scenario: User tries special characters

  Scenario: User tries empty credentials
