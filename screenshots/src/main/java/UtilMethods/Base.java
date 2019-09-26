package UtilMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	 public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		  driver  = new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
	  }
	 
	  public void closeSession() {
		  driver.close();
		  driver.quit();
	  }
	  public void screenShot(WebDriver driver) {
		  File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileUtils.copyFile(file, new File("/Users/asadu/eclipse-workspace/screenshots/test-output/"+System.currentTimeMillis() + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
