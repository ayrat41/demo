package com.bootcamp2018.test.google;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class googlereg {
	WebDriver driver;
  @Parameters({"phone", "password"})
  @Test
  public void login(String phone, String password) throws Exception {
	  driver.findElement(By.xpath("//a[@class='gb_Ve gb_Ba gb_Tb']")).click();
	  driver.findElement(By.id("identifierId")).sendKeys(phone);
	  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
	  System.out.println(phone + password);
	  Thread.sleep(3000);
	  Assert.assertEquals(driver.findElement(By.xpath("//*[@id='password']/div[2]")).getText(), "Wrong password. Try again or click Forgot password to reset it.");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver.quit();
  }

}
