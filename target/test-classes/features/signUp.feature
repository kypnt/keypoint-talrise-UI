Feature: SignUp


  Background:
    Given User is on the sign up page


  Scenario: Try to signup with empty form

    Given the user clicks on sign up link
    When the user clicks the Create My Account button
    Then error message should appear


@wip
  Scenario: Sign up with valid credentials.
    When User enters valid inputs
    Then User should be able to sign up.



