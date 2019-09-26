package Facebook;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn_FB {
	WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test Started");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Test Ended");
	}

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("http://demoaut.com/");
        Thread.sleep(5000);
        System.out.println("Browser launched");
        
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test ended");
		driver.close();
		driver.quit();
	}

	@Test
	public void Register() throws Exception {
		System.out.println("Register Test");
		 driver.findElement(By.linkText("REGISTER")).click();
		    Thread.sleep(3000);
	        driver.findElement(By.name("firstName")).sendKeys("Airat");
	        driver.findElement(By.name("lastName")).sendKeys("Aibedullov");
	        driver.findElement(By.name("register")).click();
	        String msg0 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
	        if (msg0.contains("Thank you for registering. You may now sign-in using the user name and password you've just entered.")) {
				System.out.println("Register test - Pass");
			} else {
				System.out.println("Register test Failed.");
			}
	}
	@Test
	public void SignIn() throws Exception {
		System.out.println("SignIn test");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String msg1 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).getText();
		if (msg1.contains("Use our Flight Finder to search for the lowest fare on participating airlines. Once you've booked your flight, don't forget to visit the Mercury Tours Hotel Finder to reserve lodging in your destination city.")) {
			System.out.println("Sign in test - Pass");
		}else {
			System.out.println("SignIn test Failed.");
		}
		
	}
	@Test
	public void Hotel() throws Exception {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/a")).click();
		Thread.sleep(3000);
		String msg2 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font[1]/b/font[1]")).getText();
		if (msg2.contains("This section of our web site is currently under construction.   Sorry for any inconvienece." )) {
			System.out.println("Hotel test - Pass");
		}else {
			System.out.println("Hotel test Failed.");
		}
	}

}
