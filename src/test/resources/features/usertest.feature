@author_Team-Java @regression
Feature: Verify the user page

  @sanity @smoke
  Scenario: Admin should add user successfully
    Given I am on Login page
    When Login to Application
    And Enter login Username
    And Enter login Password
    And Click on login button
    And Click On Admin
    And Verify Text 'System Users'
    And Click On Add button
    And Verify Text for 'Add User'
    And Click on username dropdown
    And Select User Role Admin
    And Enter Employee Name Peter Mac Anderson
    And Enter Username
    And Click on status drop down
    And Select status Disable
    And Enter password
    And Enter Confirm Password
    And Click On Save Button
    Then Verify message for success "Successfully Saved"

  @sanity
  Scenario: Search the user created and verify it
    Given I am on Login page
    When Login to Application
    And Enter login Username
    And Enter login Password
    And Click on login button
    And Click On Admin
    And Verify Text 'System Users'
    And Enter Username to add user
    And Click on Search Button

  @smoke
  Scenario: Verify that admin should delete the user successfully
    Given I am on Login page
    When Login to Application
    And Enter login Username
    And Enter login Password
    And Click on login button
    And Click On Admin
    And Verify Text 'System Users'
    And Enter Username to add user
    And Click on Search Button
    And Verify the User should be in Result list.
    And Click on Check box
    And Click on Delete Button
    And Popup will display
    And Click on Ok Button on Popup
    Then verify message "Successfully Deleted"

  @sanity
  Scenario Outline: Search the user and verify the message record found
    Given I am on Login page
    When Login to Application
    And Enter login Username
    And Enter login Password
    And Click on login button
    And Click On Admin
    And Verify Text 'System Users'
    And Enter Username "<username>"
    And Select User Role "<userRole>"
    And Select Status "<status>"
    And Click on Search Button
    And verify message "(1) Record Found"
    Then Click on Reset Tab
    Examples:
      | username        | userRole  | employeeName          | status |
      | Admin           | Admin     | Paul Collings         | Enable |
      | Cassidy.Hope    | ESS       | Cassidy Hope          | Enable |
      | Nina.Patel      | ESS       | Nina Patel            | Enable |
      | Odis.Adalwin    | Admin     | Odis Adalwin          | Enable |