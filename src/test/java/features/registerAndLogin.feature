Feature: Register and Login

  @register_login
  Scenario: Register To System And Login
    When Open register page
    And Input to email textbox
    And Click to submit button
    And Get User and password information
    And Back to Login page
    Then submit valid infor to login form