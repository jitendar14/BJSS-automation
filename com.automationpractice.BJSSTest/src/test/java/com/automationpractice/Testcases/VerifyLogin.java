package com.automationpractice.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automationpractice.Pages.LoginPage;

public class VerifyLogin

{
    @Test
	public void verifyValidLogin()
	
	{
		
    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
    	WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    	
    	LoginPage login=new LoginPage(driver);
    	login.typeemailaddress();
    	login.typepassword();
    	login.typesignin();
    	
    	//driver.quit();
    			
	}
	
}
