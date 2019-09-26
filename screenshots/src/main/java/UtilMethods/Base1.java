package UtilMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	WebDriver driver;
	public void setUpConnection() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoaut.com/");
	}
	
	public void Takeashot() throws IOException {
		
	}
	
	public void Close() {
		driver.close();
		driver.quit();
	}
}
