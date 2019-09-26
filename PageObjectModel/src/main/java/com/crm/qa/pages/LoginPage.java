package com.crm.qa.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.Base;

public class LoginPage extends Base {
	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
	WebElement xpathNavigate;
	@FindBy(name = "email")
	WebElement email;
	@FindBy(name = "password")
	WebElement passwordElement;
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement submitElement;
	@FindBy(xpath="//i[@class='a-icon a-icon-logo']")
	WebElement logoElement;
	
	public LoginPage () {
		PageFactory.initElements(driver, this);
	};
	
	public String openWindow() {
		xpathNavigate.click();
		return driver.getTitle();
	}
	public boolean logo() {
		xpathNavigate.click();
		return logoElement.isDisplayed();
	}
	
	public HomePage login(String un, String pw) {
		xpathNavigate.click();
		email.sendKeys(un);
		passwordElement.sendKeys(pw);
		submitElement.click();
		return new HomePage();
	}
}
