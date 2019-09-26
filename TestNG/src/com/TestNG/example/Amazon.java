package com.TestNG.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Amazon {
	WebDriver driver;
	String [] XpathEdit = {"//*[@id=\"ap_customer_name\"]", "//*[@id=\"ap_email\"]","//*[@id=\"ap_password\"]", "//*[@id=\"ap_password_check\"]"};
    String [] XpathMsg = {"//*[@id=\"auth-customerName-missing-alert\"]/div/div", "//*[@id=\"auth-email-missing-alert\"]/div/div", "//*[@id=\"auth-password-missing-alert\"]/div/div", "//*[@id=\"auth-passwordCheck-missing-alert\"]/div/div" };
    String [] ErrMsg = {"Enter your name", "Enter your email", "Enter your password", "Type your password again"};
    String [] CaseName = {"name", "email", "password", "passwordCheck"};
    String [] Case1 = {"", "", "", ""};
    String [] Case2 = {"Tester", "", "", ""};
    String [] Case3 = {"Tester", "Tester@gamil.com" , "", ""};
    String [] Case4 = {"Tester", "Tester@gamil.com","Tester 123", ""};
    String [] Case5 = {"Tester", "Tester@gamil.com","Tester 123", "Tester 123"};
    
  @Test //All edit boxes empty
  public void register1() throws Exception {
	  driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
      driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
      Thread.sleep(1000);
      
      for (int x = 0; x < Case1.length; x++) {
      	driver.findElement(By.xpath(XpathEdit[x])).sendKeys(Case1[x]);
      	driver.findElement(By.id("continue")).click();
      }
      
      for (int x = 0; x < Case1.length; x++) {
          String DisplaiedMsg = driver.findElement(By.xpath(XpathMsg[x])).getText();
          if (DisplaiedMsg.contains(ErrMsg[x])) {       	
  			System.out.println(ErrMsg[x]+"===Passed");
  		} else {
  			System.out.println( ErrMsg[x] + "===Case1 failed");
  		}
      }
	  
  }
   @Test
   public void register2() throws Exception {
		  driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
	      driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
	      Thread.sleep(1000);
   }
  @BeforeMethod
  public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
	driver = new ChromeDriver();		
    driver.get("http://amazon.com/");
    driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	driver.close();
	driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Launching browser");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Closing browser");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Starting execution");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Test ended");
  }

}
