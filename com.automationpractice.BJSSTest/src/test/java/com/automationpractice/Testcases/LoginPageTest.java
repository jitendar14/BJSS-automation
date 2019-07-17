package com.automationpractice.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.Base.TestBase;
import com.automationpractice.Pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	
	public LoginPageTest ()
		 
	{
	super();			
	}
	
	
	@BeforeMethod
	public void setup () {
		initialization();
		 loginpage = new LoginPage();
		
	}
	
	
	@Test
	public void loginTest() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
