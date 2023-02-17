
Feature: Booking the flight ticket

@passengerfirstname

Scenario Outline: Entering the passenger name
Given when the user present in the flight ticket booking page
When user enters the passenger firstt name "<PassengerFirstName>"
Then passenger name displayed

Examples:

|PassengerFirstName|
|ArunKumar|
|aaron|

@passengerlastname

Scenario Outline: Entering the valid passenger age
Given when the user present in theflight ticket booking page 
When user enters the passenger lastt name "<PassengerLastAge>"
Then passenger age displayed

Examples:

|PassengerLastAge|
|A|
|Charan|


@clickmaleradiobutton

Scenario: Clicking the male radio button
Given when the user present in  the flight ticket booking page
When user clicks the maleradio button
Then male radio button should be selected

@clickfemaleradiobutton

Scenario: Clicking the female radio button
Given when the user present in the  flight ticket booking page
When user clicks the femaleradio button
Then female radio button should be selected


@missingdetails

Scenario Outline: Checking whether the error message is displayed if there any missing details

Given when  the user presentthe flight ticket booking page
When user enter missing passenger details "<PassengerFirstName>" and "<PassengerLastName>"
Then error message should be displayed

    
Examples:
|PassengerFirstName|PassengerLastName|
| [blank] | A |
| aaron |[blank] |



@passengerdetails

Scenario Outline: Checking whether the error message is displayed if there any missing details

Given when the user present in the flight ticket bookingpage
When user enterpassenger details "<PassengerFirstName>" and "<PassengerLastName>"
Then passenger details added


Examples:
|PassengerName|PassengerAge|
|Arunkumar|A|




@closebutton

Scenario Outline: Checking whether the user can close the passenger tab

Given when the user present in the flight ticket bookin page
When user clicks the close button
Then passenger tab got closed

@crossbutton

Scenario Outline: Checking whether the user can exit  the passenger tab

Given when the user present in the flight ticket bookinng page
When user clicks the close symbol
Then passenger tab closed

@addinnewpassenger

Scenario Outline: Checking whether the user can add more than one passenger

Given when the user present in the flight ticket bookingg page
When user clicks the add in button
Then new passenger text field creates

@checkpassengerdetails

Scenario Outline: Checking whether the user can revise the passenger details

Given when the user present in the flight ticket page
When user clicks the Passenger details in button
Then passenger details displayed


@boardingpassbutton

Scenario Outline: Checking whether the user can see boarding pass

Given when the user present in the flightt page
When user clicks the Boarding pass button
Then boarding pass displayed


@selectyourseats

Scenario Outline: Checking whether the user select the seat

Given when the user present in the flightpage
When user clicks the seat which he wants
Then seat got selected


