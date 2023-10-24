package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage

{
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	
	public void setEmail(String email)
	{
		txtEmail.clear();
		txtEmail.sendKeys(email);
		
	}
	
	public void setPass(String pass)
	{
		txtpass.clear();
		txtpass.sendKeys(pass);
		
	}
	
public void clickLogin() 
{
	loginbtn.click();
}
	
}
