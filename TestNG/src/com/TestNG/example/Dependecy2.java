package com.TestNG.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Dependecy2 {
	WebDriver driver;
  
  @Test (dependsOnMethods = {"beforeMethod"})
  public void CheckHomeCruise() throws Exception {
	 Thread.sleep(3000);
	 Assert.assertTrue(driver.findElement(By.id("tab-cruise-tab-hp")).isDisplayed());
	 driver.findElement(By.id("tab-cruise-tab-hp")).click();
	 Thread.sleep(3000);
	 Date d = new Date();
	 String color = driver.findElement(By.xpath("//*[@id=\"tab-cruise-tab-hp\"]")).getCssValue("background-color");
	 System.out.println(color);
	 String hex = Color.fromString(color).asHex();
	 System.out.println(hex);
     Reporter.log("CheckHomeCruise done, button selected" + d);
  }
  
  @Test
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.expedia.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait (30, TimeUnit.SECONDS);
  }
 
  @Test (dependsOnMethods = {"CheckHomeCruise"})
  public void afterMethod() {
//	    driver.close();
//	    driver.quit();
  }
}
