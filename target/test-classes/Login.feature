Feature: Login User

  @login
  Scenario Outline: Check login is Successful with valid credentials
    Given user is in login Page
    When user Enter "<Email>" and "<Password>"
    And click on login button
    Then Home page visible

    Examples:
      | Email | Password |
      | marazislam8@gmail.com | TestCase0101 |