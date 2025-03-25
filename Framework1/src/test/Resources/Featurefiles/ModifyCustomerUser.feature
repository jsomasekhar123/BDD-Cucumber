@Execute
Feature: Create the modify customer and functionality
  Scenario: verify create user modification functionality
    Given I launch the browser
    And I navigate to Actitime Page
    When I enter user username
    When  I enter the password
    And I click on the login button
    And I clicked the flyout window
    And I click on tasks
    And I click on addnew
    And I click on new customer
    When I enter the new customer
    And I click on create customer
    And I click on User1
    And I click on checkbox
    And I click on created customer
    And I click on actions button
    And I click on customerDelete Button
    And I click on permanent customerDelete Button
    And I clicked the logout button
    And I close the apllication