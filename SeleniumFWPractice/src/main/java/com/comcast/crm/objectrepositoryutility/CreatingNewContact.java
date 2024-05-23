package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContact {
	
	public CreatingNewContact(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "mobile")
	private WebElement EnterMobileNUmber;
	
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement addingorgtocontact;
	
	public WebElement getEnterMObileNUmber() {
		return EnterMobileNUmber;
	}
	public WebElement getEnterMobileNUmber() {
		return EnterMobileNUmber;
	}


	public WebElement getAddingorgtocontact() {
		return addingorgtocontact;
	}
	@FindBy(xpath = "//span[text()='Creating New Contact']")
	private WebElement CreateContactHeade;
	
	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement FristNameDD;
	
	@FindBy(name = "firstname")
	private WebElement EnterFristname;
	
	
	  @FindBy(name = "contact_no")
	private WebElement newcontactid;
	 
	@FindBy(name ="lastname")
	private WebElement EnterLastname;
	
	@FindBy(name = "phone")
	private WebElement EnterphoneNumber;
	
	 @FindBy(xpath = "//img[@title='Select']")
	private WebElement AddOrgToContactButton;
	
	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement LeadSorceDD;
	
	@FindBy(xpath = "//input[@name='support_start_date']")
	private WebElement EnterSupportStartDate;
	
	@FindBy(xpath = "//input[@name='support_end_date']")
	private WebElement EnterSupportEndDate;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement SaveContactBitton;
	
	@FindBy(xpath = "//input[@title='Cancel [Alt+X]']")
	private WebElement CancelContactButton;
	
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement CreatedContactHeader;
	
	@FindBy(xpath = "//td[@class='dvtCellInfo']/../../tr/td[4]")
	private WebElement CheckingTheConatctId;
	
	@FindBy(xpath = "//td[@id='mouseArea_Mobile']")
	private WebElement CheckingMobileNumber;
	
	/*@FindBy(xpath = "//td[@class='dvtCellInfo']/../../tr[12]/td[2]")
	private WebElement CheckingSupportStartDate;
	
	@FindBy(xpath = "//td[@class='dvtCellInfo']/../../tr[13]/td[2]")
	private WebElement CheckingSupprotEndDate;*/
	 
     @FindBy(id = "dtlview_Support Start Date")
     private WebElement CheckingSupportStartDate;
     
     
     @FindBy(id = "dtlview_Support End Date")
     private WebElement CheckingSupportEndDate;
     
     
     
     
     @FindBy(id = "search_txt")
     private WebElement SearchBarInChildWindow;
     
     @FindBy(xpath = "//select[@class='txtBox']")
     private WebElement SearchDDinChilwindow;
     
     
     @FindBy(xpath = "//input[@class='crmbutton small create']")
     private WebElement SearchButtonInChilsWindow;
     
    @FindBy(xpath = "//a[@id='1']")
    private WebElement SelectinOrgInchildwindow;
    
    @FindBy(id = "mouseArea_Organization Name")
    private WebElement CheckingTheSavedOrgName;
    
    @FindBy(xpath = "//input[@name='account_name']")
    private WebElement enterOrgNameBox;


	public WebElement getEnterOrgNameBox() {
		return enterOrgNameBox;
	}
	public WebElement getCheckingTheSavedOrgName() {
		return CheckingTheSavedOrgName;
	}
	public WebElement getSearchBarInChildWindow() {
		return SearchBarInChildWindow;
	}
	public WebElement getSearchDDinChilwindow() {
		return SearchDDinChilwindow;
	}
	public WebElement getSearchButtonInChilsWindow() {
		return SearchButtonInChilsWindow;
	}
	public WebElement getSelectinOrgInchildwindow() {
		return SelectinOrgInchildwindow;
	}
	public WebElement getCreateContactHeade() {
		return CreateContactHeade;
	}


	public WebElement getFristNameDD() {
		return FristNameDD;
	}


	public WebElement getEnterFristname() {
		return EnterFristname;
	}


	public WebElement getNewcontactid() {
		return newcontactid;
	}


	public WebElement getEnterLastname() {
		return EnterLastname;
	}


	public WebElement getEnterphoneNumber() {
		return EnterphoneNumber;
	}


	public WebElement getAddOrgToContactButton() {
		return AddOrgToContactButton;
	}


	public WebElement getLeadSorceDD() {
		return LeadSorceDD;
	}


	public WebElement getEnterSupportStartDate() {
		return EnterSupportStartDate;
	}


	public WebElement getEnterSupportEndDate() {
		return EnterSupportEndDate;
	}


	public WebElement getSaveContactBitton() {
		return SaveContactBitton;
	}


	public WebElement getCancelContactButton() {
		return CancelContactButton;
	}


	public WebElement getCreatedContactHeader() {
		return CreatedContactHeader;
	}


	public WebElement getCheckingTheConatctId() {
		return CheckingTheConatctId;
	}


	public WebElement getCheckingMobileNumber() {
		return CheckingMobileNumber;
	}


	public WebElement getCheckingSupportStartDate() {
		return CheckingSupportStartDate;
	}


	public WebElement getCheckingSupportEndDate() {
		return CheckingSupportEndDate;
	}
     
     
     
     
     
     
     
     
     
     
     
     
}
