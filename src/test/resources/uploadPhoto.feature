Feature: Upload Photo

  @upload
  Scenario Outline: User login and upload a photo
    Given user enter email "<Email>"
    And user click email
    When user Enter password "<Password>"
    And user click on login button
    And user set photo "<Photo>"
    And user click upload btn
    Then photo uploaded

    Examples:
      | Email | Password |Photo|
      | marazislam8@gmail.com | TestCase0101 |C:\Users\S.M.Mohaimanul Islam\Pictures\Saved Pictures/index.jpg|