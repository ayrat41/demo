package com.amazon.salesapplication;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class regression {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
      driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
      Thread.sleep(1000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();		
	    driver.get("http://amazon.com/");
	    driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	    driver.close();
	    driver.quit();
  }

}
