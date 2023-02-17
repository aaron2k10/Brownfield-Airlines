package PageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightHandPF {
	static WebDriver driver ;
	public FlightHandPF(WebDriver driverInst) {
		PageFactory.initElements(driverInst,this);
		driver=driverInst;
	}
	
	@FindBy(xpath="")
	public static WebElement dashboard;
	@FindBy(xpath="")
	public static WebElement menuIcon;
	@FindBy(xpath="")
	public static WebElement ViewOption;
	@FindBy(xpath="")
	public static WebElement ViewHead;
	@FindBy(xpath="")
	public static WebElement UpdateOption;
	@FindBy(xpath="")
	public static WebElement UpdateHead;
	@FindBy(xpath="")
	public static WebElement Record;
	@FindBy(xpath="")
	public static WebElement status;
	@FindBy(xpath="")
	public static WebElement AddOption;
	@FindBy(xpath="")
	public static WebElement AddHead;
	@FindBy(xpath="")
	public static WebElement FlightNo;
	@FindBy(xpath="")
	public static WebElement PlaneNo;
	@FindBy(xpath="")
	public static WebElement SrcLoc;
	@FindBy(xpath="")
	public static WebElement DesLoc;
	@FindBy(xpath="")
	public static WebElement arrH;
	@FindBy(xpath="")
	public static WebElement arrM;
	@FindBy(xpath="")
	public static WebElement depH;
	@FindBy(xpath="")
	public static WebElement depM;
	@FindBy(xpath="")
	public static WebElement noOfSeat;
	@FindBy(xpath="")
	public static WebElement addBtn;
	@FindBy(xpath="")
	public static WebElement acknMsg;
	@FindBy(xpath="")
	public static WebElement locMsg;
	@FindBy(xpath="")
	public static WebElement srchBar;
	@FindBy(xpath="")
	public static WebElement srchMsg;
	@FindBy(xpath="")
	public static WebElement srchRes;
	
}
