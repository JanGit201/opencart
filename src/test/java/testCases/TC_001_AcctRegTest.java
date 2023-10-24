package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AcctReg;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AcctRegTest extends BaseClass

{
	
	@Test(groups= {"Regression","Master"})
	void test_Acct_reg() throws InterruptedException 
	{	
		Thread.sleep(5000);
		logger.debug("Application logs");
		logger.info("Starting log file TC_001_AcctRegTest");
		try 
		{
		
		HomePage hp=new HomePage(driver);
		
		hp.clickMyAcct();
		logger.info("clicked on myacct");
		
		hp.clickReg();
		logger.info("clicked on reg link");
		AcctReg ar=new AcctReg(driver);
		
		
		logger.info("Providing customer data");
		ar.setFirstName(randomeString());
		ar.setLastName(randomeString());
		
		//Thread.sleep(3000);
		ar.email(randomeString()+"@gmail.com");
		//ar.setTelephone(randomeNumber());
		
		String password=randomAlphanumeric();
		ar.setPassword(password);
		//ar.setConfirmPassword(password);
		
		
		ar.setPrivacyPolicy();
		
		Thread.sleep(3000);
		ar.clickContinue();
		
		logger.info("clicked on cont");
		
		
		
		
		
		
		
		String cmsg=ar.getConfirmationmsg();
		logger.info("validating the msg");
		Assert.assertEquals(cmsg,"Your Account Has Been Created");
		
		
		}
	catch(Exception e)
	{
		logger.error("not getting expected msg");
		Assert.fail();
	}
		logger.info("**Finished TC_001_AcctRegTest***");
		
	}

}

