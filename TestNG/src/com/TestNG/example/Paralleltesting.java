package com.TestNG.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Paralleltesting {
	WebDriver driver = null;
    @Parameters({"browser"})
	@Test
  public void f(String browser) throws Exception {
    	switch (browser) {
		case "chrome":
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		     driver.get("http://demoaut.com/");
		     Thread.sleep(3000); 
			break;
		case "firefox":
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\asadu\\Documents\\PNT\\SoftBrowser_drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
		     driver.get("http://demoaut.com/");
		     Thread.sleep(3000); 
			break;
		case "ei":
			System.setProperty("webdriver.ie.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		    driver.get("http://demoaut.com/");
		    Thread.sleep(3000);
			break;	
		default:
			System.out.println("Unsupported browser");
			break;
		}
    	driver.close();
    	driver.quit(); 
    	
    Thread.sleep(3000);
    
    driver.findElement(By.linkText("REGISTER")).click();
    Thread.sleep(3000);
    
    driver.findElement(By.name("register")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
    Thread.sleep(3000);
    driver.findElement(By.name("passCount")).sendKeys("4");
    driver.findElement(By.name("fromPort")).sendKeys("London");
    driver.findElement(By.name("fromMonth")).sendKeys("May");
    driver.findElement(By.name("fromDay")).sendKeys("9");
    driver.findElement(By.name("toPort")).sendKeys("Paris");
    driver.findElement(By.name("toMonth")).sendKeys("May");
    driver.findElement(By.name("toDay")).sendKeys("9");
    driver.findElement(By.name("airline")).sendKeys("Blue Skies Airlines");
    driver.findElement(By.name("findFlights")).click();
    Thread.sleep(3000);
    driver.findElement(By.name("reserveFlights")).click();
    
    driver.findElement(By.name("passFirst0")).sendKeys("AAA");
    driver.findElement(By.name("passLast0")).sendKeys("BBB");
    driver.findElement(By.name("pass.0.meal")).sendKeys("Vegetarian");
    
    driver.findElement(By.name("passFirst1")).sendKeys("AAA");
    driver.findElement(By.name("passLast1")).sendKeys("BBB");
    driver.findElement(By.name("pass.1.meal")).sendKeys("Vegetarian");
    
    driver.findElement(By.name("passFirst2")).sendKeys("AAA");
    driver.findElement(By.name("passLast2")).sendKeys("BBB");
    driver.findElement(By.name("pass.2.meal")).sendKeys("Vegetarian");
    
    driver.findElement(By.name("passFirst3")).sendKeys("AAA");
    driver.findElement(By.name("passLast3")).sendKeys("BBB");
    driver.findElement(By.name("pass.3.meal")).sendKeys("Vegetarian");
    
    driver.findElement(By.name("ticketLess")).click();
    boolean ctc = driver.findElement(By.name("ticketLess")).isSelected();
    if(!ctc) {
    	 driver.findElement(By.name("ticketLess")).click(); 
    }
    
    driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td[2]/input")).click();
    boolean ctc1 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td[2]/input")).isSelected();
    if(!ctc1) {
    	 driver.findElement(By.name("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td[2]/input")).click(); 
    }
    
    driver.findElement(By.name("buyFlights")).click();
    Thread.sleep(3000);
    
    String Purchase_Success = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
    String exp_purch_sicc_message = "Your itinerary has been booked!";
    if (Purchase_Success.equals(exp_purch_sicc_message)) {
			System.out.println("Purchase succesfull");
		} else {
			System.out.println("Purchase not succesfull");
		}
    Thread.sleep(3000);
}
}
