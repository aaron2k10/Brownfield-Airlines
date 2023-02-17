package com.page.objects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.utilities.Utility;

public class TicketBookingPage extends Utility {

	public TicketBookingPage(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver = driverInstance;
	}

	public static void enterPassengerFirstName(String passfirstname) {

		PageObjects.bPassengerFirstName.clear();

		sendKeys(PageObjects.bPassengerFirstName, passfirstname);

		PageObjects.bPassengerLastName.click();

	}

	public static void enterPassengerLastName(String passlastname) {

		PageObjects.bPassengerLastName.clear();

		sendKeys(PageObjects.bPassengerLastName, passlastname);

		PageObjects.bMaleButton.click();

	}


	public static void clickMaleButton() {

		PageObjects.bMaleButton.click();
		
	}

	public static void clickFemaleButton() {

		PageObjects.bFemaleButton.click();
		
	}

	public static void clickConfirmButton() {

		PageObjects.bConfirmBookingButton.click();

	}
	
	public static void clickAddInNewPassenger() {

		PageObjects.bAddInNewPassenger.click();

	}
	
	public static void clickCloseButton() {

		PageObjects.bCloseButton.click();

	}
	
	public static void clickCrossmark() {

		PageObjects.bExitButton.click();

	}
	
	public static void clickPassengerDetailsButton() {

		PageObjects.bCheckPassengerDetails.click();

	}
	
	public static void clickBoardingPass() {

		PageObjects.bViewBoardingPass.click();

	}
	
	//checking

	public static boolean checkPassengerFirstName() {

		String actResult = PageObjects.passFirstNameErrorCheck.getText();
		System.out.println(actResult);

		return actResult.equals("");

	}

	public static boolean checkPassengerLastName() {

		String actResult = PageObjects.passFirstNameErrorCheck.getText();
		System.out.println(actResult);

		return actResult.equals("");

	}


	public static boolean checkMaleRadioButton() {

		boolean actResult = PageObjects.passClickMaleButton.isEnabled();
		System.out.println(actResult);

		return actResult;

	}

	public static boolean checkFemaleRadioButton() {

		boolean actResult = PageObjects.passClickFemaleButton.isEnabled();
		System.out.println(actResult);

		return actResult;

	}

	public static boolean checkInvalidBookingButton() {

		String actResult = PageObjects.passInvalidBookTicketButton.getText();
		System.out.println(actResult);

		return actResult.equals("");

	}

	public static boolean checkValidBookingButton() {

		String actResult = PageObjects.passValidBookTicketButton.getText();
		System.out.println(actResult);

		return actResult.equals("");

	}
	
	

}
