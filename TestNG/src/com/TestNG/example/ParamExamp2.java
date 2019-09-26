package com.TestNG.example;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamExamp2 {
	
  @Parameters ({"email","password"})
  @Test 
  public void f(String email, String password) throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
	    driver.get("http://amazon.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.id("nav-your-amazon")).click();
	    Thread.sleep(3000);
	    Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/form/div/div/div/h1")).isDisplayed());
	    driver.findElement(By.id("ap_email")).sendKeys(email);
	    driver.findElement(By.id("ap_password")).sendKeys(password); 
	    driver.findElement(By.id("signInSubmit")).click();
		driver.close();
		driver.quit();
  }
}