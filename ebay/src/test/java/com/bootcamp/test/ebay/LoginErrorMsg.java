package com.bootcamp.test.ebay;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class LoginErrorMsg {
	WebDriver driver;
	Actions builder;
	SoftAssert softAssert = new SoftAssert();
	public static Logger logger = LogManager.getLogger(LoginErrorMsg.class);

	@Test
	public void CheckErrMsg() {
		logger.debug("Debug");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("sgnBt")).click();
		driver.findElement(By.id("errf")).getText();
		String ExpErrMasg = "Oops, that's not a match.";
		assertTrue(driver.findElement(By.id("errf")).isDisplayed());
		assertEquals(driver.findElement(By.id("errf")).getText(), ExpErrMasg);
		assertTrue(driver.findElement(By.xpath("//*[@id=\"DS6-MAIN-CONTENT\"]/div[2]/div[1]/div[1]/span[1]/span")).isDisplayed());
		
	}

	@BeforeMethod
	public void LaunchTheBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");

	}

	@AfterMethod
	public void CloseTheBrowser() {
		driver.close();
		driver.quit();
	}

}
