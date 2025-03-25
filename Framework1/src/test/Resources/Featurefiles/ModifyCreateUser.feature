@Execute
Feature: Verify login,logout and Create User Functionality
  Scenario: Verify Create User  Functionality
    Given I launch the browser
    And I navigate to Actitime Page
    When I enter user username
    When  I enter the password
    And I click on the login button
    And I clicked the flyout window
    And I clicked the user usertab
    And I clicked the Adduser
    When I enter the user firstname
    When  I enter the user lastname
    When I enter the gmail
    When I eneter the login username
    When I enter the userpassword
    When I enter the retype password
    And I clicked the create user
    And I click on created user
    When I enter the modify userpassword
    When I enter the modify retypepassword
    And I clicked the create user
    And I click on created user
    And I click on delete button
    And I handle the alert
    And I clicked the logout button
    And I close the apllication

