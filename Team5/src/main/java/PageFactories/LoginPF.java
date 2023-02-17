package PageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPF {
	static WebDriver driver ;
	public LoginPF(WebDriver driverInst) {
		PageFactory.initElements(driverInst,this);
		driver=driverInst;
	}
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	public static WebElement LoginBtn;
	@FindBy(xpath="//h1[contains(text(),'Login')]")
	public static WebElement LoginHead;
	@FindBy(id="email")
	public static WebElement emailField;
	@FindBy(id="password")
	public static WebElement pswdField;
	@FindBy(id="admin")
	public static WebElement adminCheckBox;
	@FindBy(xpath="//button[contains(text(),\"Let's Fly\")]")
	public static WebElement LogBtn;
	
}
