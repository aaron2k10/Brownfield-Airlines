package com.stepdefinitions;

import com.page.objects.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionSerach {

	@Given("The user launch the app {string} and is in the Home page")
	public void the_user_launch_the_app_and_is_in_the_home_page(String string) throws Exception {
		HomePage.launchApp(string);
	}

	@When("The user types the source location {string} in the source location text box")
	public void the_user_types_the_source_location_in_the_source_location_text_box(String string) {
		HomePage.selectSourceLocation(string);
	}

	@Then("The entered location {string} appears in the source location text box")
	public void the_entered_location_appears_in_the_source_location_text_box(String string) {
	    HomePage.checkIfSelected("source", string);
	}
	@When("The user types the destination location in the destination location {string} text box")
	public void the_user_types_the_destination_location_in_the_destination_location_text_box(String string) {
		HomePage.selectDestinationLocation(string);
	}

	@Then("The entered location {string} appears in the destination location text box")
	public void the_entered_location_appears_in_the_destination_location_text_box(String string) {
	    HomePage.checkIfSelected("destination", string);
	}

	@When("The user enters the date of travel {string}")
	public void the_user_enters_the_date_of_travel(String string) {
		HomePage.selectDate(string);
	}

	@Then("The specified date {string} should be selected")
	public void the_specified_date_should_be_selected(String string) {
	    HomePage.checkIfSelected("date", string);
	}

	@When("The user clicks the search button")
	public void the_user_clicks_the_search_button() {
		HomePage.clickOnSearch();
	}

	@Then("The relevant flights should be displayed")
	public void the_relevant_flights_should_be_displayed() {
		HomePage.checkIfValidSearch("pageTitle");
	}

	@Then("The field {string} should not be empty message should be displayed")
	public void the_field_should_not_be_empty_message_should_be_displayed(String string) {
		HomePage.checkIfError(string);
	}
}
