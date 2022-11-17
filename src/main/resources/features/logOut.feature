Feature: Log out page test

Feature: new user form

  Background: Login to website
    Given I open website url
    When I login using "admin@yahoo.com" and "admin123"



  @US1009 @smoke
  Scenario: Logout website
    When verify log out button is display
    When I click in log out button
    Then I should return to login page "https://interview-prep-test.herokuapp.com/login"


