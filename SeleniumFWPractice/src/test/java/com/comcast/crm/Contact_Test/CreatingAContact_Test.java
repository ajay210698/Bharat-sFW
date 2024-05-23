package com.comcast.crm.Contact_Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.ListenersUtility.Listenersusage;
import com.comcast.crm.BaseclassUtility.Baseclass_Test;
@Listeners(com.comcast.ListenersUtility.Listenersusage.class)
public class CreatingAContact_Test extends Baseclass_Test {

	@Test(groups = "smoke")
	public void creatingcontact() throws Throwable {
     
		hp.getContactModule().click();
		Thread.sleep(5000);
		assertEquals(cp.getContactPageHeading().getText(), "Contacts");
	Listenersusage.test.log(Status.INFO,"Contact page displyed");
		cp.getCreateContactButton().click();
		assertEquals(cnc.getCreateContactHeade().getText(), "Creating New Contact");
		Listenersusage.test.log(Status.INFO,"create a new contact page displayed");
		cnc.getEnterFristname().sendKeys(eutil.GetTheDataFromExcelFile("Sheet2", 1, 6));
		String lastName = eutil.GetTheDataFromExcelFile("Sheet2", 1, 5) + jutil.RandomNumber();
		cnc.getEnterLastname().sendKeys(lastName);
		cnc.getEnterMObileNUmber().sendKeys(eutil.GetTheDataFromExcelFile("Sheet2", 1, 4));
		cnc.getSaveContactBitton().click();
		if ((cnc.getCreatedContactHeader().getText()).contains(lastName)) {
			Listenersusage.test.log(Status.PASS,"contact created succeessfully and the id and name of the contact is  "
					+ cnc.getCreatedContactHeader().getText());
		} else
		{
			Listenersusage.test.log(Status.FAIL,"contact not created according to your expextations");
		}
	}
	@Test(groups ={"functional" ,"regression"})
	public void CreatingContactWIthOrgName() throws Throwable
	{
		
		hp.getOrgModule().click();
		   Thread.sleep(5000);
		  String actualresult1 =op.getOrgPageHead().getText();
		  String expectedresult1  = "Organizations";
		  assertEquals(actualresult1, expectedresult1);
		  Listenersusage.test.log(Status.INFO,"organization page displayed ");		 
		  op.getCreatOrgButton().click();		  
		  String actualresult2= cop.getCreateorgPageHeader().getText();
		  String  expectedresult2="Creating New Organization";	  
		  assertEquals(actualresult2, expectedresult2);
		  Listenersusage.test.log(Status.INFO,"create organization page displayed ");
		  String orgname=eutil.GetTheDataFromExcelFile("Sheet2", 1, 2)+jutil.RandomNumber();
		  cop.getOrgnameinput().sendKeys(orgname);
		  //Thread.sleep(5000);
	        cop.getSaveutton().click();
	     if((cop.getCheckingcreatedOrgHead().getText()).contains(orgname)) {
	    	 Listenersusage.test.log(Status.PASS,orgname + "created successfully");
	     }
	     else {
	    	 Listenersusage.test.log(Status.FAIL,orgname + "not created");
	    	 }
		   hp.getContactModule().click();		   
		   Thread.sleep(5000);		   
		   assertEquals(cp.getContactPageHeading().getText(), "Contacts");
		   Listenersusage.test.log(Status.INFO,"Contact page displyed");
		   cp.getCreateContactButton().click();
		   assertEquals(cnc.getCreateContactHeade().getText(), "Creating New Contact");		   
		   Listenersusage.test.log(Status.INFO,"create a new contact page displayed");		   
		   cnc.getEnterFristname().sendKeys(eutil.GetTheDataFromExcelFile("Sheet2", 1, 6));
		   String lastName=eutil.GetTheDataFromExcelFile("Sheet2", 1, 5)+jutil.RandomNumber();
		   cnc.getEnterLastname().sendKeys(lastName);
		   cnc.getEnterMObileNUmber().sendKeys(eutil.GetTheDataFromExcelFile("Sheet2", 1, 4));    		  
		   //cnc.getEnterOrgNameBox().clear();		   
		   cnc.getAddOrgToContactButton().click();		   
		   wutil.SwitchToClildWindowByUrl(driver, "Accounts&action");
		   Thread.sleep(5000);
		   cnc.getSearchBarInChildWindow().sendKeys(orgname);
		   Thread.sleep(5000);
		   wutil.SelectDDByindex(cnc.getSearchDDinChilwindow(), 0);
		   Thread.sleep(5000);
		   cnc.getSearchButtonInChilsWindow().click();
		   Thread.sleep(5000);
		   cnc.getSelectinOrgInchildwindow().click();
		   Thread.sleep(5000);
		   wutil.SwitchToClildWindowByUrl(driver, "Contacts&action");
		   Thread.sleep(5000);
		      cnc.getSaveContactBitton().click();
        if((cnc.getCreatedContactHeader().getText()).contains(lastName)) {			   
        	Listenersusage.test.log(Status.PASS,"contact created succeessfully and the id and name of the contact is  "+ cnc.getCreatedContactHeader().getText());			   
		   }
		   else 		   
		   {
			   Listenersusage.test.log(Status.FAIL,"contact not created according to your expextations");			   
		   }        
        String orgcheckin=cnc.getCheckingTheSavedOrgName().getText().trim();
		   //System.out.println(orgcheckin);
		   Thread.sleep(5000);
		  //assertEquals(actualresult2, expectedresult2); cnc.getCheckingTheSavedOrgName()
		if(orgcheckin.equals(orgname))
		{
			Listenersusage.test.log(Status.PASS,"selected organization is "+ orgname +" and saved organization is "+cnc.getCheckingTheSavedOrgName().getText()+" both are same.");
		}else {
			Listenersusage.test.log(Status.FAIL,"there is a mistake in your script");
		}
	}
	
