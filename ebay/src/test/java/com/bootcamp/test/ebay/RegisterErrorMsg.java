package com.bootcamp.test.ebay;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class RegisterErrorMsg {
	WebDriver driver;
	Actions builder;
	SoftAssert softAssert = new SoftAssert();
	@Test
	public void CheckErrMsg() {
		driver.findElement(By.linkText("register")).click();
		String []RegPageEditBoxes = {"firstname","lastname", "email", "PASSWORD","firstname"};
		String []ErrMsgTxt = {"Please enter your first name.", "Please enter your last name.", "Please enter your email address.", "Please enter a password."};
		String []ErrMsgLoc = {"firstname_w", "lastname_w", "email_w", "PASSWORD_w"}; 
		for (int i = 0; i < RegPageEditBoxes.length; i++) {
			driver.findElement(By.name(RegPageEditBoxes[i])).click();
		}
			for (int j = 0; j < ErrMsgLoc.length; j++) {
//			System.out.println("exp msg =" + ErrMsgTxt[j] + "act msg =" + driver.findElement(By.id(ErrMsgLoc[j])).getText());
			assertEquals(ErrMsgTxt[j], driver.findElement(By.id(ErrMsgLoc[j])).getText());	
			}			
	
		
	}

	@BeforeMethod
	public void LaunchTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
	
		
	}

	@AfterMethod
	public void CloseTheBrowser() {
		driver.close();
		driver.quit();
	}

}
