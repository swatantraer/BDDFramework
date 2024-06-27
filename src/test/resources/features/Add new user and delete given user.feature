Feature: Launch Chrome Browser Add and delete user
  As a user
  I want to add a new user 
  and delete the given user

  @all @tag1
  Scenario Outline: Add a user and validate the user has been added to the table
    Then The page title should be "<pageTitle>"
    And I verify the Add User link displayed
    When I add new user with name "<userName>" fName "<fName>" companyName "<companyName>" role "<role>" email "<email>" phone "<phone>"
    Then I verify the new user "<userName>" is added

    Examples: 
      | pageTitle                               | userName | fName     | companyName | role     | email            | phone      |
      | Protractor practice website - WebTables | uxuser   | firstName | Company AAA | Customer | uxuser@gmail.com | 9100119911 |

  @all @tag2
  Scenario Outline: Delete the user from the table and validate the user has been deleted
    Then The page title should be "<pageTitle>"
    And I verify the Add User link displayed
    When I delete user by name "<userName>"
    Then I verify the user "<userName>" is deleted

    Examples: 
      | pageTitle                               | userName |
      | Protractor practice website - WebTables | novak    |
