package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText = "Contacts")
	private WebElement contactlink;
	
	@FindBy(xpath = "//img[contains(@src,'user')]")
	private WebElement profilicon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutlink;
	
	public HomePage(WebDriver driver) {
	PageFactory.initElements( driver,this);
	}

	public WebElement getContactlink() {
		return contactlink;
	}

	public WebElement getProfilicon() {
		return profilicon;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}
	

}
