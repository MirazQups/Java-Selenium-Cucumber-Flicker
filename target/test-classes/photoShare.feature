Feature: Upload Photo Share


  @photoShare
  Scenario Outline: User login and upload a photo
    Given user input email "<Email>"
    And user click on email
    When user input password "<Password>"
    And user click  login button
    And user set a photo "<Photo>"
    And user click on upload btn
    And photo uploaded sucessfully
    Then share a photo

    Examples:
      | Email | Password |Photo|
      | marazislam8@gmail.com | TestCase0101 |C:\Users\S.M.Mohaimanul Islam\Pictures\Saved Pictures/index.jpg|