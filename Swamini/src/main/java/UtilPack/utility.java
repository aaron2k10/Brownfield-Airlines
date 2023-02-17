package UtilPack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class utility {
	static WebDriver driver;
	public utility() {	
	}
	public utility(WebDriver driverInst) {	 //Initializing the driver
		driver=driverInst;
	}
	public void clickElement(WebElement element) throws Exception {
        try {
            element.click();
        } catch (Exception e) {
            throw e;
        }
    }
	public Date toDate(String s) throws ParseException {
		Date date1=new SimpleDateFormat("mm/dd/yyyy").parse(s);  
		return date1;
	}
	public void IsSelected(WebElement element) throws Exception {
		try {
    		if(element.isSelected())
	    		System.out.println("Selected");
    		else
    			System.out.println("Not Selected");
    	}
    	catch(Exception e) {
    		throw(e);
    	}
	}
    public void sendKeys(WebElement element, String value) throws Exception {
        try {
            element.sendKeys(value);
        } catch (Exception e) {
            throw e;
        }
    }
    public void sendKeys(WebElement element, Keys keytype) throws Exception {
        try {
            element.sendKeys(keytype);
        } catch (Exception e) {
            throw e;
        }
    }
    public static boolean isDisplayed(WebElement element) throws Exception {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            throw e;
        }
    }
    public static String getErrorMsg(WebElement element) {
    	try {
    		return element.getText();
    	}
    	catch(Exception e) {
    		return "Error msg not present";
    	}
    	
    }
    public void scroll(WebElement element ) {
    	Actions act = new Actions(driver);
    	act.scrollToElement(element);
    	//act.scrollByAmount(80, -20);
    	act.build().perform();
    }
    public void expWait(WebElement element,String action) {
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    	try {
            switch (action) {
                case "visible":
                    wait.until(ExpectedConditions.visibilityOf(element));
                    
                    break;
                case "clickable":
                    wait.until(ExpectedConditions.elementToBeClickable(element));
                    
                    break;
                case "scrollTo":
                    Actions actions = new Actions(driver);
                    actions.moveToElement(element);
                    actions.perform();
                    wait.until(ExpectedConditions.visibilityOf(element));
                    
                    break;
                case "invisible":
                    wait.until(ExpectedConditions.invisibilityOf(element));
                   
                    break;
            }
        } catch (Exception e) {
           System.out.println(e);
            throw e;
        }
    }
//	public void AssertTitle(String element) {
//		if(element.contains(SrchPgFact.title.getText()))
//			System.out.println("Product searched");
//		else
//			System.out.println("Product not found");
//	}
}
