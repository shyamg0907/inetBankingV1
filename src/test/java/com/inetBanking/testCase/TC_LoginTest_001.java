package com.inetBanking.testCase;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException
	{
		
		logger.info("URLis opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Etered password");
		lp.clickSubmit();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			//captureScreen(driver,"loginTest");
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		
	}

}
