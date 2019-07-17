package com.automationpractice.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.Base.TestBase;
import com.automationpractice.Pages.AddtocartPage;
import com.automationpractice.Pages.HomePage;
import com.automationpractice.Pages.LoginPage;
import com.automationpractice.Pages.shoppingpage;
import com.automationpractice.Util.TestUtil;

public class ShoppingPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	shoppingpage Shoppingpage;
	
	public ShoppingPageTest() {
		
		super();
		
	}
		
		@BeforeMethod
		public void setup() throws Throwable {
			initialization();
			
			loginpage = new LoginPage();
			homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			shoppingpage shoppingpage = homepage.clickonMyAccountButton();
						Thread.sleep(3000);
		}
		
		
		@Test
		public void shoptest() throws Throwable {
			//TestUtil.switchToFrame();
			//Thread.sleep(3000);
	  AddtocartPage AddtocartPage =   Shoppingpage.ClickonQuickView();
			
		}
		
		
		@AfterMethod
		public void teardown() {
			driver.quit();
		
	}
	
	
	
	
}
