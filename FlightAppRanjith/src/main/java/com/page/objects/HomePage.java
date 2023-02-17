package com.page.objects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utilities.AutomationBase;
import com.utilities.Utility;

public class HomePage extends Utility{

	public HomePage(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver= driverInstance;
	}
	
	public static void launchApp(String website) throws Exception {
		AutomationBase.launchApp(getAppUrl(website));
		logger.info("The brown field website is launched");
	}
	
	public static void selectSourceLocation(String sourceString) {
//		sendKeys(PageObjects.sourceLocBox, sourceString);
		Select sourceLoc= new Select(returnElement(PageObjects.sourceLocBox, "clickable"));
		sourceLoc.selectByVisibleText(sourceString);
	}
	
	public static void selectDestinationLocation(String destinationString) {
//		sendKeys(PageObjects.destinationLoocBox, destinationString);
		Select destinationLoc= new Select(returnElement(PageObjects.destinationLoocBox, "clickable"));
		destinationLoc.selectByVisibleText(destinationString);
	}
	
	public static void clickOnSearch() {
		clickElement(returnElement(PageObjects.searchButton, "clickable"));
	}
	
	public static void checkIfSelected(String field, String expectedResult) {
		String actualResult="";
		switch (field) {
		case "source":
			
			Select sourceLoc= new Select(returnElement(PageObjects.sourceLocBox, "clickable"));
			actualResult=sourceLoc.getFirstSelectedOption().getAttribute("value");
			break;

		case "destination":
			
			Select destinationLoc= new Select(returnElement(PageObjects.destinationLoocBox, "clickable"));
			actualResult=destinationLoc.getFirstSelectedOption().getAttribute("value");
			break;
			
		case "date":
			String expDate[]=expectedResult.split("/");
			actualResult=PageObjects.dateBox.getAttribute("value");
			String actDate[]=actualResult.split("-");
			expectedResult="yes";
			actualResult="yes";
			for(int i=0;i<3;i++) {
				if(!expDate[i].equals(actDate[2-i])) {
					actualResult="no";
					break;
				}
			}
			break;
			
		default:
			System.out.println("Invalid Field");
			break;
		}
		System.out.println("----------------------------------------------------");
		System.out.println(field);
		System.out.println(actualResult);
		System.out.println("----------------------------------------------------");
		boolean result=(expectedResult.equals(actualResult));
		Assert.assertTrue(result);
	}
	
	public static void selectDate(String dateString) {
		sendKeys(returnElement(PageObjects.dateBox, "clickable"), dateString);
	}
	
	public static void checkIfValidSearch(String expTitle) {
		String actTitle=driver.getTitle();
		boolean result= expTitle.equals(actTitle);
		Assert.assertTrue(result);
	}
	
	public static void checkIfError(String field) {
		String actResult=driver.findElement(By.xpath("")).getText();
		boolean result = actResult.equals("Error");
		Assert.assertTrue(result);
	}
}
