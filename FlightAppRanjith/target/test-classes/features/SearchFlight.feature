@Test
Feature: As a user I want search a flight
	@smoke
	Scenario Outline: Verify the user is able to enter the source location
		Given The user launch the app '<App>' and is in the Home page
		When The user types the source location '<source>' in the source location text box
		Then The entered location '<source>' appears in the source location text box
		
    Examples: 
      |	App	| source	|
      |	BrownField	|	Chennai	|
      
  @smoke
	Scenario Outline: Verify the user is able to enter the destination location
		Given The user launch the app '<App>' and is in the Home page
		When The user types the destination location in the destination location '<destination>' text box
		Then The entered location '<destination>' appears in the destination location text box
		
		Examples: 
      |	App	|	destination	|
      |	BrownField	|	Chennai	|
		
		
	@date
	Scenario Outline: Verify the user is able to enter the date of travel
		Given The user launch the app '<App>' and is in the Home page
		When The user enters the date of travel '<date>'
		Then The specified date '<date>' should be selected
		
		Examples: 
      |	App	| date  |
      |	BrownField	|	25/01/2022	|
		
	@smoke
	Scenario Outline: Verify the user is able to search the flight
		Given The user launch the app '<App>' and is in the Home page
		When The user types the source location '<source>' in the source location text box
		And The user types the destination location in the destination location '<destination>' text box
		And The user enters the date of travel '<date>'
		And The user clicks the search button
		Then The relevant flights should be displayed
		
		Examples: 
      |	App	|	source	|	destination	| date  |
      |	BrownField	|	Chennai	|	Pune	|	25/01/2022	|
      
	@smoke
	Scenario Outline: Verify the user is not able to search the flight if the fields are empty
		Given The user launch the app '<App>' and is in the Home page
		When The user types the source location '<source>' in the source location text box
		And The user types the destination location in the destination location '<destination>' text box
		And The user enters the date of travel '<date>'
		And The user clicks the search button
		Then The field '<missing>' should not be empty message should be displayed
		
		Examples: 
      |	App	|	source	|	destination	| date  |	missing	|
      |	BrownField	||	Pune	|	25/01/2022	|source	|
      