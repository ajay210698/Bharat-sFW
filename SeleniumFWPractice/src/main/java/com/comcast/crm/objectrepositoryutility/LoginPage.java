package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath ="//a[text()='vtiger']")
	private WebElement applogo;
	
	

	@FindBy(name ="user_name")
	private WebElement username;

	@FindBy(name ="user_password")
	private WebElement password;
	
	@FindBy(id = "submitButton")
	private WebElement loginbtn;
	
	public WebElement getApplogo() {
		return applogo;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
}
