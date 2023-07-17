package com.ParaBank.testcases;

import java.io.IOException;

//import org.testng.Assert;
import org.testng.annotations.Test;

import com.ParaBank.pageobject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void LoginTest() throws IOException {
		
		driver.get(baseURL);
		
		logger.info("URL is Open");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		lp.clickLogin();
		
		/*if(driver.getTitle().equals("PARA BANK Welcome to Account Services")) {
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
			
		}
		else {
			captureScreen(driver,"LoginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}*/
		
		
		
	}
	

}
