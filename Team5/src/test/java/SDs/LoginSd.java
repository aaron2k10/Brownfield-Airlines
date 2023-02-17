package SDs;

import org.openqa.selenium.WebDriver;

import PageFactories.LoginPF;
import PageFactories.RegisterPF;
import UtilPack.AutoBase;
import UtilPack.utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSd extends utility{
	public LoginSd(WebDriver driverInst) {
		super();
	}

	public LoginSd() {

	}
	//User Login 1
	@Given("User is on Homepage of the website")
	public void user_is_on_homepage_of_the_website() {
		AutoBase.launchApp("http://10.103.87.176:3000/");
		super.expWait(RegisterPF.RegBtn, "visible");
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws Exception {
	    super.clickElement(LoginPF.LoginBtn);
	}

	@And("User is navigated to the Login Page")
	public void user_is_navigated_to_the_login_page() throws Exception {
	    super.isDisplayed(LoginPF.LoginHead);
	}

	@When("User enters a valid {string} and {string}")
	public void user_enters_a_valid_and(String emailId, String pswd) throws Exception {
		super.sendKeys(LoginPF.emailField, emailId);
	    super.sendKeys(LoginPF.pswdField, pswd);
	}

	@And("clicks on Submit")
	public void clicks_on_submit() throws Exception {
	    super.clickElement(LoginPF.LogBtn);
	}
	@Then("Alert msg {string} should be displayed")
	public void alert_msg_should_be_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@And("User should be navigated to homepage of the website")
	public void user_should_be_navigated_to_homepage_of_the_website() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	//User Login 2
	@When("User enters a invalid {string} and {string}")
	public void user_enters_a_invalid_and(String emailId, String pswd) throws Exception {
		super.sendKeys(LoginPF.emailField, emailId);
	    super.sendKeys(LoginPF.pswdField, pswd);
	}

	@Then("Error msg should be displayed")
	public void error_msg_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	//Admin Login1
	@Given("Admin is on Homepage of the website")
	public void admin_is_on_homepage_of_the_website() {
		AutoBase.launchApp("http://10.103.87.176:3000/");
		super.expWait(RegisterPF.RegBtn, "visible");
	}

	@When("Admin clicks on Login button")
	public void admin_clicks_on_login_button() throws Exception {
		super.clickElement(LoginPF.LoginBtn);
	}

	
	@And("Admin is navigated to the Login Page")
	public void admin_is_navigated_to_the_login_page() throws Exception {
		super.isDisplayed(LoginPF.LoginHead);
	}
	
	@When("Admin enters a valid {string} and {string}")
	public void admin_enters_a_valid_and(String emailId, String pswd) throws Exception {
		super.sendKeys(LoginPF.emailField, emailId);
	    super.sendKeys(LoginPF.pswdField, pswd);
	}

	@When("Admin enters a invalid {string} and {string}")
	public void admin_enters_a_invalid_and(String emailId, String pswd) throws Exception {
		super.sendKeys(LoginPF.emailField, emailId);
	    super.sendKeys(LoginPF.pswdField, pswd);
	}

	@And("checks the Admin checkbox")
	public void checks_the_admin_checkbox() throws Exception {
	    super.clickElement(LoginPF.adminCheckBox);
	}

	@When("Admin clicks on submit")
	public void admin_clicks_on_submit() throws Exception {
	   super.clickElement(LoginPF.LogBtn);
	}
	
	@Then("Admin should be navigated to the Admin Dashboard")
	public void admin_should_be_navigated_to_the_admin_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
