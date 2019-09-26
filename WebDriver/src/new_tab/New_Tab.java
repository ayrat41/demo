package new_tab;

import org.testng.annotations.Test;

import Facebook.Actionbuilder;

import org.testng.annotations.BeforeMethod;

import java.awt.Desktop.Action;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class New_Tab {
  WebDriver driver;
  @Test 

  public void openLinkInNewTab() {
	  driver.findElement(By.linkText("Orders")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.open()");  
	  
	  driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL + "t"));
	  
	  ArrayList <String> tabs = new ArrayList<String>(driver.getWindowHandles());
	 	  
	  System.out.println(tabs);	
	  driver.switchTo().window(tabs.get(1));
	  Actions act = new Actions(driver);
      act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform(); 
  }
  
//  @Test
//  public void OpenNewEmptyTab() throws Exception {
//	  ((JavascriptExecutor)driver).executeScript("alert('Test')");
//	  Thread.sleep(50000);
//	  driver.switchTo().alert().accept();
//	  driver.findElement(By.tagName("body")).sendKeys(Keys.chord(Keys.CONTROL,"t"));
//	  driver.findElement(By.cssSelector("body")).click();
//	  driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,"N"));
//	  Actions builder = new Actions(driver);
//	  builder.keyDown(Keys.CONTROL).sendKeys("n").build().perform();;
//	  
//	  JavascriptExecutor js = (JavascriptExecutor)driver;
//	  js.executeScript("window.open()");
//  }
//  
@BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://amazon.com/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
//	driver.close();
//	driver.quit();
  }

}
