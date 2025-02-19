package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	
	@FindBy (name = "lastname")
	private WebElement lastnametextfield;
	
	@FindBy (name = "button")
	private WebElement savebutton;
	
	
	
	public CreateContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	

}
