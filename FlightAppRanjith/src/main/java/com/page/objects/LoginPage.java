package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Utility;

public class LoginPage extends Utility{

	public LoginPage(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver= driverInstance;
	}
	
	public static void login() {
		clickElement(PageObjects.loginPage);
		sendKeys(PageObjects.userName, "ranjithkumar");
		sendKeys(PageObjects.password, "Abcd.123");
		clickElement(PageObjects.adminCheckBox);
		clickElement(PageObjects.signinButton);
	}
}
