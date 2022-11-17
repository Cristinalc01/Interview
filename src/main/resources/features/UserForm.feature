Feature: new user form

  Background: Login to website
    Given I open website url
    When I login using "admin@yahoo.com" and "admin123"
    When I click a button Manage Access

    @US1010
      Scenario: visible Manage Access
    Then Manage Access should be visible



  @US1013
    Scenario:  new user form display
      And Verify following input fields are displayed:
        | First Name   |
        | Last Name    |
        | E-mail       |
       Then Verify is "Role" is displayed
       Then Verify is "Batch" is displayedd


      @US1014 @smoke
      Scenario: add new user to DB
        When I fill out the field new user DB:
          | First Name   |  maria |
          | Last Name    |  smith |
          | E-mail       | ms@yahoo.com|
        Then I select Role and Batch
          | Role         | Student     |
          | Batch        | 4           |
        Then I click a button add User
        Then I verify new user is displayed in the table

      @US1015
      Scenario: Filter users in db table
        Then I verify if option filter is display

        @US1016 @smoke
        Scenario: Update user info
          Then I click a button "Action"
          Then I verify button "Edit" is display
          Then I verify button "Delete" is display
          Then I verify button "Reset Password" is display

          @US1017 @smoke
          Scenario: Reset search filter option
            Then I verify button "Show all" is display
            Then I click in search button
            Then I click on "Show all"
            Then I verify if db table is display





