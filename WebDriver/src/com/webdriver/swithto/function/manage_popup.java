package com.webdriver.swithto.function;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage_popup {

	public static void main(String[] args) throws Exception {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.nike.com/us/en_us/");
//	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.id("bx-close-inside-917561")).click();
//	    String handle = driver.getWindowHandle();
//	    for (String newWindow : driver.getWindowHandles()) {
//			driver.switchTo().window(newWindow);
//		}
//	    driver.switchTo().window(handle);
//	    driver.findElement(By.xpath("//*[@id=\"close-button\"]/a/svg")).click();
//	    Set<String> handle = driver.getWindowHandles();
//	    System.out.println(handle);
//	    driver.switchTo().window(handle);
	}

}
