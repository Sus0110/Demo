package com.ParaBank.testcases;

//import java.io.IOException;

//import org.testng.Assert;
import org.testng.annotations.Test;

import com.ParaBank.pageobject.OpenNewAccount;

public class TC_OpenNewAccount_003 extends BaseClass{
	
	@Test
	public void OpenAccount()  {
		driver.get(baseURL);
		logger.info("URL is OPen");
		
		OpenNewAccount openacc=new OpenNewAccount(driver);
		openacc.setUserName(username);;
		logger.info("Entered username");
		
		openacc.setPassword(password);
		logger.info("Entered Password");
		openacc.clickLogin();
		
		openacc.clickOpenNewAccount();
		openacc.clickType();
		openacc.FromAccountId();
		openacc.clickSubmit();
		/*openacc.clickLogout();*/
		
    /*  logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Account Opened! Congratulations, your account is now open");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			try {
				captureScreen(driver,"OpenAccount");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Assert.assertTrue(false);
		}
			*/
		
		
	
		
	}
	

}
