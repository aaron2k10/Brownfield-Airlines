package UtilPack;

import org.openqa.selenium.WebDriver;

public class AutoBase {
	public static WebDriver driver;
	public AutoBase(WebDriver driverInst){
		driver=driverInst;
	}
	
	public static void launchApp(String url) {
		driver.get(url);
	}
}
