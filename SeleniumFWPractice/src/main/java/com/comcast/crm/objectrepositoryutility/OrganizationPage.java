package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	
	public OrganizationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@class='hdrLink']")
	private WebElement OrgPageHead;
	
	public WebElement getOrgPageHead() {
		return OrgPageHead;
	}

	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
   private WebElement CreatOrgButton;
	
	
	@FindBy(xpath = "//input[@class='txtBox']")
	private WebElement SearchBox;
	
	
	@FindBy(xpath ="//select[@name='search_field']")
	private WebElement SearchByDD;
	
	
	@FindBy(name ="submit")
	private WebElement Searchbutton;


	public WebElement getCreatOrgButton() {
		return CreatOrgButton;
	}


	public WebElement getSearchBox() {
		return SearchBox;
	}


	public WebElement getSearchByDD() {
		return SearchByDD;
	}


	public WebElement getSearchbutton() {
		return Searchbutton;
	}
	
	
	
	
	
	

}
