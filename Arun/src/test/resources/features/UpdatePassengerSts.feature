@Test


Feature: Updating passenger status

@searchPassengerName

Scenario: Entering the first name of passenger
Given when the admin present in the search flight page
When admin enters the first name
Then passenger details displayed



@validsearchflight

Scenario: Entering the flight details
Given when the admin present inn the search flight page
When admin enters the flight details
Then redirected to the booking details page


@missingdetailssearchPassenger

Scenario Outline: Entering the flight details with some missing details
Given when the admin present in the searchflight page
When admin enters the flight details with some missing box "<firstname>"
Then error message displayedd

Examples:

|firstname|
| [Blank] |


@luggagecheckin

Scenario: mark the lugguage checkin check box
Given when the admin present in the booking details page
When admin marked the luggage checkin check box
Then checkin marked


@allotingseat

Scenario: Alloting the seat to the passenger
Given when the admin present inthe booking details page
When admin clicked the allot seat button
Then seat number displayed


@boarding

Scenario: Boarding status when the passenger boarded
Given when the admin present in booking details page
When admin clicked the boarding button
Then passenger status should change into boarded


