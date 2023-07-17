package com.ParaBank.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenNewAccount {
	
WebDriver ldriver;
	
	public OpenNewAccount(WebDriver rdriver){
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);

}
	@FindBy(name="username")
	@CacheLookup
	WebElement Enterusername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement EnterPassword;
	
	@FindBy(xpath="//input[@value='Log In']")
	@CacheLookup
	WebElement ClickLogIn;
	
	@FindBy(xpath="//*[@id=\"leftPanel\"]/ul/li[1]/a")
	@CacheLookup
	WebElement ClickOpenNewAccount;
	
	@FindBy(xpath="//select[@id='type']")
	@CacheLookup
	WebElement Click;
	
	
	@FindBy(xpath="//select[@id='fromAccountId']")
	@CacheLookup
	WebElement ClickOnNumber;
	
	@FindBy(xpath="//input[@value='Open New Account']")
	@CacheLookup
	WebElement ClickSubmit;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	@CacheLookup
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
	
	public void clickOpenNewAccount() {
		ClickOpenNewAccount.click();
	}
	
	public void clickType() {
		Click.click();
	}
	
	public void FromAccountId() {
		ClickOnNumber.click();
	}
	
	public void clickSubmit() {
		ClickSubmit.click();
	}
	
	public void clickLogout() {
		ClickLogOut.click();
	}
	
	
	
	
}
