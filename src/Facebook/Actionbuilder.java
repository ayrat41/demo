package Facebook;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.*;

public class Actionbuilder {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions builder = new Actions (driver);
        driver.get("http://amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"))).build().perform();
        builder.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")), driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
        Thread.sleep(3000);
        builder.contextClick(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
//        driver.close();
//        driver.quit();
	}
}
