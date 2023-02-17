package com.stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.utilities.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tc08_GenerateInvoice extends Utility{
	
	
	public Tc08_GenerateInvoice(WebDriver driverInstance){
        super(driverInstance);
    }
    public Tc08_GenerateInvoice(){
    }
	
	@Given("when the user present in the invoice page")
	public void when_the_user_present_in_the_invoice_page() throws Exception {
		com.page.objects.BrownFieldAirline.launchApp();
	}

	@When("user clicks the generateinvoice button")
	public void user_clicks_the_generateinvoice_button() {
	    //bGenerateInvoiceButton
		com.page.objects.InvoiceGeneratorPage.clickInvoiceGenerateButton();
	}

	@Then("invoice success message should be displayed")
	public void invoice_success_message_should_be_displayed() {
		boolean result = com.page.objects.InvoiceGeneratorPage.checkValidInvoiceConfirmButton();
	    assertEquals(result, true);
		
		driver.quit();
	}

}
