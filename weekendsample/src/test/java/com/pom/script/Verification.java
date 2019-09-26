package com.pom.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.pages.LoginPage;

public class Verification extends LoginPage {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
	    driver.get("http://amazon.com/");
	    driver.manage().window().maximize();
	    
	    Verification ver = new Verification();
	    ver.successignin(driver);
	}
}
