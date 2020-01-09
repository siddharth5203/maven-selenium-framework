package com.orangehrm.test;

import org.testng.annotations.Test;

import com.orangehrm.comman.BaseSelenium;
import com.orangehrm.pages.LoginPage;

public class LoginTest extends BaseSelenium{

	@Test
	public void verifyValidUsernamePassword() {
		LoginPage lp = new LoginPage();
		lp.login("admin", "admin").verifyWelComeText("Welcome Admin");
	}
}
