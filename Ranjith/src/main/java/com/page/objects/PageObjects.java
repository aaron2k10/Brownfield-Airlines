package com.page.objects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.Utility;

public class PageObjects extends Utility {

	public static WebDriver driver;
	public static String productName;

	public PageObjects(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver = driverInstance;
	}

	@FindBy(xpath = "")
	public static WebElement sourceLocBox;

	@FindBy(xpath = "")
	public static WebElement destinationLoocBox;
	
	@FindBy(xpath = "//input[@type=\"date\"]")
	public static WebElement dateBox;
	
	@FindBy(xpath = "")
	public static WebElement searchButton;
	
	@FindBy(xpath = "")
	public static WebElement errorMessage;

	@FindBy(xpath = "")
	public static WebElement loginPage;
	
	@FindBy(xpath = "")
	public static WebElement userName;
	
	@FindBy(xpath = "")
	public static WebElement password;
	
	@FindBy(xpath = "")
	public static WebElement adminCheckBox;
	
	@FindBy(xpath = "")
	public static WebElement signinButton;

	@FindBy(xpath = "")
	public static WebElement addAeroplanePage;

	@FindBy(xpath = "")
	public static WebElement flightNumberBox;

	@FindBy(xpath = "")
	public static WebElement bussinessClassBox;

	@FindBy(xpath = "")
	public static WebElement economyClassBox;

	@FindBy(xpath = "")
	public static WebElement addButton;

	@FindBy(xpath = "")
	public static WebElement aeroplaneAddedMessage;

	@FindBy(xpath = "")
	public static WebElement deleteAeroplanePage;

	@FindBy(xpath = "")
	public static WebElement deleteAeroplaneButton;

}
