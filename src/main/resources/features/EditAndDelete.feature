Feature: Edit and Delete page test

Feature: Interview Section

  Background: Login to website
    Given I open website url
    When I login using "admin@yahoo.com" and "admin123"

    @US1011
    Scenario: edit  in interview section
      When I click a button edit in Do's
      When I edit writing test statement in statement
      When I click on check
      Then I should see my edition

      @US1011a
      Scenario:  delete in interview section
        When I click in the trash button
        Then it should erase
