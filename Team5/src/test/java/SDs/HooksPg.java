package SDs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactories.FlightHandPF;
import PageFactories.RegisterPF;
import UtilPack.AutoBase;
import UtilPack.utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksPg {
	static WebDriver driver;
	 public static void initPageDrivers(WebDriver driver) {
	        new RegisterPF(driver);
	        new utility(driver);
	        new RegisterSd(driver);
	        new AutoBase(driver);
	        new FlightHandSd(driver);
	        new FlightHandPF(driver);
	        new LoginSd(driver);
	       //new App_SD(driver);
	    }
	@Before("@tag1")
	public void open_browser(Scenario scenario) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       initPageDrivers(driver);
		driver.manage().window().maximize();
	}
	
	 @After("@tag1")
	    public void quitBrowser() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
