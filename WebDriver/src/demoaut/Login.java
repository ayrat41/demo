package demoaut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Login {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoaut.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='image']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Flights")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value = 'oneway']")).click();
        Select select = new Select(driver.findElement(By.xpath("//select[@name = 'passCount']")));
        select.selectByValue("4");
        driver.findElement(By.xpath("//select[@name = 'fromPort']")).sendKeys("London");
        driver.findElement(By.xpath("//select[@name = 'fromMonth']")).sendKeys("May");
        driver.findElement(By.xpath("//select[@name = 'fromDay']")).sendKeys("9");
        driver.findElement(By.xpath("//select[@name = 'toPort']")).sendKeys("Paris");
        driver.findElement(By.xpath("//select[@name = 'toMonth']")).sendKeys("May");
        driver.findElement(By.xpath("//select[@name = 'toDay']")).sendKeys("9");
        driver.findElement(By.xpath("//select[@name = 'airline']")).sendKeys("Blue Skies Airlines");
        driver.findElement(By.xpath("//input[contains(@name, 'findFlights')]")).click();
//        driver.findElement(By.xpath("//input[contains(@value, 'Pangea Airlines$362$274$9:17')]")).click();
//        driver.findElement(By.xpath("//input[contains(@value, 'Pangea Airlines$632$282$16:37'])")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("reserveFlights")).click();
//        
//        driver.findElement(By.xpath("passFirst0")).sendKeys("AAA");
//        driver.findElement(By.xpath("passLast0")).sendKeys("BBB");
//        driver.findElement(By.xpath("pass.0.meal")).sendKeys("Vegetarian");
//        
//        driver.findElement(By.xpath("passFirst1")).sendKeys("AAA");
//        driver.findElement(By.xpath("passLast1")).sendKeys("BBB");
//        driver.findElement(By.xpath("pass.1.meal")).sendKeys("Vegetarian");
//        
//        driver.findElement(By.xpath("passFirst2")).sendKeys("AAA");
//        driver.findElement(By.xpath("passLast2")).sendKeys("BBB");
//        driver.findElement(By.xpath("pass.2.meal")).sendKeys("Vegetarian");
//        
//        driver.findElement(By.xpath("passFirst3")).sendKeys("AAA");
//        driver.findElement(By.xpath("passLast3")).sendKeys("BBB");
//        driver.findElement(By.xpath("pass.3.meal")).sendKeys("Vegetarian");
//        
//        driver.findElement(By.xpath("ticketLess")).click();
//        boolean ctc = driver.findElement(By.xpath("ticketLess")).isSelected();
//        if(!ctc) {
//        	 driver.findElement(By.xpath("ticketLess")).click(); 
//        }
//        
//        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td[2]/input")).click();
//        boolean ctc1 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td[2]/input")).isSelected();
//        if(!ctc1) {
//        	 driver.findElement(By.name("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td[2]/input")).click(); 
//        }
//        
//        driver.findElement(By.xpath("buyFlights")).click();
//        Thread.sleep(3000);
//        
//        String Purchase_Success = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
//        String exp_purch_sicc_message = "Your itinerary has been booked!";
//        if (Purchase_Success.equals(exp_purch_sicc_message)) {
//			System.out.println("Purchase succesfull");
//		} else {
//			System.out.println("Purchase not succesfull");
//		}
//        Thread.sleep(3000);
        driver.close();
        driver.quit();
	}

}
