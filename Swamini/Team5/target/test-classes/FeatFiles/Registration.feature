
@tag
Feature: Customer Registration

  @tag1
  Scenario: As a customer, I want to add my name in oredr to register
    Given User is on homepage of the website
    When User clicks on Register button, 
    And Navigates to the Registration page
   	Then User enters his/her name 
    

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
