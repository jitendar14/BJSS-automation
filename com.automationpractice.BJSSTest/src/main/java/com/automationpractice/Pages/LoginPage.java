package com.automationpractice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.Base.TestBase;

public class LoginPage extends TestBase {

	
	//Page Factory-object repository
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement signin;
	
	
	
	//Initializing the Page objects
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
		
	//Actions
	public HomePage login(String un, String pwd)
	{
		username.sendKeys(un);
	password.sendKeys(pwd);
	signin.click();
	return new HomePage();
	
	//return new Homepage();
		

	
	 }
	
	
}
	/**WebDriver driver;
	
	By emailaddress=By.id("email");
	By password=By.xpath(".//*[@id='passwd']");
	By signin=By.name("SubmitLogin");
	
	
	public LoginPage(WebDriver driver)
	{
	 this.driver=driver;	
	}
	
	public void typeemailaddress()
	{
		driver.findElement(emailaddress).sendKeys("jitendareric@gmail.com");
	}
	
	public void typepassword()
	{
	 driver.findElement(password).sendKeys("BJSSTest");	
	}
	
	public void typesignin()
	{
	driver.findElement(signin).click();
		
	}*/
	

