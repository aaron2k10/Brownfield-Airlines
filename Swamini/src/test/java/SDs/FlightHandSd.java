package SDs;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import PageFactories.FlightHandPF;
import PageFactories.LoginPF;
import UtilPack.AutoBase;
import UtilPack.utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightHandSd extends utility{
	LoginSd obj;
	Select s;
	public FlightHandSd(WebDriver driverInst) {
		super();
	}

	public FlightHandSd() {

	}

	@Given("Admin is on the homepage")
	public void admin_is_on_the_homepage() {
		AutoBase.launchApp("http://ngtteam5bucket.s3-website.us-east-2.amazonaws.com/");
		super.expWait(LoginPF.LoginBtn, "visible");
	}

	@When("Admin logs in with {string} and {string}")
	public void admin_logs_in_with_and(String emailId, String pswd) throws Exception {
		obj.admin_clicks_on_login_button();
		obj.admin_enters_a_valid_and(emailId, pswd);
		obj.admin_clicks_on_login_button();
		
	}

	@And("is on the dashboard page")
	public void is_on_the_dashboard_page() throws Exception {
		super.isDisplayed(FlightHandPF.dashboard);
		
	}

	@When("Admin clicks on View Flights option")
	public void admin_clicks_on_view_flights_option() throws Exception {
	    super.clickElement(FlightHandPF.menuIcon);
	    super.clickElement(FlightHandPF.ViewOption);
	}

	@Then("All scheduled flghts should be displayed")
	public void all_scheduled_flghts_should_be_displayed() throws Exception {
	   super.isDisplayed(FlightHandPF.ViewHead);
	}
	@When("Admin searches an existing flight using {string}")
	public void admin_searches_an_existing_flight_using(String fno) throws Exception {
	    super.sendKeys(FlightHandPF.srchBar, fno);
	}

	@Then("only the searched flight should be displayed")
	public void only_the_searched_flight_should_be_displayed() throws Exception {
	    super.isDisplayed(FlightHandPF.srchRes);
	}
	@When("Admin searches a non-existing existing flight using {string}")
	public void admin_searches_a_non_existing_existing_flight_using(String fno) throws Exception {
		super.sendKeys(FlightHandPF.srchBar, fno);
	}

	@Then("Flight doesn't exist msg should be displayed")
	public void flight_doesn_t_exist_msg_should_be_displayed() {
	   super.getErrorMsg(FlightHandPF.srchMsg);
	}
	
	@When("Admin clicks on Update flight option")
	public void admin_clicks_on_update_flight_option() throws Exception {
	    super.isDisplayed(FlightHandPF.UpdateHead);
	}
	@Then("Schdeuled flights are displayed")
	public void schdeuled_flights_are_displayed() throws Exception {
	   super.isDisplayed(FlightHandPF.Record);
	}
	
	@Then("Admin should be able to choose an {string} for the Status field")
	public void admin_should_be_able_to_choose_an_for_the_status_field(String StatusVal) {
		s = new Select(FlightHandPF.status);
		s.selectByVisibleText(StatusVal);
	}
	

	@When("Admin clicks on Add flight option")
	public void admin_clicks_on_add_flight_option() throws Exception {
	    super.clickElement(FlightHandPF.AddOption);
	   
	}
	
	@Then("Add flight dashboard is displayed")
	public void add_flight_dashboard_is_displayed() throws Exception {
		super.isDisplayed(FlightHandPF.AddHead);

	}
	
	@When("Admin enters {string}")
	public void admin_enters(String Fno) throws Exception {
		super.sendKeys(FlightHandPF.FlightNo, Fno);

	}
	
	@When("Selects aeroplane no {string}")
	public void selects_aeroplane_no(String aerNo) {
		s = new Select(FlightHandPF.PlaneNo);
		s.selectByVisibleText(aerNo);

	}
	
	@When("selects source {string} and destination {string} locations")
	public void selects_source_and_destination_locations(String src, String des) throws Exception {
		s = new Select(FlightHandPF.SrcLoc);
		s.selectByVisibleText(src);
		s = new Select(FlightHandPF.DesLoc);
		s.selectByVisibleText(des);
		if(src.equalsIgnoreCase(des)) {
			if(super.isDisplayed(FlightHandPF.locMsg)) {
				assertTrue(true);
			}
			else
			{
				assertTrue(false);
			}
		}
	}
	
	@When("Selects arrival {string} {string} and departure {string} {string} time")
	public void selects_arrival_and_departure_time(String aH, String aM, String dH, String dM) {
		s = new Select(FlightHandPF.arrH);
		s.selectByVisibleText(aH);
		s = new Select(FlightHandPF.arrM);
		s.selectByVisibleText(aM);
		s = new Select(FlightHandPF.depH);
		s.selectByVisibleText(dH);
		s = new Select(FlightHandPF.depM);
		s.selectByVisibleText(dM);

	}
	
	@When("Enters Seat no {string}")
	public void enters_seat_no(String seat) throws Exception {
		super.sendKeys(FlightHandPF.noOfSeat, seat);

	}
	
	@When("selects days of flight")
	public void selects_days_of_flight() {
		s = new Select(FlightHandPF.arrH);
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.selectByIndex(3);

	}
	
	@When("clicks on add")
	public void clicks_on_add() throws Exception {
		super.clickElement(FlightHandPF.addBtn);
	}
	
	@Then("acknowledgement pop up should be displayed")
	public void acknowledgement_pop_up_should_be_displayed() throws Exception {
		super.isDisplayed(FlightHandPF.acknMsg);
	}

}
