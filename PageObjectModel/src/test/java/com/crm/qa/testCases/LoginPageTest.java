package com.crm.qa.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends Base {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();	
	}
	
	@BeforeMethod
	public void before() {
		initialization();
		loginPage = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void SignInPageValidation() {
		String title = loginPage.openWindow();
		assertEquals(title, "Amazon Sign In");
	}
	
	@Test(priority=2)
	public void LogoTest() {
		boolean logo = loginPage.logo();
		assertEquals(logo, true);
	}
	
	@Test(priority=3)
	public void SignIn() {
		homePage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void test() {
		driver.close();
	}
}
