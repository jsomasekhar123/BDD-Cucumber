@Execute
Feature: login logout Functionality
  Scenario: Verify LoginlogoutFunctionality
    Given I launch the browser
    And I navigate to Actitime Page
    When I enter user username
    When  I enter the password
    And I click on the login button
    And I clicked the flyout window
    And I clicked the logout button
    And I close the apllication