@Execute
Feature: modify the new Customer Project and delete customer customer Project  functionality
  Scenario: verify new customer modification and new customer delete functionality
    Given I launch the browser
    And I navigate to Actitime Page
    When I enter user username
    When  I enter the password
    And I click on the login button
    And I clicked the flyout window
    And I click on tasks
    And I click on addnew
    And  I click on New Project
    When I give the Project Name
    And I click on Select Customer
    And I select New Customer
    When I give the CustomerName
    And I click on Create Project
    And I click on Created Customer Admin
    And I click on Admin CheckBox
    And I click on Created Customer
    And I click on Active Button
    And I click on Delete Button
    And  I click on Permanent Delete Button
    And I clicked the logout button
    And I close the apllication
