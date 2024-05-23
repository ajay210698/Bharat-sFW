package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrgPage {
	
	
	
	public CreateOrgPage( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "mouseArea_Phone")
	private WebElement CheckingCreatedPhoneNumber;
	
	public WebElement getCheckingCreatedPhoneNumber() {
		return CheckingCreatedPhoneNumber;
	}

	@FindBy(xpath = "//span[text()='Creating New Organization']")
	private WebElement CreateorgPageHeader;
	
	@FindBy(xpath = "//input[@class='crmbutton small save']")
     private WebElement Saveutton;
	
	
	@FindBy(xpath = "//input[@title='Cancel [Alt+X]']")
	private WebElement CancelButton;
	
	
	@FindBy(name = "accountname")
	private WebElement orgnameinput;
	
	@FindBy(id = "account_no")
	private WebElement accountId;
	
	@FindBy(name = "website")
	private WebElement WebsiteInput;
	
	@FindBy(id = "phone")
	private WebElement PhoneInput;
	
	@FindBy(name = "industry")
	private WebElement IndustryTypeInputDD;
	
	@FindBy(name = "rating")
	private WebElement RatingInputDD;
	
	
	@FindBy(name = "accounttype")
	private WebElement TypeInputDD;
	
	@FindBy(name = "bill_street")
	private WebElement AdressInput;

	
	@FindBy(xpath = "//span[@CLASS='dvHeaderText']")
	private WebElement CheckingcreatedOrgHead;
	
	
	@FindBy(xpath = "//span[@id='dtlview_Organization Name']")
	private WebElement CheckingCreatedOrgName;
	
	@FindBy(xpath = "//td[@class='dvtCellInfo']/../../tr/td/following-sibling::td[3]")
	private WebElement NewOrgId;
	
	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement ButtonTogoorganiztionFromCReatOgganization;
	
	
	@FindBy(id = "dtlview_Industry")
	private WebElement checkingIdustryDetails;
	
	
	public WebElement getCheckingIdustryDetails() {
		return checkingIdustryDetails;
	}

	public WebElement getCheckingTypeDetails() {
		return checkingTypeDetails;
	}


	@FindBy(id = "dtlview_Type")
	private WebElement checkingTypeDetails;

	public WebElement getCreateorgPageHeader() {
		return CreateorgPageHeader;
	}

	public WebElement getSaveutton() {
		return Saveutton;
	}

	public WebElement getCancelButton() {
		return CancelButton;
	}

	public WebElement getOrgnameinput() {
		return orgnameinput;
	}

	public WebElement getAccountId() {
		return accountId;
	}

	public WebElement getWebsiteInput() {
		return WebsiteInput;
	}

	public WebElement getPhoneInput() {
		return PhoneInput;
	}

	public WebElement getIndustryTypeInputDD() {
		return IndustryTypeInputDD;
	}

	public WebElement getRatingInputDD() {
		return RatingInputDD;
	}

	public WebElement getTypeInputDD() {
		return TypeInputDD;
	}

	public WebElement getAdressInput() {
		return AdressInput;
	}

	public WebElement getCheckingcreatedOrgHead() {
		return CheckingcreatedOrgHead;
	}

	public WebElement getCheckingCreatedOrgName() {
		return CheckingCreatedOrgName;
	}

	public WebElement getNewOrgId() {
		return NewOrgId;
	}

	public WebElement getButtonTogoorganiztionFromCReatOgganization() {
		return ButtonTogoorganiztionFromCReatOgganization;
	}
	
	
	
	
	

}
