@tag1
Feature: Customer Registration

  @tag1
  Scenario Outline: As a customer, I want to add my name in oredr to register
    Given User is on homepage of the website
    When User clicks on Register button, 
    Then User is navigated to the Registration page
   	When User enters "<first name>" and "<last name>" 
   	Then Error msg should be displayed if user adds digits in the field
    Examples: 
      |first name	|last name 	|
      |Swamini		|Sontakke		| 
      |Riya1			|Sony				|
      |Riya				|Sony1			|
      
  #@tag1
  #Scenario Outline: As a customer, I want to add my name in oredr to register
    #Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #When User clicks on first name but leaves it empty
    #And enters "<last name>" without entering the first name
    #Then Error Msg should be displayed
#
    #Examples: 
      #| last name  | 
      #| Sontakkke	 | 
    #@tag1   
    #Scenario Outline: As a customer, I want to enter my emailId in oredr to register
    #Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #When User enters email as"<emailId>" 
    #Then Error message is displayed if email format is not proper
    #Examples: 
    #|first name	|last name 	| emailId 				| 
      #|Swamini		|Sontakke		| swamini21@gmail.com 	|  
      #|Riya				|Sony				|	abc@gmail							|
      #|Riya				|Sony				|	ajio.com							|
      #
   #	@tag1
    #Scenario Outline: As a customer, I want to add my mobno in oredr to register
    #Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #When User enters mobile no as "<mobile number>" 
    #Then Error message is displayed if number is not equal to ten
    #Examples: 
      #|first name	|last name 	| mobile number | 
      #|Swamini		|Sontakke		| 7972597758	 	|  
      #|Riya				|Sony				|	981276345			|
      #|Riya				|Sony				|	91028374651		|
#	@tag1
   #Scenario Outline: As a customer, I want to add my password in oredr to register
    #Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #When User enters Password as"<password>"
    #Then Error message is displayed if it is of inproper format
    #Examples: 
    #|password|
    #|Swamini21|
    #|Swaminis|
    #|Swami21|
    #|swamini21|
    #|SWAMINI21|
    #
    #@tag1
    #Scenario Outline: As a customer, I want to confirm my password in oredr to register
    #Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #When User enters Password as"<password>" and confirms "<confPassword>"
    #Then Error message is displayed if the password dont match
    #Examples:
    #|password	|confPassword	|
    #|Swamini21|Swamini21		|
    #|Swaminis	|Swaminis21		|
    #
    #@tag1
    #Scenario Outline: As a customer, I want to select my gender in oredr to register
    #Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #Then User is able to select the respective "<gender>" radio button
    #Examples:
    #|gender|
    #|female|
    #|male|
    #|other|
    #
    #@tag1
    #Scenario Outline: As a customer, I want to register myself without entering First Name
    #Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #When User enters Last Name as "<last name>" ,EmailId as "<emailId>" ,Mobile No as "<mobile number>" ,Password as "<password>" ,confirms as "<confPassword>" , Gender as "<gender>" 
 #		And Leaves First Name empty and clicks Submit
 #		Then Error msg should be displayed for empty First Name
    #Examples:
    #|last name 	| emailId 						| mobile number	|password	|confPassword	|gender|
   #	|Sontakke		| swamini21@gmail.com | 7972597758		|Swamini21|Swamini21		|female|
      #
      #@tag1
    #Scenario Outline: As a customer, I want to register myself without entering Last Name
    #Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #When User enters First Name as "<first name>" ,EmailId as "<emailId>" ,Mobile No as "<mobile number>" ,Password as "<password>" ,confirms as "<confPassword>" , Gender as "<gender>" 
 #		And Leaves Last Name empty and clicks Submit
 #		Then Error msg should be displayed for empty Last Name
    #Examples:
    #|first name 	| emailId 						| mobile number	|password	|confPassword	|gender|
   #	|Swamini	| swamini21@gmail.com | 7972597758		|Swamini21|Swamini21		|female|
   #	
     #@tag1
    #Scenario Outline: As a customer, I want to register myself without entering Email Id
    #Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #When User enters First Name as "<first name>",Last Name as "<last name>" ,Mobile No as "<mobile number>" ,Password as "<password>" ,confirms as "<confPassword>" , Gender as "<gender>" 
 #		And Leaves Email empty and clicks Submit
 #		Then Error msg should be displayed for empty email
    #Examples:
    #|first name |last name	| mobile number	|password	|confPassword	|gender|
   #	|Swamini		|Sontakke		| 7972597758		|Swamini21|Swamini21		|female|
   #	
   #	@tag1
    #Scenario Outline: As a customer, I want to register myself without entering Mobile Number
    #Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #When User enters First Name as "<first name>",Last Name as "<last name>" ,EmailId as "<emailId>" ,Password as "<password>" ,confirms as "<confPassword>" , Gender as "<gender>" 
 #		And Leaves Mobile number empty and clicks Submit
 #		Then Error msg should be displayed for empty mobile number
    #Examples:
    #|first name |last name	| emailId							|password	|confPassword	|gender|
   #	|Swamini		|Sontakke		| swamini21@gmail.com |Swamini21|Swamini21		|female|
   #	
   #	@tag1
    #Scenario Outline: As a customer, I want to register myself without specifying the Gender
    #Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #When User enters First Name as "<first name>",Last Name as "<last name>" ,EmailId as "<emailId>" ,Mobile No as "<mobile number>" , Password as "<password>" ,confirms as "<confPassword>"
 #		And Leaves Gender empty and clicks Submit
 #		Then Error msg should be displayed for empty gender selection
    #Examples:
    #|first name |last name	| emailId							| mobile number	|password	|confPassword	|
   #	|Swamini		|Sontakke		| swamini21@gmail.com |7972597758		|Swamini21|Swamini21		|
   #	
   #	@tag1
    #Scenario Outline: As a customer, I want to register myself 
    #Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #When User enters First Name as "<first name>",Last Name as "<last name>" ,EmailId as "<emailId>" ,Mobile No as "<mobile number>" ,Password as "<password>" ,confirms as "<confPassword>" , Gender as "<gender>" 
 #		And Clicks Submit
 #		Then Acknowledgment alert should be displayed
    #Examples:
    #|first name |last name	| mobile number	| emailId							|password	|confPassword	|gender|
   #	|Swamini		|Sontakke		| 7972597758		|swamini21@gmail.com |Swamini21|Swamini21		|female|
   	
   		
   #	@tag1
    #Scenario Outline: As a customer, I want to register myself without entering Mobile Number
    #Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #When User enters First Name as "<first name>",Last Name as "<last name>" ,EmailId as "<emailId>" ,Mobile No as "<mobile number>"  , Gender as "<gender>" 
 #		And Leaves Mobile number empty and clicks Submit
 #		Then Error msg should be displayed for empty mobile number
    #Examples:
    #|first name |last name	| emailId							|password	|confPassword	|gender|
   #	|Swamini		|Sontakke		| swamini21@gmail.com |Swamini21|Swamini21		|female|
		    
		 
		
#		@tag1
#		Scenario: As a customer, I want to select my date of birth in oredr to register
#		Given User is on homepage of the website
    #When User clicks on Register button,
    #Then User is navigated to the Registration page
    #When User selects DOB
    #Then DOB should be atleast eighteen years prior to current date
    #Examples:
    #|DOB|
    #|02212000|
  
    