	@Test(groups = "regression")
	public void CreatingContactWithDate() throws Throwable
	{
		driver.manage().window().maximize();
		//ExtentTest test = reports.createTest("CreatingContactWithDate");

		hp.getContactModule().click();
		Thread.sleep(5000);

		assertEquals(cp.getContactPageHeading().getText(), "Contcts");
		System.out.println("Contact page displyed");
		cp.getCreateContactButton().click();
		assertEquals(cnc.getCreateContactHeade().getText(), "Creating New Contact");

		Listenersusage.test.log(Status.INFO,"create a new contact page displayed");

		cnc.getEnterFristname().sendKeys(eutil.GetTheDataFromExcelFile("Sheet2", 1, 6));
		String lastName = eutil.GetTheDataFromExcelFile("Sheet2", 1, 5) + jutil.RandomNumber();
		cnc.getEnterLastname().sendKeys(lastName);
		cnc.getEnterMObileNUmber().sendKeys(eutil.GetTheDataFromExcelFile("Sheet2", 1, 4));
		String startdate = jutil.GetSystemDate("yyyy-MM-dd");
		String enddate = jutil.requireddate(30, "yyyy-MM-dd");
		//System.out.println(enddate);

		cnc.getEnterSupportStartDate().sendKeys(startdate);
		cnc.getEnterSupportEndDate().clear();
		cnc.getEnterSupportEndDate().sendKeys(enddate);

		Listenersusage.test.log(Status.INFO,cnc.getEnterSupportEndDate().getText());

		cnc.getSaveContactBitton().click();

		if ((cnc.getCreatedContactHeader().getText()).contains(lastName)) {

			Listenersusage.test.log(Status.PASS,"contact created succeessfully and the id and name of the contact is  "
					+ cnc.getCreatedContactHeader().getText());

		} else

		{
			System.out.println("contact not created according to your expextations");

		}
		assertEquals(cnc.getCheckingSupportStartDate().getText(), startdate);

		Listenersusage.test.log(Status.PASS,"the date you enterd : " + startdate + " and the date saved : "
				+ cnc.getCheckingSupportStartDate().getText() + " is same");

		assertEquals(cnc.getCheckingSupportEndDate().getText(), enddate);

		Listenersusage.test.log(Status.PASS,"the date you enterd : " + enddate + " and the date saved : "
				+ cnc.getCheckingSupportEndDate().getText() + " is same");

	}
	}

