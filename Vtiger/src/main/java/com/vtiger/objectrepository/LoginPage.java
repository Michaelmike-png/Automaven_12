package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

@FindBy (name  = "User Name")
private WebElement UserNameTextfield;

@FindBy(name ="user_password")
private WebElement PasswordTextField;

@FindBy(id="submitButton")
private WebElement LoginButton;


public LoginPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}


public WebElement getUserNameTextfield() {
	return UserNameTextfield;
}


public WebElement getPasswordTextField() {
	return PasswordTextField;
}


public WebElement getLoginButton() {
	return LoginButton;
}

}
	