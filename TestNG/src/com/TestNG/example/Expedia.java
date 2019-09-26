package com.TestNG.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Expedia {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.id("header-account-menu")).click();
	  driver.findElement(By.id("account-register")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("gss-signup-first-name")).sendKeys("Tester");
	  driver.findElement(By.id("gss-signup-last-name")).sendKeys("Tester");
	  driver.findElement(By.id("gss-signup-email")).sendKeys("Tester@gmail.com");
	  driver.findElement(By.id("gss-signup-submit")).click();
	  String ErrMsg1 = driver.findElement(By.id("signUpPasswordErrorMessage")).getText();
	  String ExpMsg1 = "Please enter a password";
	  if (ErrMsg1.contains(ExpMsg1)) {
		System.out.println("Test passed");
	} else {
        System.out.println("Test failed");
	} 
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
	driver = new ChromeDriver();		
    driver.get("https://www.expedia.com/");
    driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	driver.close();
	driver.quit();
  }


}
