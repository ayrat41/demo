package gridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestGrid {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WIN10);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.merge(capabilities);
		String hubUrlString = "http://localhost:4444/wd/hub";
		WebDriver driver  = new RemoteWebDriver(new URL(hubUrlString), chromeOptions);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
