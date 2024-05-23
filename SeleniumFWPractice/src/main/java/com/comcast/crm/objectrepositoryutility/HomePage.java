package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(className = "hdrLink")
	private WebElement HomePageLogo;
	
	@FindBy(xpath = "//a[text()='Organizations']")
    private WebElement OrgModule;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement SignOutSimple;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement SignOut;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactModule;
	
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement producsModule;
	  
	@FindBy(xpath = "//a[text()='Email']")
	private WebElement EmailModule;
	
	@FindBy(xpath = "//a[text()='Troble Tickets']")
	private WebElement TrobleTicketsModule;
	
	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement DashboardModule;
	
	@FindBy(xpath = "//td[@class='tabUnSelected'][11]")
	private WebElement MoreModule;

	public WebElement getHomePageLogo() {
		return HomePageLogo;
	}

	public WebElement getOrgModule() {
		return OrgModule;
	}

	public WebElement getSignOutSimple() {
		return SignOutSimple;
	}

	public WebElement getSignOut() {
		return SignOut;
	}

	public WebElement getContactModule() {
		return contactModule;
	}

	public WebElement getProducsModule() {
		return producsModule;
	}

	public WebElement getEmailModule() {
		return EmailModule;
	}

	public WebElement getTrobleTicketsModule() {
		return TrobleTicketsModule;
	}

	public WebElement getDashboardModule() {
		return DashboardModule;
	}

	public WebElement getMoreModule() {
		return MoreModule;
	}
	
	
	
	
	
	
	
	
}
