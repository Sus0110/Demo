package com.ParaBank.testcases;

    import java.io.IOException;

	
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

    import com.ParaBank.pageobject.LoginPage;
    import com.ParaBank.utilities.XLUtils;

	

	public class TC_LoginTest_002 extends BaseClass
	{

		@Test(dataProvider="LoginData")
		public void loginDDT(String user,String pwd) throws IOException
		{
			driver.get(baseURL);
			logger.info("URL is Open");
			
			LoginPage lp=new LoginPage(driver);
			lp.setUserName(user);
			//Thread.sleep(5000);
			logger.info("user name provided");
			
			lp.setPassword(pwd);
			//Thread.sleep(5000);
			logger.info("password provided");
			
			lp.clickLogin();
			
			
			
			lp.clickLogout();
			//Thread.sleep(5000);
				
			}
			
			
		@DataProvider(name="LoginData")
		String [][] getData() throws IOException
		{
			String path="C:\\Users\\sushma\\eclipse-workspace\\Demo\\src\\com\\ParaBank\\testdata\\LoginData.xlsx";
			
			int rownum=XLUtils.getRowCount(path, "Sheet1");
			int colcount=XLUtils.getCellCount(path,"Sheet1",1);
			
			String logindata[][]=new String[rownum][colcount];
			
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
				}
					
			}
		return logindata;
		}
		
	}
	


