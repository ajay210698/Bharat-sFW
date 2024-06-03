package com.comcast.crm.Organizations_Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.BaseclassUtility.Baseclass_Test;
import com.comcast.crm.BaseclassUtility.TreadUsage;

public class CreateOrgnizationTest extends Baseclass_Test {

	@Test(groups = "smoke")
	public void CreateOrganization() throws Throwable {
		hp.getOrgModule().click();
		Thread.sleep(5000);
		String actualresult1 = op.getOrgPageHead().getText();
		String expectedresult1 = "Organizations";
		assertEquals(actualresult1, expectedresult1);
		 TreadUsage.getTest().log(Status.INFO,"organization page displayed ");
		op.getCreatOrgButton().click();
		String actualresult2 = cop.getCreateorgPageHeader().getText();
		String expectedresult2 = "Creating New Organization";
		assertEquals(actualresult2, expectedresult2);
		 TreadUsage.getTest().log(Status.INFO,"create organization page displayed ");
		String orgname = eutil.GetTheDataFromExcelFile("Sheet2", 1, 0) + jutil.RandomNumber();
		cop.getOrgnameinput().sendKeys(orgname);
		cop.getSaveutton().click();
		if ((cop.getCheckingcreatedOrgHead().getText()).contains(orgname)) {
			 TreadUsage.getTest().log(Status.PASS, orgname + "created successfully");
		} else {
			TreadUsage.getTest().log(Status.FAIL, orgname + " not created successfully");
		}
		
	}

	@Test(groups = {"smoke","regression"})
	public void CreatingOrgWithIndustryTpe() throws Throwable {
		hp.getOrgModule().click();
		Thread.sleep(5000);
		// wutil.WaitUntillelementload(driver, op.getOrgPageHead());
		String actualresult1 = op.getOrgPageHead().getText();
		TreadUsage.getTest().log(Status.INFO,actualresult1);
		String expectedresult1 = "Organizations";
		assertEquals(actualresult1, expectedresult1);
		TreadUsage.getTest().log(Status.INFO,"organization page displayed ");
		op.getCreatOrgButton().click();
		String actualresult2 = cop.getCreateorgPageHeader().getText();
		String expectedresult2 = "Creating New Organization";
		assertEquals(actualresult2, expectedresult2);
		TreadUsage.getTest().log(Status.INFO,"create organization page displayed ");
		String orgname = eutil.GetTheDataFromExcelFile("Sheet2", 1, 0) + jutil.RandomNumber();
		cop.getOrgnameinput().sendKeys(orgname);
		wutil.SelectDD(cop.getIndustryTypeInputDD(), 2);
		wutil.SelectDD(cop.getTypeInputDD(), 2);
		String industrytext = cop.getIndustryTypeInputDD().getText();
		// System.out.println(industrytext);
		String typetext = cop.getTypeInputDD().getText();
		cop.getSaveutton().click();
		if ((cop.getCheckingcreatedOrgHead().getText()).contains(orgname)) {
			TreadUsage.getTest().log(Status.PASS, orgname + "  created successfully");
		} else {
			// cop.getCreateorgPageHeader();
			TreadUsage.getTest().log(Status.FAIL,"org not created");

		}
		if (industrytext.contains(cop.getCheckingIdustryDetails().getText()))
			;
		{
			TreadUsage.getTest().log(Status.INFO,"selected Industry type is  " + cop.getCheckingIdustryDetails().getText());

		}
		if (typetext.contains(cop.getCheckingTypeDetails().getText()))
			;
		{
			TreadUsage.getTest().log(Status.INFO,"selected type is  " + cop.getCheckingTypeDetails().getText());
		}
	}

	@Test(groups = "regression")
	public void CreatingOrgWithPhoneNumber() throws Throwable {
		hp.getOrgModule().click();
		Thread.sleep(5000);
		String actualresult1 = op.getOrgPageHead().getText();
		String expectedresult1 = "Organizations";
		assertEquals(actualresult1, expectedresult1);
		TreadUsage.getTest().log(Status.INFO,"organization page displayed ");
		op.getCreatOrgButton().click();
		String actualresult2 = cop.getCreateorgPageHeader().getText();
		String expectedresult2 = "Creating New Organization";
		assertEquals(actualresult2, expectedresult2);
		TreadUsage.getTest().log(Status.INFO,"create organization page displayed ");
		String orgname = eutil.GetTheDataFromExcelFile("Sheet2", 1, 2) + jutil.RandomNumber();
		cop.getOrgnameinput().sendKeys(orgname);
		cop.getPhoneInput().sendKeys(eutil.GetTheDataFromExcelFile("Sheet2", 1, 4));
		cop.getSaveutton().click();
		if ((cop.getCheckingcreatedOrgHead().getText()).contains(orgname)) {
			TreadUsage.getTest().log(Status.PASS,orgname + "created successfully");
		} else {
			TreadUsage.getTest().log(Status.FAIL,orgname + "not created successfully");
		}
		String phonenumber = cop.getCheckingCreatedPhoneNumber().getText().trim();
		TreadUsage.getTest().log(Status.INFO,phonenumber);
		assertEquals(eutil.GetTheDataFromExcelFile("Sheet2", 1, 4), phonenumber);
	}
}
