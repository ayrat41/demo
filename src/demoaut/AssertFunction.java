package demoaut;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
       
public class AssertFunction {
        WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("http://demoaut.com/");
        
        Thread.sleep(3000);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test ended");
		 driver.close();
	     driver.quit();
	}

	@Test
	public void test() throws Exception {
        driver.findElement(By.linkText("REGISTER")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.name("firstName")).sendKeys("AIRA");
        driver.findElement(By.name("lastName")).sendKeys("AIBEDULL");
        driver.findElement(By.name("country")).sendKeys("TOGO");
        driver.findElement(By.name("register")).click();
        Thread.sleep(3000);      
//        boolean status = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).isDisplayed();
//        System.out.println(status);
//        if (status) {
//        	System.out.println("Element exist");
//        } else {
//        	System.out.println("There is no element");
//        }
//        
//        String exp_msg = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
//        String success_msg = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
//        assertEquals(exp_msg, success_msg);
        boolean result = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).isDisplayed();
        
        
	}

}
