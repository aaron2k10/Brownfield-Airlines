package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Utility;

public class InvoiceGeneratorPage extends Utility {
	
	public InvoiceGeneratorPage(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver = driverInstance;
	}
	public static void clickInvoiceGenerateButton() {

		PageObjects.bGenerateInvoiceButton.click();

	}
	
	public static boolean checkValidInvoiceConfirmButton() {

		String actResult = PageObjects.passValidInvoiceGeneratorButton.getText();
		System.out.println(actResult);

		return actResult.equals("");

	}
	
	

}
