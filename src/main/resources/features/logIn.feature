Feature: Login page tests

  @US1000
  Scenario: Login to website
    Given I open website url
    When I login using "test@yahoo.com" and "test123"