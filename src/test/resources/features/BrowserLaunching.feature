Feature: Launch Chrome Browser Add and delete user
  As a user
  I want to add a new user 
  and delete the given user
  @all @tag1
  Scenario Outline: Add a user and validate the user has been added to the table
    When I open the URL "<URL>"
    Then The page title should be "<pageTitle>"
    And I verify the Add User link displayed
    When I add new user with name "<userName>"
    Then I verify the new user "<userName>" is added
    
	Examples: 
      | URL 																														| pageTitle 															| userName |
      | http://www.way2automation.com/angularjs-protractor/webtables/   | Protractor practice website - WebTables | uxuser   |
      
      
  @all @tag2
  Scenario Outline: Delete the user from the table and validate the user has been deleted
    When I open the URL "<URL>"
    Then The page title should be "<pageTitle>"
    And I verify the Add User link displayed
    When I delete user by name "<userName>"
    Then I verify the user "<userName>" is deleted
    
	Examples: 
      | URL 																														| pageTitle 															| userName |
      | http://www.way2automation.com/angularjs-protractor/webtables/   | Protractor practice website - WebTables | novak    |
      