package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='hdrLink']")
	private WebElement ContactPageHeading;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CreateContactButton;

	public WebElement getContactPageHeading() {
		return ContactPageHeading;
	}

	public WebElement getCreateContactButton() {
		return CreateContactButton;
	}
	
	
	

}
