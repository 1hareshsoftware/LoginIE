@Login


Feature: I want to test Login Feature

  Background: I am on Login Page

  Scenario Outline: Login Feature

    When I enter Username as "<username>"
    And I enter Password "<password>"
    And I click on Login Button
    Then i am not able to login successfully with Message "<errorrmessage>"

    Examples:
      |username         |password        |errorrmessage           |
      |admin            |                |Password cannot be empty|
      #|                 |admin123        |Username cannot be empty|
     #|                 |                |Username cannot be empty|
     # |test987          |admin           |Csrf token validation failed     |
