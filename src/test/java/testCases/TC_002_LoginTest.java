package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{
	
	@Test(groups= {"Sanity","Master"})
	public void test_login()
	
	{
		try
		{
		
		
		logger.info("*****starting login test****");
		
		
		HomePage hp =new HomePage(driver);
		hp.clickMyAcct();
		
		logger.info("clicked on my acc");
		hp.clickLogin();
		logger.info("clicked on my login");
		
		
		
		
		LoginPage lp=new LoginPage(driver);
		
		logger.info("providing login details");
		
		lp.setEmail(rb.getString("email"));
		lp.setPass(rb.getString("password"));
		lp.clickLogin();
		
		logger.info("clicked on login");
		
		MyAccPage acc=new MyAccPage(driver);
		
		boolean targetpage =acc.isMyAccPageEXists();
		Assert.assertEquals(targetpage, true);
		}
		
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("****Finished Login TestCase****");
	}
}
