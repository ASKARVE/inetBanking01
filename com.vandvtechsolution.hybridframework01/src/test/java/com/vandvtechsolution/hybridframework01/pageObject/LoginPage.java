package com.vandvtechsolution.hybridframework01.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;




public class LoginPage {

	
	WebDriver driver;
	@FindBy(name = "uid")
	WebElement txtUsername;
	
	@FindBy(name ="password")
	WebElement txtPassword;
	
	@FindBy(name ="btnLogin")
	WebElement loginBtn;
	
	
	public LoginPage(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setUserName(String username) {
		try {
			txtUsername.clear();
			txtUsername.sendKeys(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void setPassword(String pass) {
		try {
			txtPassword.clear();
			txtPassword.sendKeys(pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public HomePage clickOnLoginBtn() {
		try {
			loginBtn.click();
		String	Exp_Home_Title = "Guru99 Bank Manager HomePage";
		String	Act_Home_Title = driver.getTitle();
		if(Exp_Home_Title.equals(Act_Home_Title)){
			Assert.assertTrue(true);
			return new HomePage(driver);
		}
		else {
			Assert.assertTrue(false);
			return null;
		}
				
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
}
