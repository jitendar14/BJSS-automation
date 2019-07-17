package com.automationpractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.Base.TestBase;

public class HomePage extends TestBase {

	//Page Factory-object repository
	
	@FindBy(xpath=".//*[@id='columns']/div[1]/a/i")
	WebElement Myaccount;
		


 //initializing the page objects
   public HomePage() {
	PageFactory.initElements(driver, this);
	   
   }
   
   //Actions
   public shoppingpage clickonMyAccountButton() {
	 Myaccount.click();  
	 return new shoppingpage();
	 
	  
   }
   
   }



