package SDs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import PageFactories.RegisterPF;
import UtilPack.AutoBase;
import UtilPack.utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSd extends utility {
	Date d;
	public RegisterSd(WebDriver driverInst) {
		super();
	}

	public RegisterSd() {

	}

	@Given("User is on homepage of the website")
	public void user_is_on_homepage_of_the_website() throws InterruptedException {
		AutoBase.launchApp("http://ngtteam5bucket.s3-website.us-east-2.amazonaws.com");
		super.expWait(RegisterPF.RegBtn, "visible");
	}

	@When("User clicks on Register button,")
	public void user_clicks_on_register_button() throws Exception {
		super.clickElement(RegisterPF.RegBtn);
	}

	@Then("User is navigated to the Registration page")
	public void user_is_navigated_to_the_registration_page() throws Exception {
		boolean res = super.isDisplayed(RegisterPF.SignUpHead);
		System.out.println(res);
		// super.expWait(RegisterPF.fName, "visible");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String firName, String lasName) throws Exception {
		super.sendKeys(RegisterPF.fName, firName);
		super.sendKeys(RegisterPF.LName, lasName);
	}

	@Then("Error msg should be displayed if user adds digits in the field")
	public void the_names_are_visible_in_proper_format() throws Exception {
//		String FirstName = super.getErrorMsg(RegisterPF.fName);
//		String LastName = super.getErrorMsg(RegisterPF.LName);
//		super.sendKeys(RegisterPF.LName, Keys.TAB);
//		System.out.println(RegisterPF.fName.getText());
//		System.out.println(FirstName + " " + LastName);
		String msg=super.getErrorMsg(RegisterPF.fnameMsg);
		String ExpcMsg="Error msg present";
		Assert.assertEquals(msg, ExpcMsg);
		String msg1=super.getErrorMsg(RegisterPF.lnameMsg);
		String ExpcMsg1="Error msg present";
		Assert.assertEquals(msg1, ExpcMsg1);
	}

	@When("User clicks on first name but leaves it empty")
	public void user_clicks_on_first_name_but_leaves_it_empty() throws Exception {
		super.clickElement(RegisterPF.fName);
		super.sendKeys(RegisterPF.fName, Keys.TAB);
	}

	@When("enters {string} without entering the first name")
	public void enters_without_entering_the_first_name(String lasName) throws Exception {
		super.sendKeys(RegisterPF.LName, lasName);
		super.sendKeys(RegisterPF.fName, Keys.TAB);
	}

	@Then("Error Msg should be displayed")
	public void error_should_be_displayed() throws Exception {
		@SuppressWarnings("unused")
		String msg = super.getErrorMsg(RegisterPF.missFnameMsg);
	}

	@Then("Error message is displayed if email format is not proper")
	public void error_message_is_displayed_if_email_format_is_not_proper() {
		String msg;
		msg = super.getErrorMsg(RegisterPF.emailMsg);
		System.out.println(msg);
	}

	@When("User enters email as{string}")
	public void user_enters(String emailId) throws Exception {
		super.sendKeys(RegisterPF.email, emailId);
		super.sendKeys(RegisterPF.email, Keys.TAB);
	}

	@When("User enters mobile no as {string}")
	public void user_enters_mobile_no_as(String mobno) throws Exception {
		super.sendKeys(RegisterPF.mob, mobno);
	}

	@Then("Error message is displayed if number is not equal to ten")
	public void error_message_is_displayed_if_number_is_not_equal_to_ten() {
		String msg = super.getErrorMsg(RegisterPF.mobMsg);
		System.out.println(msg);
	}
	
	
	@When("User enters Password as{string}")
	public void user_enters_password_as(String pswd) throws Exception {
		super.sendKeys(RegisterPF.pass, pswd);
		super.sendKeys(RegisterPF.pass, Keys.TAB);
	}

	@Then("Error message is displayed if it is of inproper format")
	public void error_message_is_displayed_if_it_is_of_inproper_format() {
		String msg = super.getErrorMsg(RegisterPF.passMsg);
		System.out.println(msg);
	}
	
	@When("User enters Password as{string} and confirms {string}")
	public void user_enters_password_as_password_and_confirms(String pass ,String cPass) throws Exception {
		super.sendKeys(RegisterPF.pass, pass);
		super.sendKeys(RegisterPF.pass, Keys.TAB);
		super.sendKeys(RegisterPF.Cpass, cPass);
		super.sendKeys(RegisterPF.Cpass, Keys.TAB);
	}

	@Then("Error message is displayed if the password dont match")
	public void error_message_is_displayed_if_the_password_dont_match() {
		String msg = super.getErrorMsg(RegisterPF.confPassMsg);
		System.out.println(msg);
	}
	
	@Then("User is able to select the respective {string} radio button")
	public void user_is_able_to_select_the_respective_female_radio_button(String gender) throws Exception {
	    switch(gender) {
	    case "male":
	    	super.scroll(RegisterPF.Mradio);
	    	super.clickElement(RegisterPF.Mradio);
	    	super.IsSelected(RegisterPF.Mradio);
	    	break;
	    case "female":
	    	super.scroll(RegisterPF.Fradio);
	    	super.clickElement(RegisterPF.Fradio);
	    	super.IsSelected(RegisterPF.Fradio);
	    	break;
	    case"other":
	    	super.scroll(RegisterPF.Oradio);
	    	super.clickElement(RegisterPF.Oradio);
	    	super.IsSelected(RegisterPF.Oradio);
	    	break;
	    }
	    Thread.sleep(3000);
	}
	@SuppressWarnings("unused")
	@When("User selects DOB")
	public void user_selects_dob() throws Exception {
//		super.clickElement(RegisterPF.DOBtext);
//		Thread.sleep(3000);
//		super.clickElement(RegisterPF.DOBarrow);
//		Thread.sleep(3000);
//		for(int i=0;i<8;i++)
//			super.sendKeys(RegisterPF.DOBtext, Keys.BACK_SPACE);
//		super.sendKeys(RegisterPF.DOBtext, dob);
//		Thread.sleep(3000);
//		super.clickElement(RegisterPF.SubmitBtn);
		super.clickElement(RegisterPF.calIcon);
		String expDate="10-June-2000";
		String edate=expDate.split("-")[0];
		String emonth=expDate.split("-")[1];
		String eyear=expDate.split("-")[2];
		
		String mon = RegisterPF.monYear.getText().split(" ")[0];
		String year = RegisterPF.monYear.getText().split(" ")[1];
		if(!eyear.equals(year)) {
			super.clickElement(RegisterPF.yearArrow);
		}
		
		super.clickElement(RegisterPF.yearVal);
		Thread.sleep(3000);
//		while(!emonth.equals(mon)) {
//			if(!eyear.equals("2005")) {
//				
//			}
//		}	)
	}

	@SuppressWarnings("unused")
	@Then("DOB should be atleast eighteen years prior to current date")
	public void dob_should_be_atleast_eighteen_years_prior_to_current_date() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
//		System.out.println(dtf.format(now));  
//		System.out.println("Date:"+d);
		String msg = super.getErrorMsg(RegisterPF.DOBmsg);
		System.out.println(msg);
	}
	@When("User enters Last Name as {string} ,EmailId as {string} ,Mobile No as {string} ,Password as {string} ,confirms as {string} , Gender as {string}")
	public void user_enters_last_name_as_email_id_as_mobile_no_as_password_as_confirms_as_gender_as(String ln, String em, String mob, String pass1, String pass2, String gen) throws Exception {
		super.sendKeys(RegisterPF.LName, ln);
		super.sendKeys(RegisterPF.email, em);
		super.sendKeys(RegisterPF.mob, mob);
		super.sendKeys(RegisterPF.pass, pass1);
		super.sendKeys(RegisterPF.Cpass, pass2);
		user_is_able_to_select_the_respective_female_radio_button(gen);
	}

	@When("Leaves First Name empty and clicks Submit")
	public void leaves_first_name_empty() throws Exception {
	  super.clickElement(RegisterPF.SubmitBtn);
	}
	@Then("Error msg should be displayed for empty First Name")
	public void error_msg_should_be_displayed_for_empty_first_name() {
		String msg = super.getErrorMsg(RegisterPF.missFnameMsg);
		String ExpcMsg="First Name is required";
		Assert.assertEquals(msg, ExpcMsg);
	}
	@When("User enters First Name as {string} ,EmailId as {string} ,Mobile No as {string} ,Password as {string} ,confirms as {string} , Gender as {string}")
	public void user_enters_first_name_as_email_id_as_mobile_no_as_password_as_confirms_as_gender_as(String fn, String em, String mob, String pass1, String pass2, String gen) throws Exception {
		super.sendKeys(RegisterPF.fName, fn);
		super.sendKeys(RegisterPF.email, em);
		super.sendKeys(RegisterPF.mob, mob);
		super.sendKeys(RegisterPF.pass, pass1);
		super.sendKeys(RegisterPF.Cpass, pass2);
		user_is_able_to_select_the_respective_female_radio_button(gen);
	}

	@When("Leaves Last Name empty and clicks Submit")
	public void leaves_last_name_empty_and_clicks_submit() throws Exception {
		super.clickElement(RegisterPF.SubmitBtn);
	}
	@Then("Error msg should be displayed for empty Last Name")
	public void error_msg_should_be_displayed_for_empty_last_name() {
		String msg = super.getErrorMsg(RegisterPF.missLnameMsg);
		String ExpcMsg="Last Name is required";
		Assert.assertEquals(msg, ExpcMsg);
	}
	@When("User enters First Name as {string},Last Name as {string} ,Mobile No as {string} ,Password as {string} ,confirms as {string} , Gender as {string}")
	public void user_enters_first_name_as_last_name_as_mobile_no_as_password_as_confirms_as_gender_as(String fn, String ln, String mob, String pass1, String pass2, String gen) throws Exception {
		super.sendKeys(RegisterPF.fName, fn);
		super.sendKeys(RegisterPF.LName, ln);
		super.sendKeys(RegisterPF.mob, mob);
		super.sendKeys(RegisterPF.pass, pass1);
		super.sendKeys(RegisterPF.Cpass, pass2);
		user_is_able_to_select_the_respective_female_radio_button(gen);
	}
	
	@When("Leaves Email empty and clicks Submit")
	public void leaves_email_empty_and_clicks_submit() throws Exception {
		super.clickElement(RegisterPF.SubmitBtn);
		Thread.sleep(3000);
	}

	@Then("Error msg should be displayed for empty email")
	public void error_msg_should_be_displayed_for_empty_email() {
		String msg = super.getErrorMsg(RegisterPF.missEmailMsg);
		String ExpcMsg="Email is required";
		System.out.println(RegisterPF.missEmailMsg.isDisplayed());
		System.out.println(msg);
		Assert.assertEquals(msg, ExpcMsg);
	}
	
	@When("User enters First Name as {string},Last Name as {string} ,EmailId as {string} ,Password as {string} ,confirms as {string} , Gender as {string}")
	public void user_enters_first_name_as_last_name_as_email_id_as_password_as_confirms_as_gender_as(String fn, String ln, String em, String pass1, String pass2, String gen) throws Exception {
		super.sendKeys(RegisterPF.fName, fn);
		super.sendKeys(RegisterPF.LName, ln);
		super.sendKeys(RegisterPF.email, em);
		super.sendKeys(RegisterPF.pass, pass1);
		super.sendKeys(RegisterPF.Cpass, pass2);
		user_is_able_to_select_the_respective_female_radio_button(gen);
	}

	@When("Leaves Mobile number empty and clicks Submit")
	public void leaves_mobile_number_empty_and_clicks_submit() throws Exception {
		super.clickElement(RegisterPF.SubmitBtn);
		Thread.sleep(3000);
	}
	@Then("Error msg should be displayed for empty mobile number")
	public void error_msg_should_be_displayed_for_empty_mobile_number() {
		String msg = super.getErrorMsg(RegisterPF.missMobMsg);
		String ExpcMsg="A phone number is required";
		System.out.println(msg);
		Assert.assertEquals(msg, ExpcMsg);
	}
	
	
	@When("User enters First Name as {string},Last Name as {string} ,EmailId as {string} ,Mobile No as {string} , Password as {string} ,confirms as {string}")
	public void user_enters_first_name_as_last_name_as_email_id_as_mobile_no_as_password_as_confirms_as(String fn, String ln, String em, String mob, String pass,String Cpass) throws Exception {
		super.sendKeys(RegisterPF.fName, fn);
		super.sendKeys(RegisterPF.LName, ln);
		super.sendKeys(RegisterPF.email, em);
		super.sendKeys(RegisterPF.mob, mob);
		super.sendKeys(RegisterPF.pass, " ");
		super.sendKeys(RegisterPF.Cpass, Keys.TAB);
	}

	@When("Leaves Gender empty and clicks Submit")
	public void leaves_gender_empty_and_clicks_submit() throws Exception {
		super.scroll(RegisterPF.SubmitBtn);
		Thread.sleep(3000);
		super.clickElement(RegisterPF.SubmitBtn);
		
	}

	@Then("Error msg should be displayed for empty gender selection")
	public void error_msg_should_be_displayed_for_empty_gender_selection() {
		String msg = super.getErrorMsg(RegisterPF.missGen);
		String ExpcMsg="Gender is required";
		System.out.println(msg);
		Assert.assertEquals(msg, ExpcMsg);
	}
	
	@When("User enters First Name as {string},Last Name as {string} ,EmailId as {string} ,Mobile No as {string} ,Password as {string} ,confirms as {string} , Gender as {string}")
	public void user_enters_first_name_as_last_name_as_mobile_no_as_email_id_as_password_as_confirms_as_gender_as(String fn, String ln, String em, String mob, String pass,String Cpass, String gen) throws Exception {
		super.sendKeys(RegisterPF.fName, fn);
		super.sendKeys(RegisterPF.LName, ln);
		super.sendKeys(RegisterPF.email, em);
		super.sendKeys(RegisterPF.mob, mob);
		super.sendKeys(RegisterPF.pass, pass);
		super.sendKeys(RegisterPF.Cpass, Cpass);
		for(int i=0;i<8;i++)
			super.sendKeys(RegisterPF.DOBtext, Keys.BACK_SPACE);
		super.sendKeys(RegisterPF.DOBtext, "02/21/2000");
		user_is_able_to_select_the_respective_female_radio_button(gen);
	}

	@When("Clicks Submit")
	public void clicks_submit() throws Exception {
		Thread.sleep(3000);
		super.scroll(RegisterPF.SubmitBtn);
		super.expWait(RegisterPF.SubmitBtn, "clickable");
		super.clickElement(RegisterPF.SubmitBtn);
	}

	@Then("Acknowledgment alert should be displayed")
	public void acknowledgment_alert_should_be_displayed() throws Exception {
	    super.isDisplayed(RegisterPF.HomePgHead);
	}
}
