package com.selenium.grid;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridtest {

	public static void main(String[] args) throws Exception {
		DesiredCapabilities dCap = new DesiredCapabilities();
		dCap.setBrowserName("chrome");
		dCap.setPlatform(Platform.WIN10);
		
		ChromeOptions cOpt = new ChromeOptions();
		cOpt.merge(dCap);
		
		String hubUrl  = ("http://192.168.0.23:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), cOpt);
		
		
		driver.get("http://demoaut.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.close();
		driver.quit();
	}

}
