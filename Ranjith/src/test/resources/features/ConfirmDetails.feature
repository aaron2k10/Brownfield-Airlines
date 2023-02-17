Feature: As a Guest user I should be able to Enter the details for confrimation

	Scenario Outline: Verify the Guest user is able to enter the FirstName
		Given The user is in the confirm booking page
		When The user enters the First name '<FirstName>' in the first name text box
		Then The First name appears on the text box
		
		Examples:
		|	FirstName |
		| Ranjith |

	Scenario Outline: Verify that the error message is displayed on entering invalid FirstName
		Given The user is in the confirm booking page
		When The user enters the invalid First name '<FirstName>' in the first name text box
		Then The first name is invalid error should be displayed
		
		Examples:
		|	FirstName |
		| 12345 |
		
	Scenario Outline: Verify the Guest user is able to enter the LastName
		Given The user is in the confirm booking page
		When The user enters the Last name '<LastName>' in the Last name text box
		Then The Last name appears on the text box
		
		Examples:
		|	LastName |
		| Kumar |
		
	Scenario Outline: Verify that the error message is displayed on entering invalid Lastname
		Given The user is in the confirm booking page
		When The user enters the invalid Last name '<LastName>' in the Last name text box
		Then The last name is invalid error should be displayed
		
		Examples:
		|	LastName |
		| 123456 |
	
	Scenario Outline: Verify the Guest user is able to enter the Email
		Given The user is in the confirm booking page
		When The user enters the Email Id '<Emailid>' in the emailId text box
		Then The Email Id appears on the text box
		
		Examples:
		|	Emailid |
		| ranjith@gmail.com |

	Scenario Outline: Verify that the error message is displayed on entering invalid EmailId
		Given The user is in the confirm booking page
		When The user enters the invalid Email Id '<Emailid>' in the emailId text box
		Then The EmailId is invalid error should be displayed
		
		Examples:
		|	Emailid |
		| ranjith.com |
		
	Scenario Outline: Verify the Guest user is able to enter the PhoneNumber
		Given The user is in the confirm booking page
		When The user enters the phone number '<PhoneNumber>' in the phone number text box
		Then The phone Number appears on the text box
		
		Examples:
		|	PhoneNumber |
		| 1234567890 |
		
	Scenario Outline: Verify that the error message is displayed on entering invalid PhoneNumber
		Given The user is in the confirm booking page
		When The user enters the invalid phone number '<PhoneNumber>' in the phone number text box
		Then The PhoneNumber is invalid error should be displayed
		
		Examples:
		|	PhoneNumber |
		| ajddjndsj |

	Scenario Outline: Verify the Guest user is able to enter the CardNumber
		Given The user is in the confirm booking page
		When The user enters the Card number '<CardNumber>' in the Card number text box
		Then The Card Number appears on the text box
		
		Examples:
		|	CardNumber |
		| 1234567812345678 |
		
	Scenario Outline: Verify the Guest user is not able to enter the invalid CardNumber
		Given The user is in the confirm booking page
		When The user enters the invalid Card number '<CardNumber>' in the Card number text box
		Then The Card Number should not appear on the text box
		
		Examples:
		|	CardNumber |
		| abcd |

	Scenario Outline: Verify the Guest user is able to enter the CVV number
		Given The user is in the confirm booking page
		When The user enters the CVV number '<CVVNumber>' in the CVV number text box
		Then The CVV Number appears on the text box
		
		Examples:
		|	CVVNumber |
		| 321 |
		
	Scenario Outline: Verify the Guest user is not able to enter the invalid CVV number
		Given The user is in the confirm booking page
		When The user enters the invalid CVV number '<CVVNumber>' in the Card number text box
		Then The CVV Number should not appear on the text box
		
		Examples:
		|	CVVNumber |
		| abcd |
	
	Scenario Outline: Verify the Guest user is able to enter the Expiry Date
		Given The user is in the confirm booking page
		When The user enters the Expiry Date '<ExpiryDate>' in the date box
		Then The Date appears on the date box
		
		Examples:
		|	ExpiryDate |
		| June/2023 |
		
	Scenario Outline: Verify the Guest user is not able to enter the invalid Expiry Date
		Given The user is in the confirm booking page
		When The user enters the invalid Expiry Date '<ExpiryDate>' in the Card number text box
		Then The date should not appear on the text box
		
		Examples:
		|	ExpiryDate |
		| kasklj |
		
		Scenario Outline: Verify the Guest user is not able to proceed further if any of the field is missing
		Given The user is in the confirm booking page
		When The user enters the First name '<FirstName>' in the first name text box
		And The user enters the Last name '<LastName>' in the Last name text box
		And The user enters the Email Id '<Emailid>' in the emailId text box
		And The user enters the phone number '<PhoneNumber>' in the phone number text box
		And The user enters the Card number '<CardNumber>' in the Card number text box
		And The user enters the Expiry Date '<ExpiryDate>' in the date box
		And The user enters the CVV number '<CVVNumber>' in the CVV number text box
		Then The field '<missing>' should not be empty message should be displayed
		
		Examples:
		|	FirstName	|	LastName	|	Emailid	|	PhoneNumber |	CardNumber	|	ExpiryDate	|	CVVNumber |	missing	|
		||	Kumar | ranjith@gmail.com	|	1234567890 | 1234567812345678	|	June/2023	|	321	|	FirstName	|

	Scenario Outline: Verify the Guest user is able to proceed further if all the fields are filled
		Given The user is in the confirm booking page
		When The user enters the First name '<FirstName>' in the first name text box
		And The user enters the Last name '<LastName>' in the Last name text box
		And The user enters the Email Id '<Emailid>' in the emailId text box
		And The user enters the phone number '<PhoneNumber>' in the phone number text box
		And The user enters the Card number '<CardNumber>' in the Card number text box
		And The user enters the Expiry Date '<ExpiryDate>' in the date box
		And The user enters the CVV number '<CVVNumber>' in the CVV number text box
		Then The user should be navigated to the next page
		
		Examples:
		|	FirstName	|	LastName	|	Emailid	|	PhoneNumber |	CardNumber	|	ExpiryDate	|	CVVNumber |
		|	Ranjith	|	Kumar | ranjith@gmail.com	|	1234567890 | 1234567812345678	|	June/2023	|	321	|
