package com.testNG.Homework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class AmazonHW {
	WebDriver driver;
  @Test
  public void CheckAllLinks() throws Exception {
	  List<WebElement> TxtLink = driver.findElements(By.tagName("a"));
	   ArrayList <WebElement> activeLinks = new ArrayList<WebElement>();
	   for (int i = 0; i < TxtLink.size(); i++) {
			if(TxtLink.get(i).getAttribute("href") != null && !TxtLink.get(i).getAttribute("href").startsWith("javascript")) {
			activeLinks.add(TxtLink.get(i));		
		}
		}
		System.out.println("Active links total ===>"+ activeLinks.size());
	    for (int j = 0; j < activeLinks.size(); j++) {
			HttpURLConnection connection =(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
		    Reporter.log(activeLinks.get(j).getAttribute("href")+ "Link has text - " + activeLinks.get(j).getText() + "===>" + response);
	}
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.amazon.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver.quit();
  }

}
