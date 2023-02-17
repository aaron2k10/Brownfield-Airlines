@Test
Feature: As an employee I want update the flight in to the database

	@smoke
	Scenario Outline: Verify the user is able to enter the flight number
		Given The user launch the app '<App>' and goes to the Update aeroplane tab
		When The user enters the flight number '<flightNo>' in the flight number text box
		Then The entered flight number '<flightNo'> appears on the text box
		
		Examples:
		|	App	|	flightNo	|
		|	BrownField	|	616E	|
		
	@smoke
	Scenario Outline: Verify the user is able to enter the number of business class seats
		Given The user launch the app '<App>' and goes to the Update aeroplane tab
		When The user enters the  number of business class seats '<businessSeats>'in the business class text box
		Then The entered number of business class seats '<businessSeats'> appears on the text box

		Examples:
		|	App	|	businessSeats	|
		|	BrownField	|	90	|

	@smoke
	Scenario Outline: Verify the error message is displayed on entering invalid number of business class seats
		Given The user launch the app '<App>' and goes to the Update aeroplane tab
		When The user enters the invalid number of business class seats '<businessSeats>' in the business class text box
		Then The error message appears on the screen
	
		Examples:
		|App|	businessSeats	|
		|	BrownField	|	abcd	|

	@smoke
	Scenario Outline: Verify the user is able to enter the number of economy class seats
		Given The user launch the app '<App>' and goes to the Update aeroplane tab
		When The user enters the  number of economy class seats '<economySeats>' in the economy class text box
		Then The entered number of economy class seats '<economySeats'> appears on the text box
		
		Examples:
		|	App	|	economySeats	|
		|	BrownField	|	100	|

	@smoke
	Scenario Outline: Verify the error message is displayed on entering invalid number of economy class seats
		Given The user launch the app '<App>' and goes to the Update aeroplane tab
		When The user enters the invalid number of economy class seats '<economySeats>' in the business class text box
		Then The error message appears on the screen

		Examples:
		|	App |	economySeats	|
		|	BrownField	|	abcd	|

	@smoke
	Scenario Outline: Verify the user is able to choose the type of flight
		Given The user launch the app '<App>' and goes to the Update aeroplane tab
		When The user select the type of flight '<flightType>' 
		Then The radio button of the respective type '<flightType>' is selected
		
		Examples:
		|	App	|	flightType	|
		|	BrownField	|	cargo	|
		|	BrownField	|	customer	|
		
	@smoke
	Scenario Outline: Verify the user is able to add the aeroplane when all details are filled
		Given The user launch the app '<App>' and goes to the Update aeroplane tab
		When The user enters the flight number '<flightNo>' in the flight number text box
		And The user enters the  number of business class seats '<businessSeats>'in the business class text box
		And The user enters the  number of economy class seats '<economySeats>' in the economy class text box
		And The select the type of flight '<flightType>' 
		And The clicks on add button
		Then The aeroplane should be added to the database
		
		Examples:
		|	App	|	flightNo	|	businessSeats	|	economySeats	|	flightType	|
		|	BrownField	|	616E	|	90	|	100	|	cargo	|
		
	@smoke
	Scenario Outline: Verify the user is gets an error message if any of the fields is empty
		Given The user launch the app '<App>' and goes to the Update aeroplane tab
		When The user enters the flight number '<flightNo>' in the flight number text box
		And The user enters the  number of business class seats '<businessSeats>'in the business class text box
		And The user enters the  number of economy class seats '<economySeats>' in the economy class text box
		And The user select the type of flight '<flightType>' 
		And The user clicks on add button
		Then The field '<missing>' should not be empty message appears
		
		Examples:
		|	App	|	flightNo	|	businessSeats	|	economySeats	|	flightType	|	missing |
		|	BrownField	|	616E	|	90	|	100	|	cargo	|	flight |

	