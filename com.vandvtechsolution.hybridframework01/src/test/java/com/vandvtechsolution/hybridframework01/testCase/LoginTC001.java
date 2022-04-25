package com.vandvtechsolution.hybridframework01.testCase;


import org.testng.annotations.Test;

import com.vandvtechsolution.hybridframework01.pageObject.LoginPage;
import com.vandvtechsolution.hybridframework01.testBase.TestBase;

public class LoginTC001 extends TestBase {


	@Test
	public void verifyLOginFunctionality(){
		LoginPage login = new LoginPage(driver);
		login.setUserName(configdataprovider.getUsername());
		login.setUserName(configdataprovider.getPassword());
		login.clickOnLoginBtn();
		
		
//		LoginPage login = new LoginPage(driver);
//		login.setUserName("mngr341390");
//		login.setPassword("vYmajuh");
//		login.clickOnLoginBtn();
	}
}
