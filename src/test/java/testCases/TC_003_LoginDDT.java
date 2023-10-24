package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT  extends BaseClass
{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test_LoginDDT(String email,String password,String exp)
	{
			
		logger.info("TC_003 started");

		try {
		HomePage hp =new HomePage(driver);
		hp.clickMyAcct();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		
		logger.info("providing login details");
		
		lp.setEmail(email);
		lp.setPass(password);
		lp.clickLogin();
		
		
		
		
		MyAccPage acc=new MyAccPage(driver);
		
		boolean targetpage =acc.isMyAccPageEXists();
		
		if(exp.equals("valid"))
		{
			if(targetpage==true)
			{
				acc.clickLogout();
				acc.logcon();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equals("invalid"))
		{
			if(targetpage==true)
			{
				acc.clickLogout();
				acc.logcon();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		}catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("completed data driven");
		
	}
}
