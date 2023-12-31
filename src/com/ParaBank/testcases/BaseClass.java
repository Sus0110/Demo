package com.ParaBank.testcases;
//import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.IOException;
//import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.ParaBank.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	
	//@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() {
		
		logger=Logger.getLogger("ParaBank");
		PropertyConfigurator.configure("log4j.properties");
        
	System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver=new ChromeDriver();
		
		
		
		}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}


}
