Feature: Flight Handling
#
  #@tag2
  #Scenario Outline: As an admin, I want to view the scheduled flights
    #Given Admin is on the homepage
    #When Admin logs in with "<emailId>" and "<password>"
    #And is on the dashboard page
    #When Admin clicks on View Flights option
    #Then All scheduled flghts should be displayed
    #
    #Examples:
    #| emailId  								| password 			|
    #| m.lakhe203@gmail.com		|	Manisha@123		|

@tag2
  Scenario Outline: As an admin, I want to view the scheduled flights
    Given Admin is on the homepage
    When Admin logs in with "<emailId>" and "<password>"
    And is on the dashboard page
    When Admin clicks on View Flights option
    Then All scheduled flghts should be displayed
    When Admin searches an existing flight using "<flightNo>"
    Then only the searched flight should be displayed
Examples:
    | emailId  								| password 			|flightNo|
    | m.lakhe203@gmail.com		|	Manisha@123		|786|
    
    #@tag2
  #Scenario Outline: As an admin, I want to view the scheduled flights
    #Given Admin is on the homepage
    #When Admin logs in with "<emailId>" and "<password>"
    #And is on the dashboard page
    #When Admin clicks on View Flights option
    #Then All scheduled flghts should be displayed
    #When Admin searches a non-existing existing flight using "<flightNo>"
    #Then Flight doesn't exist msg should be displayed
#Examples:
    #| emailId  								| password 			|flightNo|
    #| m.lakhe203@gmail.com		|	Manisha@123		|7|
    
  #@tag2
  #Scenario Outline: As an admin, I want to update the scheduled flights
    #Given Admin is on the homepage
    #When Admin logs in with "<emailId>" and "<password>"
    #And is on the dashboard page
    #When Admin clicks on Update flight option
    #Then Schdeuled flights are displayed
    #And Admin should be able to choose an "<option>" for the Status field
    #
    #Examples:
    #| emailId  								| password 			|option|
    #| m.lakhe203@gmail.com		|	Manisha@123		|On-Time|
    #| m.lakhe203@gmail.com		|	Manisha@123		|Late|
    #| m.lakhe203@gmail.com		|	Manisha@123		|Cancelled|
    
    #@tag2
  #Scenario Outline: As an admin, I want to add a new flight
    #Given Admin is on the homepage
    #When Admin logs in with "<emailId>" and "<password>"
    #And is on the dashboard page
    #When Admin clicks on Add flight option
    #Then Add flight dashboard is displayed
   #	When Admin enters "<flightNumber>" 
   #	And Selects aeroplane no "<aerNo>"
   #	And selects source "<source>" and destination "<dest>" locations
   #	And Selects arrival "<arrHrs>" "<arrMin>" and departure "<deptHrs>" "<deptMin>" time
   #	And Enters Seat no "<no>"
   #	And selects days of flight
   #	And clicks on add
   #	Then acknowledgement pop up should be displayed
    #
    #Examples:
    #| emailId  								| password 			|flightNumber	|aerNo|source		|destination	|arrHrs	|arrMin	|deptHrs|deptMin|no|	
    #| m.lakhe203@gmail.com		|	Manisha@123		|120937A			|786	|Varanasi	|Delhi 				|8			|30			|9			|15			|100|
    #| m.lakhe203@gmail.com		|	Manisha@123		|120937A			|786	|Varanasi	|Varanasi 		|8			|30			|9			|15			|10|
    
    
    

    
