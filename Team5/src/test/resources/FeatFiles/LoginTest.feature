
@tag
Feature: Customer Login

 #@tag2
  #Scenario Outline: As a customer, I want to Login to the website
    #Given User is on Homepage of the website
    #When User clicks on Login button
    #And User is navigated to the Login Page
    #When User enters a valid "<emailId>" and "<password>" 
    #And clicks on Submit 
    #Then Alert msg "Login successful" should be displayed 
    #And User should be navigated to homepage of the website
#
#	Examples: 
      #| emailId  								| password 			|
      #| manisha@example.com 		|	Mannu@123 		|
      
 
 #Scenario Outline: As a customer, I want to Login to the website
    #Given User is on Homepage of the website
    #When User clicks on Login button
    #And User is navigated to the Login Page
    #When User enters a invalid "<emailId>" and "<password>" 
    #And clicks on Submit 
    #Then Alert msg "Invalid Creadentials" should be displayed
#
#	Examples: 
      #| emailId  								| password 			|
      #| manisha@example.com 		|	Mannu@1234		|
      #| manisha1@example.com		| Mannu@123 		|
      #| manisha1@example.com 		|	Mannu@1234		|
  #
   @tag2
  Scenario Outline: As an admin, I want to Login to the website
    Given Admin is on Homepage of the website
    When Admin clicks on Login button
    And Admin is navigated to the Login Page
    When Admin enters a valid "<emailId>" and "<password>" 
    And checks the Admin checkbox
    When Admin clicks on submit
    Then Alert msg "Login successful" should be displayed 
    And Admin should be navigated to the Admin Dashboard

	Examples: 
      | emailId  								| password 			|
      | m.lakhe203@gmail.com		|	Manisha@123		|
      
 #
 #Scenario Outline: As an admin, I want to Login to the website
    #Given Admin is on Homepage of the website
    #When Admin clicks on Login button
    #And Admin is navigated to the Login Page
    #When Admin enters a invalid "<emailId>" and "<password>" 
    #And checks the Admin checkbox
    #When Admin clicks on submit
    #Then Alert msg "Invalid Creadentials" should be displayed
#
#
#	Examples: 
      #| emailId  								| password 			|
      #| m.lakhe203@gmail.com		|	Manisha@1234	|
      #| m.lakhe2031@gmail.com		| Manisha@123 		|
      #| m.lakhe2031@gmail.com 		|	Manisha@1234		|
  
