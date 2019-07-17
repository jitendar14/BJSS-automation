package com.automationpractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.Base.TestBase;

public class shoppingpage extends TestBase {

		
	//Page Factory-object repository

	@FindBy(xpath="html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[3]/div/div[1]/div/a[2]/span")
	WebElement QuickView;
	
	
	//initializing the page objects
	public shoppingpage() {
		
		PageFactory.initElements(driver, this);				
		
	}
	
	
	//Actions
	
	public AddtocartPage ClickonQuickView() {
		QuickView.click();
		return new AddtocartPage();
		
		
	}
	
}
