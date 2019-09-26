package com.testNG.Homework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Demoaut_register {
	WebDriver driver;
  @Test // register account
  public void register() {
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	  driver.findElement(By.name("firstName")).sendKeys("Tester");
	  driver.findElement(By.name("lastName")).sendKeys("Tester");
	  driver.findElement(By.name("register")).click();
	  // Message variables
	  String ExpMsg = "using the user name and password you've just entered.";
	  String CurrMsg = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[2]")).getText();
	  assertEquals(CurrMsg, ExpMsg);
  }
 
  @BeforeMethod //launch Chrome 
  public void beforeMethod() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demoaut.com/");
		Thread.sleep(3000);
  }

  @AfterMethod // Close and quit
  public void afterMethod() {
//	  driver.close();
//	  driver.quit();
  }

}
