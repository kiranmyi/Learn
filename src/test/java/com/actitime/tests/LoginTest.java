package com.actitime.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void login()
	{
		LoginPage lp=new LoginPage(driver);
		lp.verifyTitle("Facebook – log in or sign up");
		lp.enterEmail();
		lp.enterPassword();
		lp.clickOn();
	}

}
