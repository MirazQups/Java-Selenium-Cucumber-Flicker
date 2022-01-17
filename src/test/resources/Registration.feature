Feature: User Registration

  @registation
  Scenario Outline: user register Successfully with valid credentials
    Given user is in sign up page
    When user fill "<FirstName>", "<LastName>","<age>", "<Email>" and "<Password>"
    And click on sign up button
    Then Register successfully
    Examples:
      | FirstName | LastName | age | Email | Password |
      | Maraz     |   new    |  25   | maraz@gmail.com | TestCase0101 |
