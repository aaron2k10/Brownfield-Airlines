package com.stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.page.objects.BrownFieldAirline;
//import com.page.objects.BrownFieldAirline;
import com.page.objects.TicketBookingPage;
import com.utilities.AutomationBase;
import com.utilities.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TicketBookingTestCases extends Utility{
	
	
	public TicketBookingTestCases(WebDriver driverInstance){
        super(driverInstance);
    }
    public TicketBookingTestCases(){
    }

	
	@Given("when the user present in the flight ticket booking page")
	public void when_the_user_present_in_the_flight_ticket_booking_page() throws Exception {
		
		com.page.objects.BrownFieldAirline.launchApp();
		
	}
	   
	@When("user enters the passenger firstt name {string}")
	public void user_enters_the_passenger_firstt_name(String passengerFirstName) {
		
		com.page.objects.TicketBookingPage.enterPassengerFirstName(passengerFirstName);
		
	    
	}

	@Then("passenger name displayed")
	public void passenger_name_displayed() {
		boolean result = com.page.objects.TicketBookingPage.checkPassengerFirstName();
	    assertEquals(result, false);
		
		driver.quit();
	    
	}
	
	
	@Given("when the user present in theflight ticket booking page")
	public void when_the_user_present_in_theflight_ticket_booking_page() throws Exception {
		com.page.objects.BrownFieldAirline.launchApp();
	}
	
	@When("user enters the passenger lastt name {string}")
	public void user_enters_the_passenger_lastt_name(String passengerLastName) {
		
		com.page.objects.TicketBookingPage.enterPassengerLastName(passengerLastName);
	   
	}

	@Then("passenger age displayed")
	public void passenger_age_displayed() {
		
		boolean result = com.page.objects.TicketBookingPage.checkPassengerLastName();
	    assertEquals(result, false);
		
		driver.quit();
	    
	}
	
	
	
	@Given("when the user present in  the flight ticket booking page")
	public void when_the_user_present_in_the_flight_ticket_booking_page1() throws Exception {
		com.page.objects.BrownFieldAirline.launchApp();
	}

	@When("user clicks the maleradio button")
	public void user_clicks_the_maleradio_button() {
		
		com.page.objects.TicketBookingPage.clickMaleButton();
	    
	}

	@Then("male radio button should be selected")
	public void male_radio_button_should_be_selected() {
		boolean result = com.page.objects.TicketBookingPage.checkMaleRadioButton();
	    assertEquals(result, true);
		
		driver.quit();
	}
	
	@Given("when the user present in the  flight ticket booking page")
	public void when_the_user_present_in_the_flight_ticket_booking_page11() throws Exception {
		com.page.objects.BrownFieldAirline.launchApp();
	    
	}

	@When("user clicks the femaleradio button")
	public void user_clicks_the_femaleradio_button() {
		com.page.objects.TicketBookingPage.clickFemaleButton();
	    
	}

	@Then("female radio button should be selected")
	public void female_radio_button_should_be_selected() {
		boolean result = com.page.objects.TicketBookingPage.checkFemaleRadioButton();
	    assertEquals(result, true);
		
		driver.quit();
	   
	}
	@Given("when  the user presentthe flight ticket booking page")
	public void when_the_user_presentthe_flight_ticket_booking_page() throws Exception {
		com.page.objects.BrownFieldAirline.launchApp();
	    
	}
	
	@When("user enter missing passenger details {string} and {string}")
	public void user_enter_missing_passenger_details_and(String passengerFirstName, String passengerLastName) {
		
		com.page.objects.TicketBookingPage.enterPassengerFirstName(passengerFirstName);
		com.page.objects.TicketBookingPage.enterPassengerLastName(passengerLastName);
		
		com.page.objects.TicketBookingPage.clickConfirmButton();
		
		
	}

	@Then("error message should be displayed")
	public void error_message_should_be_displayed() {
	    
		boolean result = com.page.objects.TicketBookingPage.checkInvalidBookingButton();
	    assertEquals(result, true);
		
		driver.quit();
	}
	
	@Given("when the user present in the flight ticket bookingpage")
	public void when_the_user_present_in_the_flight_ticket_bookingpage() throws Exception {
		com.page.objects.BrownFieldAirline.launchApp();
	    
	}

	@When("user enterpassenger details {string} and {string}")
	public void user_enterpassenger_details_and(String passengerFirstName, String passengerLastName) {
		com.page.objects.TicketBookingPage.enterPassengerFirstName(passengerFirstName);
		com.page.objects.TicketBookingPage.enterPassengerLastName(passengerLastName);
		
		com.page.objects.TicketBookingPage.clickConfirmButton();
	}

	@Then("passenger details added")
	public void passenger_details_added() {
		boolean result = com.page.objects.TicketBookingPage.checkValidBookingButton();
	    assertEquals(result, true);
		
		driver.quit();
	}
	
	@Given("when the user present in the flight ticket bookingg page")
	public void when_the_user_present_in_the_flight_ticket_bookingg_page() {
	   
	}

	@When("user clicks the add in button")
	public void user_clicks_the_add_in_button() {
	    
	}

	@Then("new passenger text field creates")
	public void new_passenger_text_field_creates() {
	    
	}
	
	@Given("when the user present in the flight ticket bookin page")
	public void when_the_user_present_in_the_flight_ticket_bookin_page() {
	    
	}

	@When("user clicks the close button")
	public void user_clicks_the_close_button() {
	    
	}

	@Then("passenger tab got closed")
	public void passenger_tab_got_closed() {
	    
	}
	@Given("when the user present in the flight ticket bookinng page")
	public void when_the_user_present_in_the_flight_ticket_bookinng_page() {
	    
	}

	@When("user clicks the close symbol")
	public void user_clicks_the_close_symbol() {
	   
	}

	@Then("passenger tab closed")
	public void passenger_tab_closed() {
	    
	}

}
