package Facebook;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {


	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Screenshot scrs = new Screenshot ();
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        Screenshot scrs1 = new Screenshot ();
        driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
        Screenshot scrs2 = new Screenshot ();
        Thread.sleep(1000);
        driver.close();driver.quit();
	}
	public void Screenshot(WebDriver driver) throws Exception {
		TakesScreenshot src=((TakesScreenshot)driver);
		File file = src.getScreenshotAs(OutputType.FILE);           
		try {
		FileUtils.copyFile(file, new File("C:\\Users\\asadu\\Documents\\PNT\\screenshoot\\"+System.currentTimeMillis()+".jpeg"));
		} catch (IOException e)
		 	{System.out.println(e.getMessage()); 
		    }
		}
}
