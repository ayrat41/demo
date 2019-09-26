import static org.junit.Assert.*;

import javax.xml.xpath.XPath;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expedia {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
		Thread.sleep(2000);
	}
    
	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}
  	@Test
	public void searchTickets() throws InterruptedException {
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		driver.findElement(By.id("flight-type-roundtrip-label-hp-flight")).click();
		driver.findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]")).sendKeys("Washington, DC (WAS-All Airports)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"flight-destination-hp-flight\"]")).sendKeys("Paris, France");
		driver.findElement(By.id("flight-departing-hp-flight")).sendKeys("05/05/2019");
		driver.findElement(By.id("flight-returning-hp-flight")).click();
		driver.findElement(By.xpath("//button[@data-day = '29']")).click();
		driver.findElement(By.xpath("//button[@class='btn-primary btn-action gcw-submit']")).click();
	}
	@Test
	public void searchCars() throws InterruptedException {
		driver.findElement(By.id("tab-car-tab-hp")).click();
		driver.findElement(By.id("car-pickup-hp-car")).sendKeys("Paris, France");
		Thread.sleep(1000);
		driver.findElement(By.name("date1")).sendKeys("05/05/2019");
		driver.findElement(By.name("date2")).click();
		driver.findElement(By.xpath("//button[@data-day='29']")).click();
		driver.findElement(By.xpath("//*[@id=\"gcw-cars-form-hp-car\"]/div[7]/label/button")).click();
	}
	

}
