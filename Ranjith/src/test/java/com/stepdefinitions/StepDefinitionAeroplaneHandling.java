package com.stepdefinitions;

import com.page.objects.AddAerplanePage;
import com.page.objects.HomePage;
import com.page.objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionAeroplaneHandling {

	@Given("The user launch the app {string} and goes to the Add aeroplane tab")
	public void the_user_launch_the_app_and_goes_to_the_add_aeroplane_tab(String string) throws Exception {
		HomePage.launchApp(string);
		LoginPage.login();
		AddAerplanePage.goToAddAeroplanePage();
	}

	@When("The user enters the flight number {string} in the flight number text box")
	public void the_user_enters_the_flight_number_in_the_flight_number_text_box(String string) {
		AddAerplanePage.enterFlightNumber(string);
	}

	@Then("The entered flight number {string}> appears on the text box")
	public void the_entered_flight_number_appears_on_the_text_box(String string) {
		AddAerplanePage.checkIfEntered(string, "flightNo");
	}

	@When("The user enters the number of seats {string} in the number of seats text box")
	public void the_user_enters_the_number_of_seats_in_the_number_of_seats_text_box(String string) {
		AddAerplanePage.enterBussinessClass(string);
	}

	@Then("The entered number of seats {string} appears on the text box")
	public void the_entered_number_of_seats_appears_on_the_text_box(String string) {
		AddAerplanePage.checkIfEntered("bussiness", string);
	}

	@When("The user enters the invalid number of seats {string} in the number of seats text box")
	public void the_user_enters_the_invalid_number_of_seats_in_the_number_of_seats_text_box(String string) {
		AddAerplanePage.enterBussinessClass(string);
	}

	@Then("The error message appears on the screen below seats")
	public void the_error_message_appears_on_the_screen_below_seats() {
		AddAerplanePage.checkForErrorMessage("bussiness");
	}
	
	@When("The user clicks on add button")
	public void the_user_clicks_on_add_button() {
		AddAerplanePage.clickOnAdd();
	}
	
	@Then("The aeroplane is added message is displayed")
	public void the_aeroplane_is_added_message_is_displayed() {
		AddAerplanePage.checkIfAdded();
	}

	@Then("The field {string} should not be empty message appears")
	public void the_field_should_not_be_empty_message_appears(String string) {
		AddAerplanePage.checkIfEmpty(string);
	}

	@Given("The user launch the app {string} and goes to the delete aeroplane tab")
	public void the_user_launch_the_app_and_goes_to_the_delete_aeroplane_tab(String string) throws Exception {
		HomePage.launchApp(string);
		LoginPage.login();
		AddAerplanePage.goToDeleteAeroplanePage();;

	}
	@When("The user presses the delete button")
	public void the_user_presses_the_delete_button() {
		AddAerplanePage.deleteaeroplane();
	}
	@Then("The flight should be deleted")
	public void the_flight_should_be_deleted() {
		AddAerplanePage.checkIfDeleted();
	}



}
