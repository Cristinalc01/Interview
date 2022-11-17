Feature: add new dashboard tests



 Background: Login to website
    Given I open website url
    When I login using "admin@yahoo.com" and "admin123"

    When I click in nav button "New Dashboard"




  @US1012
     Scenario: add new dashborad
   When I fill the input dashboard
   Then I click in the button add
   Then I Verify the new dashboard is displayed



