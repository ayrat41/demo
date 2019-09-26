package utilFIle;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilFile {
	static WebDriver driver;
	
	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static void closeBrowser() {
		driver.close();
		driver.quit();
		
	}
	
	public static void screenshot() throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\asadu\\Documents\\PNT\\screenshoot\\"+System.currentTimeMillis()+".png"));	
	}
}
