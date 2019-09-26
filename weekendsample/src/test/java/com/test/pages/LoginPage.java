package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class LoginPage {
	By navId = By.id("nav-your-amazon");
	By id = By.xpath("//input[@name='email']");
	By pw = By.xpath("//input[@name='password']");
	By submitbutton = By.xpath("//input[@type='submit']");
	By ErrMsg = By.xpath("//*[@id=\"auth-warning-message-box\"]/div/div/ul/li/span");
	
	public void successignin (WebDriver driver){
		driver.findElement(navId).click();
		driver.findElement(id).sendKeys("tester@gmail.com");
		driver.findElement(pw).sendKeys("tester123");
		driver.findElement(submitbutton).click();
		boolean errMsg = driver.findElement(ErrMsg).isDisplayed();
		Assert.assertFalse(errMsg);
	}
	
}