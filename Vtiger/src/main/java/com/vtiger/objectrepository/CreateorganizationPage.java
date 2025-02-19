package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateorganizationPage {
	
	@FindBy(name = "accountname")
	private WebElement accountnametextfield;
	
	@FindBy(name = "industry")
	private WebElement industarydropdownlist;
	
	@FindBy(name = "accounttype")
	private WebElement typedropdownlist;
	
	@FindBy(name = "button")
	private WebElement savebutton;
	
	public CreateorganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAccountnametextfield() {
		return accountnametextfield;
	}

	public WebElement getIndustarydropdownlist() {
		return industarydropdownlist;
	}

	public WebElement getTypedropdownlist() {
		return typedropdownlist;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

}
