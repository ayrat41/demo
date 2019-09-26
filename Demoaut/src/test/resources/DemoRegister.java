package com.sample.demoaut;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DemoRegister {
	 WebDriver driver;
	  @Test
	  public void f() throws Exception {
	  driver.findElement(By.linkText("REGISTER")).click();
	  Thread.sleep(1000);
	  }
	  @BeforeMethod
	  public void beforeMethod() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demoaut.com/");
	  Thread.sleep(3000);
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
		  driver.quit();
	  }


}
