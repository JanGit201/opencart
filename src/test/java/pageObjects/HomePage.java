package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	//elements
	@FindBy(xpath="//span[.='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath="//a[.='Register']")
	WebElement lnkRegister;
	
	
	@FindBy(xpath="//a[@class='dropdown-item'][.='Login']")
	WebElement lnkLogin;
	
	//actionmethods
	
	public void clickMyAcct()
	{
		lnkMyaccount.click();
	}
	
	
	public void clickReg()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}
	
	
	}

