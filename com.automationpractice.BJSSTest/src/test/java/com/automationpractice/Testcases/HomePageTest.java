package com.automationpractice.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.Base.TestBase;
import com.automationpractice.Pages.HomePage;
import com.automationpractice.Pages.LoginPage;
import com.automationpractice.Pages.shoppingpage;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	
	public HomePageTest() {
		
		super();
	}


	@BeforeMethod
	public void setup () {
		initialization();
		
		 loginpage = new LoginPage();
			homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			
}
	@Test
	public void hometest() {
		
	shoppingpage shoppingpage = homepage.clickonMyAccountButton();
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
