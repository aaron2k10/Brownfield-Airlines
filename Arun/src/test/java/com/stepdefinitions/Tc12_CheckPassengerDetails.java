package com.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.utilities.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tc12_CheckPassengerDetails extends Utility{
	
	
	public Tc12_CheckPassengerDetails(WebDriver driverInstance){
        super(driverInstance);
    }
    public Tc12_CheckPassengerDetails(){
    }
	
	@Given("when the user present in the flight ticket page")
	public void when_the_user_present_in_the_flight_ticket_page() {
	    
	}

	@When("user clicks the Passenger details in button")
	public void user_clicks_the_passenger_details_in_button() {
	    
	}

	@Then("passenger details displayed")
	public void passenger_details_displayed() {
	    
	}

}
