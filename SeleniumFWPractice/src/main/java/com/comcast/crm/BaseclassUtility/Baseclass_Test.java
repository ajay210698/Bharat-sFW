package com.comcast.crm.BaseclassUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import com.comcast.crm.objectrepositoryutility.ContactPage;
import com.comcast.crm.objectrepositoryutility.CreateOrgPage;
import com.comcast.crm.objectrepositoryutility.CreatingNewContact;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.OrganizationPage;
import com.generic.Javautility.JavaUtility;
import com.generic.WebDriverutility.WebdriverUtility;
import com.generic.databaseutility.DataBaseUtility;
import com.genericutility.ExcelUtility;
import com.genericutility.PropertyUtility;

@Listeners(com.comcast.ListenersUtility.Listenersusage.class)
public class Baseclass_Test {

	public WebDriver driver = null;
	public static WebDriver sdriver;
	

	public PropertyUtility putil = new PropertyUtility();
	public WebdriverUtility wutil = new WebdriverUtility();
	public ExcelUtility eutil = new ExcelUtility();
	public JavaUtility jutil = new JavaUtility();
	public DataBaseUtility dutil = new DataBaseUtility();

	public LoginPage lp;
	public HomePage hp;
	public OrganizationPage op;
	public CreateOrgPage cop;
	public ContactPage cp;
	public CreatingNewContact cnc;
	public ResultSet rs;
	
	

	@BeforeSuite
	public void ConnectinhToTheDb() throws SQLException {

         dutil.ConnectingToTheDataBase("jdbc:mysql://localhost:3306/sakila", "root", "Bharath@123");

		
	}

	//@Parameters("Browser")
	@BeforeClass
	public void OpeningBrowser() throws IOException {

		driver = wutil.OpenBrowser(driver, putil.GetDataFromPropertyFile("browser"),
				putil.GetDataFromPropertyFile("url"));
      TreadUsage.setDriver(driver);
		
		//TreadUsage.setDriver(driver);
		driver.manage().window().maximize();
		wutil.WaitUntillPageLoded(driver);
		lp = new LoginPage(driver);
		String loginp = lp.getApplogo().getText();
		System.out.println(loginp);
		if ((lp.getApplogo().getText()).equals("vtiger")) {
			System.out.println("login Page Displyed");
		} else {
			System.out.println("mistake is there");
		}

		op = new OrganizationPage(driver);
		cop = new CreateOrgPage(driver);
		cp = new ContactPage(driver);
		cnc = new CreatingNewContact(driver);
	}

	@BeforeMethod
	public void LoggingIntoApp() throws IOException {

		lp.getUsername().sendKeys(putil.GetDataFromPropertyFile("username"));
		lp.getPassword().sendKeys(putil.GetDataFromPropertyFile("password"));
		lp.getLoginbtn().click();
		hp = new HomePage(driver);
		String actualresult = hp.getHomePageLogo().getText();
		String expectedresults = "Home";

		AssertJUnit.assertEquals(actualresult, expectedresults);
		System.out.println("home page displyed");

	}

	@AfterMethod
	public void logoutFromApp() {
		wutil.MOveToELEment(driver, hp.getSignOutSimple());
		hp.getSignOut().click();
		if ((lp.getApplogo().getText()).equals("vtiger")) {
			System.out.println("loggedoff from app succeessfully ");
		} else {
			System.out.println("mistake is there");
		}

	}

	@AfterClass
	public void ClosingTehBrowser() {
		driver.quit();
		System.out.println("browser closed succeessfully");
	}

	@AfterSuite
	public void closingTheDbConnection() throws SQLException {
		dutil.CloseDataBaseConnection();
		System.out.println("connection closed succeessfully");
		
	}

}
