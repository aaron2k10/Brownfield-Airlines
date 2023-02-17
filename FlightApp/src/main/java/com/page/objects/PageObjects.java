package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Utility;

public class PageObjects extends Utility {

	public static WebDriver driver;
	

	public PageObjects(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver = driverInstance;
	}
	
	
	@FindBy(linkText="")
	public static
	WebElement bPassengerFirstName;
	
	@FindBy(linkText="")
	public static
	WebElement bPassengerLastName;
	
	@FindBy(linkText="")
	public static
	WebElement bMaleButton;
	
	@FindBy(linkText="")
	public static
	WebElement bFemaleButton;
	
	@FindBy(linkText="")
	public static
	WebElement bConfirmBookingButton;
	
	@FindBy(linkText="")
	public static
	WebElement bAddInNewPassenger;

	@FindBy(linkText="")
	public static
	WebElement bCloseButton;
	
	@FindBy(linkText="")
	public static
	WebElement bExitButton;

	@FindBy(linkText="")
	public static
	WebElement bCheckPassengerDetails;
	
	@FindBy(linkText="")
	public static
	WebElement bViewBoardingPass;
	
	@FindBy(linkText="")
	public static
	WebElement bGenerateInvoiceButton;
	

	
	@FindBy(linkText="")
	public static
	WebElement cPnrNo;
	
	@FindBy(linkText="")
	public static
	WebElement cEmailId;
	
	
	@FindBy(linkText="")
	public static
	WebElement cCheckInButton;
	
	@FindBy(linkText="")
	public static
	WebElement caFlightNo;
	
	@FindBy(linkText="")
	public static
	WebElement caDate;
	
	@FindBy(linkText="")
	public static
	WebElement caTime;
	
	@FindBy(linkText="")
	public static
	WebElement caSearchButton;
	
	@FindBy(linkText="")
	public static
	WebElement caLuggageCheckinButton;
	
	@FindBy(linkText="")
	public static
	WebElement caAllotSeatButton;
	
	@FindBy(linkText="")
	public static
	WebElement caBoardingButton;
	
	
	
	
	// error check
	
	@FindBy(linkText="")
	public static
	WebElement passFirstNameErrorCheck;
	
	
	@FindBy(linkText="")
	public static
	WebElement passLastNameErrorCheck;
	
	@FindBy(linkText="")
	public static
	WebElement passInvalidAgeErrorCheck;
	
	@FindBy(linkText="")
	public static
	WebElement passClickMaleButton;
	
	@FindBy(linkText="")
	public static
	WebElement passClickFemaleButton;
	
	@FindBy(linkText="")
	public static
	WebElement passInvalidBookTicketButton;
	
	@FindBy(linkText="")
	public static
	WebElement passValidBookTicketButton;
	
	@FindBy(linkText="")
	public static
	WebElement passValidInvoiceGeneratorButton;
}
