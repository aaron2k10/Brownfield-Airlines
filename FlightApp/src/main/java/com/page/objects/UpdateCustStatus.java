package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Utility;

public class UpdateCustStatus extends Utility {
	
	public UpdateCustStatus(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver = driverInstance;
	

}
	}
