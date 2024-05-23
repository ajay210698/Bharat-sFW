package com.generic.WebDriverutility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	    WebDriver driver=null;
	   
	
	
	
	     
	public WebDriver OpenBrowser(WebDriver driver, String Browser, String url){
		
		if(Browser.equals("firefox")) {
	    	driver=new FirefoxDriver();
	    }
		else if
			
		(Browser.equals("edge")) {
	    	driver=new EdgeDriver();
	    }
		else if(Browser.equals("chrome")) {
			
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\selenium\\SeleniumFWPractice\\src\\main\\resources\\chrome.exe");
			
	    	driver=new ChromeDriver();
	    }
		
		driver.get(url);
	    return driver;
	   
		 
		
	}
	
	 public void WaitUntillPageLoded(WebDriver driver) {
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
	 }
	
	 public void WaitUntillelementload(WebDriver driver, WebElement ele) {
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOf(ele));
		 }
	 
	  public void SelectDDByVisibleText(WebElement ele, String text)
	  {
		  Select s= new Select(ele);
		  s.selectByValue(text);
		  
	  }
	  public void SelectDDByindex(WebElement ele, int index)
	  {
		  Select s= new Select(ele);
		  s.selectByIndex(index);
	  }
	  public void SwitchToClildWindowByUrl(WebDriver driver, String url) {
		  
		  
		  Set<String> set= driver.getWindowHandles();
		  Iterator<String> it= set.iterator();
		  while(it.hasNext()) {
			  String windowID= it.next();
			  driver.switchTo().window(windowID);
			  String actualurl=driver.getCurrentUrl();
			  if(actualurl.contentEquals(url)) {
				  break;
				  
			  }

		  }
		  
		  
	  }
 public void SwitchToClildWindowByTitle(WebDriver driver, String title) {
		  
		  
		  Set<String> set= driver.getWindowHandles();
		  Iterator<String> it= set.iterator();
		  while(it.hasNext()) {
			  String windowID= it.next();
			  driver.switchTo().window(windowID);
			  String actualtitle=driver.getTitle();
			  if(actualtitle.contentEquals(title)) {
				  break;
				  
			  }

		  }
		  
		  
	  }
 
 
 public void SwitchToFrame(WebDriver driver, int index) {
	 
	 driver.switchTo().frame(index);
	 
 }
public void SwitchToFrame(WebDriver driver, String name) {
	 
	 driver.switchTo().frame(name);
	 
 }
public void SwitchToFrame(WebDriver driver, WebElement ele) {
	 
	 driver.switchTo().frame(ele);
	 
}

public void SwitchToAlertAccept(WebDriver driver) {
	
	driver.switchTo().alert().accept();
	
}
 
public void SwitchToAlertcancel(WebDriver driver) {
	
	driver.switchTo().alert().dismiss();
	
}
public String GetAlertMessage(WebDriver driver) {
	
	String message=driver.switchTo().alert().getText();	
	return message;
}
public void SelectDD(WebElement ele, String text)
{
 Select s= new Select(ele);
 s.selectByVisibleText(text);
}
public void SelectDD(WebElement ele, int index)
{
 Select s= new Select(ele);
 s.selectByIndex(index);
}

public void SelectValue(WebElement ele, String value)
{
 Select s= new Select(ele);
 s.selectByValue(value);
}


public void MOveToELEment(WebDriver driver, WebElement ele)
{
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();

}
 
public void DoubleClickOnELEment(WebDriver driver, WebElement ele)
{
	Actions act = new Actions(driver);
	act.doubleClick(ele).perform();

}
	  
public void rightClickOnELEment(WebDriver driver, WebElement ele)
{
	Actions act = new Actions(driver);
	act.contextClick(ele).build().perform();

}

public void DragAnddropOfELEment(WebDriver driver, WebElement ele1, WebElement ele2)
{
	Actions act = new Actions(driver);
	act.dragAndDrop(ele1, ele2).perform();

}
public void CloseTheWebpage(WebDriver driver) {
	driver.close();
}
public void QuitThebrowser(WebDriver driver) {
	driver.quit();
}
public void TakeScreeShot(WebDriver driver, String destination) throws IOException {
	
	TakesScreenshot sh = (TakesScreenshot)driver;
	File src= sh.getScreenshotAs(OutputType.FILE);
	File des= new File(destination);
	FileUtils.copyFile(src, des);
	






}
}
