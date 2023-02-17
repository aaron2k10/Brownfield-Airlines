package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.utilities.AutomationBase;
import com.utilities.Utility;

public class BrownFieldAirline extends Utility {

    //public static WebDriver driver;
    public static String newUserName="";
    public static String newUserPassword="";
    public BrownFieldAirline(WebDriver driverInstance) {
    	PageFactory.initElements(driverInstance, this);
        driver = driverInstance;
        
    }

    public static void launchApp() throws Exception {
        AutomationBase.launchApp("http://ngtteam5bucket.s3-website.us-east-2.amazonaws.com/");
        
        logger.info("BrownField Flight App is launched");
    }
	
	

}
