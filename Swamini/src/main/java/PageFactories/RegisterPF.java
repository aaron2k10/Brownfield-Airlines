package PageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPF {
	static WebDriver driver ;
	public RegisterPF(WebDriver driverInst) {
		PageFactory.initElements(driverInst,this);
		driver=driverInst;
	}
	@FindBy(name="fisrtName")
	public static WebElement fName;
	@FindBy(name="lastName")
	public static WebElement LName;
	@FindBy(xpath="//button[contains(text(),'Signup')]")
	public static WebElement RegBtn;
	@FindBy(xpath="//fieldset/h1")
	public static WebElement SignUpHead;
	@FindBy(xpath="//div[contains(text(),'Fisrt Name is required')]")
	public static WebElement missFnameMsg;
	@FindBy(xpath="//div[contains(text(),'Last Name is required')]")
	public static WebElement missLnameMsg;
	@FindBy(xpath="//div[contains(text(),'Email is required')]")
	public static WebElement missEmailMsg;
	@FindBy(xpath="//div[contains(text(),'A phone number is required')]")
	public static WebElement missMobMsg;
	@FindBy(xpath="//div[contains(text(),'Password is required')]")
	public static WebElement missPass;
	@FindBy(xpath="//div[contains(text(),'Gender is required')]")
	public static WebElement missGen;
	@FindBy(xpath="//div[contains(text(),'digits not allowed in first name')]")
	public static WebElement fnameMsg;
	@FindBy(xpath="//div[contains(text(),'digits not allowed in last name')]")
	public static WebElement lnameMsg;
	@FindBy(name="phoneNumber")
	public static WebElement mob;
	@FindBy(xpath="//div[contains(text(),\"Please enter a valid phone number\")]")
	public static WebElement mobMsg;
	@FindBy(name="email")
	public static WebElement email;
	@FindBy(xpath="//div[contains(text(),'Invalid email')]")
	public static WebElement emailMsg;
	@FindBy(name="password")
	public static WebElement pass;
	@FindBy(xpath="//div[contains(text(),\"Password must\")]")
	public static WebElement passMsg;
	@FindBy(name="confirmPassword")
	public static WebElement Cpass;
	@FindBy(xpath="//div[contains(text(),\"Passwords must\")]")
	public static WebElement confPassMsg;
	@FindBy(xpath="//input[@value='male']")
	public static WebElement Mradio;
	@FindBy(xpath="//input[@value='female']")
	public static WebElement Fradio;
	@FindBy(xpath="//input[@value='other']")
	public static WebElement Oradio;
	@FindBy(xpath="/html/body/div/div/form/div/div[1]/div/div[1]/div[2]/div[4]/div/div/div")
	public static WebElement calIcon;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div")
	public static WebElement monYear;
	@FindBy(xpath="/html/body/div/div/form/div/div[1]/div/div[1]/div[2]/div[4]/div/div/input")
	public static WebElement DOBtext;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/button")
	public static WebElement yearArrow;
	@FindBy(xpath="//div[contains(text(),'Valid Date of Birth is required')]")
	public static WebElement DOBmsg;
	@FindBy(xpath="//button[contains(text(),'2000')]")
	public static WebElement yearVal;
	@FindBy(id="btn-signup")
	public static WebElement SubmitBtn;
	@FindBy(xpath="//div[contains(text(),'Brownfield']")
	public static WebElement HomePgHead;
}

