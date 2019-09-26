package Cigna;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ciga_dental {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cignaindividual.com/public/Quoting/Individual/EnterQuoteCriteria.aspx?r+bZgxlWhFPrqjNRvlJg+EEB8PaH5wKIFKhwcG4wQkK8qhWTPQIKM/j7sXBDhYy6wz+Q8GOIxKXpBzykkiJI+AkInpB1vC0C2r417+StVePeV61U9E3JtvWeH4UsN6xohkFuvr/SuQHz+mnzOsoT3A==");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[4]/div[2]/a")).click();;
//		driver.findElement(By.xpath("//*[@id=\"1523788060311\"]/div/div[2]/div/div[1]/div[2]/div/a")).click();;
	
		driver.findElement(By.xpath("//*[@id='uxFieldZipCode']")).sendKeys("22041");
		driver.findElement(By.id("uxFieldFirstName")).click();
		Thread.sleep(5000);
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"uxFieldEffectiveDate\"]")));
		select.selectByVisibleText("1/1/2019");
		Thread.sleep(5000);
		driver.findElement(By.id("uxFieldFirstName")).sendKeys("Kamila");
		driver.findElement(By.id("uxFieldLastName")).sendKeys("Aibedullova");
		Select select2 = new Select(driver.findElement(By.xpath("//*[@id=\"uxFieldPhoneType\"]")));
		select2.selectByVisibleText("Cell");
		driver.findElement(By.xpath("//*[@id=\"uxFieldPhoneNumber\"]")).sendKeys("5716450138");
		driver.findElement(By.id("uxFieldEmail")).sendKeys("asadull78@gmail.com");
		driver.findElement(By.name("ctl00$cph$uxRadioButtonChildOnly")).click();
		driver.findElement(By.name("ctl00$cph$uxRadioButtonCurrentlyInsured")).click();
		driver.findElement(By.name("ctl00$cph$uxRadioButtonListMedicareEnrollmentQuestion")).click();
		driver.findElement(By.name("ctl00$cph$uxRepeaterApplicants$ctl01$uxFieldCensusFirstName")).sendKeys("Kamila");
		driver.findElement(By.name("ctl00$cph$uxRepeaterApplicants$ctl01$uxFieldCensusLastName")).sendKeys("Aibedullova");
		driver.findElement(By.name("ctl00$cph$uxRepeaterApplicants$ctl01$uxFieldDateOfBirth")).sendKeys("27031979");
		Select select3 = new Select(driver.findElement(By.xpath("//*[@id='cph_uxRepeaterApplicants_uxFieldGender_0']")));
		select3.selectByVisibleText("Female");		
		driver.findElement(By.name("ctl00$cph$uxRepeaterApplicants$ctl01$uxFieldTobacco")).click();
//		driver.findElement(By.name("ctl00$cph$uxRepeaterApplicants$ctl01$uxFieldPlanType$1")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='uxRadioButtonListFinancialAid_0']")).click();
		driver.findElement(By.name("ctl00$cph$uxButtonGetQuote")).click();
//		driver.close();
//		driver.quit();
		
	}

}
