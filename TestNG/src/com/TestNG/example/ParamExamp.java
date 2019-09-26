package com.TestNG.example;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamExamp {
	WebDriver driver;
	Select select;
	
  @Parameters ({"city"})
  @Test 
  public void f(String city) throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.expedia.com/");
      driver.manage().window().maximize();
	  Thread.sleep(3000);          
	  driver.findElement(By.id("primary-header-flight")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("flight-origin-flp")).sendKeys(city); 
	  driver.findElement(By.xpath("//*[@id='aria-option-0']/span[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("flight-destination-flp")).sendKeys("Paris");
	  driver.findElement(By.xpath("//*[@id='aria-option-0']/span[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("flight-type-one-way-label-flp")).click();
	  driver.findElement(By.id("flight-departing-single-flp")).sendKeys("05/05/2019");
	  
	  driver.findElement(By.xpath("//*[@id='package-returning-wrapper-hp-package']/div/div/div[3]/table/tbody/tr[4]/td[3]/button")).click();
		  
	  String MoreOpt = driver. findElement(By.xpath("//*[@id=\"package-advanced-options-fields-hp-package\"]")).getCssValue("opacity");
	  if (MoreOpt.equals("0")) {
		driver. findElement(By.xpath("//*[@id=\"package-advanced-options-hp-package\"]/span")).click();
	} 
	  select = new Select (driver.findElement(By.xpath("//*[@id=\"package-advanced-preferred-class-hp-package\"]")));
	  select.deselectByVisibleText("Economy/Coach");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"search-button-hp-package\"]")).click();
	  Thread.sleep(5000);
	  String TextFrom = driver.findElement(By.xpath("//*[@id='searchWizard']/div[2]/div[1]/div/div[2]/div[1]/button")).getText();
	  String TextFromexp = "Washington, DC, United States (WAS-All Airports)";
	  String TextTo = driver.findElement(By.xpath("//*[@id='searchWizard']/div[2]/div[1]/div/div[2]/div[2]/button")).getText();
	  String TextToexp = "Paris (and vicinity), France";
	  assertEquals(TextFrom, TextFromexp);
	  assertEquals(TextTo, TextToexp);
  }
  
}
