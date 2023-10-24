package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcctReg extends BasePage
{
	public AcctReg(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@placeholder='E-Mail']")
	WebElement txtEmail;
	
	//@FindBy(name="telephone")
	//WebElement txtTelephone;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtPassword;
	
	//@FindBy(name="confirm")
	//WebElement txtConfirmPassword;
	
	
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdpolicy;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement btncontinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	@FindBy(xpath="(//a[@class='btn btn-primary'])[1]")
	WebElement locont;
	
	
	public void loconti()
	{
		locont.click();
	}
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
		
	}
	
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
		
	}
	
	public void email(String email)
	{
		txtEmail.sendKeys(email);
	}
	
/*	public void setTelephone(String tel)
	{
		txtTelephone.sendKeys(tel);
	}
*/
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
/*	public void setConfirmPassword(String pwd)
	{
		txtConfirmPassword.sendKeys(pwd);
	}
*/
	
	public void clickContinue()
	{
		btncontinue.click();
	}
	
	public void setPrivacyPolicy()
	{
		chkdpolicy.click();
	}
	
	public String getConfirmationmsg()
	{	
		try
		{
			return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
		
	}