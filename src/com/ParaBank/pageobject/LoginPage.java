package com.ParaBank.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="username")
	//@CacheLookup
	WebElement Enterusername;
	
	@FindBy(name="password")
	WebElement EnterPassword;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement ClickLogIn;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	WebElement ClickLogOut;
	
	public void setUserName(String UserName) {
		Enterusername.sendKeys(UserName);
		
	}
	
    public void setPassword(String Password) {
		EnterPassword.sendKeys(Password);
	}
	public void clickLogin() {
		ClickLogIn.click();
	}
	
	public void clickLogout() {
		ClickLogOut.click();
	}
	

}
