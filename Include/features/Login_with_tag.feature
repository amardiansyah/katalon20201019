#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Test login functionality

  @smoke
  Scenario Outline: Check login with valid credentials
    Given user is on login page
    When user enters <username> and <password> from data
    And clicks on login button
    Then check this message on the homepage

    @valid
    Examples: 
      | username | password |
      | Admin | admin123 |

    @invalid
    Examples: 
      | username | password |
      | Admin123 | admin111 |
      | aadddmin | adminCoy |
