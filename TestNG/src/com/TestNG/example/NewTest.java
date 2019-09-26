package com.TestNG.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.linkText("REGISTER")).click();
      driver.findElement(By.name("firstName")).sendKeys("AIRA");
      driver.findElement(By.name("lastName")).sendKeys("AIBEDULL");
      driver.findElement(By.name("country")).sendKeys("TOGO");
      driver.findElement(By.name("register")).click();
      Thread.sleep(3000);
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
      driver.get("http://demoaut.com/");
      Thread.sleep(3000);     
  }

  @AfterMethod
  public void afterMethod() {
	driver.close();
	driver.quit();
  }

}
