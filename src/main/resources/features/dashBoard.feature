Feature: add new dashboard tests



 Background: Login to website
    Given I open website url
    When I login using "test@yahoo.com" and "test123"
    When I click in nav button "New Dashboard"

  @US1012
  Scenario: Verify dashboard is displayed
    Then I click in Enter new question
    Then I fill out the field New Dashboard
    Then I click a button Enter
    And I verify is new dashboard is displayed


