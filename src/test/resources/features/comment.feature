Feature: Audience member should be able to comment on post

  Scenario: In order to comment, User should be asked to login or register
    Given user is on BBC post page
    When user wants to comment
    Then user should is asked to signin or register

  Scenario: User is navigated to registraion page when trying to register
    Given user is on BBC post page
    When user wants to comment
    Then user should is asked to signin or register
    When user wants to register
    Then user is navigated to registration page

#    username and password in this scenario are not real username and password. They are just for framework purposes
  Scenario: User is navigated to login page when trying to login
    Given user is on BBC post page
    When user wants to comment
    Then user should is asked to signin or register
    When user wants to login
    Then user is navigated to login page
    When user enters username as "uname"
    And user enters password as "pass"
    And user signs in