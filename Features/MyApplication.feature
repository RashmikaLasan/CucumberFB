Feature: Test Facebook smoke scenario

  Scenario: Test login with valid credentials
    Given Open firefox
    When Enter user name password
    Then User can login successfully
