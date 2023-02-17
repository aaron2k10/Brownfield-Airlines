package com.page.objects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utilities.Utility;

public class AddAerplanePage extends Utility{

	public AddAerplanePage(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver= driverInstance;
	}
	
	public static void goToAddAeroplanePage() {
		clickElement(PageObjects.addAeroplanePage);
	}
	
	public static void goToDeleteAeroplanePage() {
		clickElement(PageObjects.deleteAeroplanePage);
	}
	
	public static void enterFlightNumber(String flightNo) {
		sendKeys(PageObjects.flightNumberBox, flightNo);
	}
	
	public static void enterBussinessClass(String businessNo) {
		sendKeys(PageObjects.bussinessClassBox, businessNo);
	}
	
	public static void enterEconomyClass(String EconomyNo) {
		sendKeys(PageObjects.economyClassBox, EconomyNo);
	}
	
	public static void checkIfEntered(String field, String expectedResult) {
		String actualResult="";
		switch (field) {
		case "flightNo":
			actualResult=PageObjects.flightNumberBox.getAttribute("value");
			break;

		case "bussiness":
			actualResult=PageObjects.bussinessClassBox.getAttribute("value");
			break;
			
		case "date":
			actualResult=PageObjects.economyClassBox.getAttribute("value");
			break;
			
		default:
			System.out.println("Invalid Field");
			break;
		}
		boolean result=(expectedResult.equals(actualResult));
		Assert.assertTrue(result);
	}
	
	public static void clickOnAdd() {
		clickElement(PageObjects.addButton);
	}
	
	public static void checkIfAdded() {
		String expectedResult= "Aeroplane Added";
		String actualResult= PageObjects.aeroplaneAddedMessage.getText();
		boolean result= actualResult.equals(expectedResult);
		Assert.assertTrue(result);
	}
	
	public static void checkForErrorMessage(String field) {
		boolean result;
		String expectedResult;
		String actualResult;
		
		switch (field) {
		case "bussiness":
			expectedResult= "Invalid Entry";
			actualResult= driver.findElement(By.xpath("")).getText();
			result=actualResult.equals(expectedResult);
			break;

		case "economy":
			expectedResult= "Invalid Entry";
			actualResult= driver.findElement(By.xpath("")).getText();
			result=actualResult.equals(expectedResult);
			break;
			
		default:
			System.out.println("Invalid field");
			result=false;
			break;
		}
		Assert.assertTrue(result);
	}
	
	public static void checkIfEmpty(String field) {
		boolean result;
		String expectedResult;
		String actualResult;
		
		switch (field) {
		
		case "flightNo":
			expectedResult= "Field cannot be empty";
			actualResult= driver.findElement(By.xpath("")).getText();
			result=actualResult.equals(expectedResult);
			break;
			
		case "bussiness":
			expectedResult= "Filed cannot be empty";
			actualResult= driver.findElement(By.xpath("")).getText();
			result=actualResult.equals(expectedResult);
			break;

		case "economy":
			expectedResult= "Filed cannot be empty";
			actualResult= driver.findElement(By.xpath("")).getText();
			result=actualResult.equals(expectedResult);
			break;
			
		default:
			System.out.println("Invalid field");
			result=false;
			break;
		}
		Assert.assertTrue(result);
	}

	public static void deleteaeroplane() {
		clickElement(PageObjects.deleteAeroplaneButton);
	}
	
	public static void checkIfDeleted() {
		boolean result;
		String actualResult= driver.switchTo().alert().getText();
		result=actualResult.equals("");
		Assert.assertTrue(result);
	}
}
