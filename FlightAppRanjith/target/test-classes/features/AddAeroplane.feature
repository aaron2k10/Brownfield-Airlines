@Test
Feature: As an employee I want add the flight in to the database

	@smoke
	Scenario Outline: Verify the user is able to enter the flight number
		Given The user launch the app '<App>' and goes to the Add aeroplane tab
		When The user enters the flight number '<flightNo>' in the flight number text box
		Then The entered flight number '<flightNo'> appears on the text box
		
		Examples:
		|	App	|	flightNo	|
		|	BrownField	|	616E	|
		
	@smoke
	Scenario Outline: Verify the user is able to enter the number of business class seats
		Given The user launch the app '<App>' and goes to the Add aeroplane tab
		When The user enters the number of seats '<seats>' in the number of seats text box
		Then The entered number of seats '<seats>' appears on the text box

		Examples:
		|	App	|	seats	|
		|	BrownField	|	90	|

	@smoke
	Scenario Outline: Verify the error message is displayed on entering invalid number of business class seats
		Given The user launch the app '<App>' and goes to the Add aeroplane tab
		When The user enters the invalid number of seats '<seats>' in the number of seats text box
		Then The error message appears on the screen below seats
	
		Examples:
		|App|	businessSeats	|
		|	BrownField	|	abcd	|

	@smoke
	Scenario Outline: Verify the user is able to add the aeroplane when all details are filled
		Given The user launch the app '<App>' and goes to the Add aeroplane tab
		When The user enters the flight number '<flightNo>' in the flight number text box
		And The user enters the number of seats '<seats>' in the number of seats text box
		And The user clicks on add button
		Then The aeroplane is added message is displayed
		
		Examples:
		|	App	|	flightNo	|	businessSeats	|	economySeats	|
		|	BrownField	|	616E	|	90	|	100	|
		
	@smoke
	Scenario Outline: Verify the user is gets an error message if any of the fields is empty
		Given The user launch the app '<App>' and goes to the Add aeroplane tab
		When The user enters the flight number '<flightNo>' in the flight number text box
		And The user enters the number of seats '<seats>' in the number of seats text box
		And The user clicks on add button
		Then The field '<missing>' should not be empty message appears
		
		Examples:
		|	App	|	flightNo	|	businessSeats	|	missing |
		|	BrownField	|	616E	|	90	|	flight |

	@summa
	Scenario Outline: Verify the user is able to delete the flight 
		Given The user launch the app '<App>' and goes to the delete aeroplane tab
		When The user presses the delete button
		Then The flight should be deleted
		
		Examples:
		|	App	|
		|	BrownField	|
	