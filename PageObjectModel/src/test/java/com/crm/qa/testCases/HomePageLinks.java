package com.crm.qa.testCases;


import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.HomePage;
import com.google.common.base.Verify;

public class HomePageLinks extends Base{
	HomePage homePage;
	public HomePageLinks() {
		super();
	}
	@BeforeMethod
	public void before() {
		initialization();
		homePage = new HomePage();
		
	}
	
	@Test
	public void printLinks() throws IOException, MalformedURLException {
		homePage.CheckAllLinks();
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.)
		
	}
	
	@AfterMethod
	public void after() {
		driver.close();
		driver.quit();
	}
}
