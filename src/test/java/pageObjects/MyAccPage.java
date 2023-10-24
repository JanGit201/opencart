package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class MyAccPage extends BasePage

{
	public MyAccPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//h2[.='My Account']")
	WebElement msgHeading;
	
	@FindBy(xpath="//a[contains(@class,'dropdown-item')][.='Logout']")
	WebElement lnkLogout;
	
	@FindBy(xpath="//a[.='Continue']")
	WebElement logoutcont;
	
	
	public void logcon()
	{
		logoutcont.click();
	}
	
	
	public boolean isMyAccPageEXists()
	{
		try
		{
			return(msgHeading.isDisplayed());
			
					
		}catch(Exception e)
		{
			return(false);
		}
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
