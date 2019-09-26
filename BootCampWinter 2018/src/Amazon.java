import java.util.List;
import java.util.Set;

import javax.naming.event.NamespaceChangeListener;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Amazon {
	public static void main(String[] args) throws Exception {
		Amazon amazon = new Amazon();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions builder = new Actions(driver);
		amazon.launchTheBrowser(driver);
//		amazon.registerUser(driver, builder);
//		amazon.quit(driver);
		amazon.launchTheBrowser(driver);
		amazon.login(driver);
		amazon.logout(driver, builder);
		amazon.quit(driver);
		driver.quit();
	}
	public void launchTheBrowser(WebDriver driver) {
		driver.get("https://www.amazon.com/");
	}

	public void registerUser(WebDriver driver, Actions builder){
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]/span"))).build().perform();
		driver.findElement(By.linkText("Start here.")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("tester");
		driver.findElement(By.id("ap_email")).sendKeys("tester@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("tester123");
		driver.findElement(By.id("ap_password_check")).sendKeys("tester123");
		driver.findElement(By.id("continue")).click();
	}

	public void login(WebDriver driver) {
		driver.findElement(By.id("nav-your-amazon")).click();
		driver.findElement(By.id("ap_email")).sendKeys("asadull78@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Lubimaya77");
		driver.findElement(By.id("signInSubmit")).submit();
	}

	public void logout(WebDriver driver, Actions builder) throws Exception {
	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		builder.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign Out")).click();
		
	}

	public void quit(WebDriver driver) {
		driver.close();
	}
}
