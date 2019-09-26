package test;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendTestMessage {
	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		SendTestMessage obj = new SendTestMessage();
		obj.signIn();
		wait = new WebDriverWait(driver, 120);
		String message = "This is test message";
		System.out.println(obj.result(message));
		
	}
	
	public void signIn() {
		driver.get("https://slack.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("domain")).sendKeys("swift-yot4356.slack.com");
		driver.findElement(By.id("submit_team_domain")).click();
		driver.findElement(By.id("email")).sendKeys("airlov43@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Lubimaya77!");
		
		driver.findElement(By.id("signin_btn")).click();
	}
	
	public boolean result(String message) {
		boolean result = false;
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msg_input\"]/div[1]")));
		driver.findElement(By.xpath("//*[@id=\"msg_input\"]/div[1]")).sendKeys("ihf");
		driver.findElement(By.xpath("//*[@id=\"msg_input\"]/div[1]")).sendKeys(Keys.RETURN);
		result = true;	
		return result;
	}


}
