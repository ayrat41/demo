package com.testNG.Homework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Expedia {
  WebDriver driver;
  Select select;
  WebDriverWait wait;
  
  @Test (groups = {"search","flight"})
  public void flight() {
	  driver.findElement(By.id("primary-header-flight")).click();
	  String TextSF = driver.findElement(By.xpath("//*[@id=\"flight-tabs\"]/h1")).getText();
	  String TextSFexp = "Search Flights";
	  assertEquals(TextSF, TextSFexp);
	  
	  driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]")).sendKeys("Washington");
	  driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]")).sendKeys(" Paris");
	  driver.findElement(By.xpath("//*[@id=\"flight-departing-flp\"]")).sendKeys("05/05/2019"); 
	  driver.findElement(By.xpath("//*[@id=\"flight-type-one-way-label-flp\"]")).click(); 
	  driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[7]/label/button")).click();
	  
	  String TextFlight = driver.findElement(By.xpath("//*[@id=\"titleBar\"]/h1/div/span[1]")).getText();
	  String TextSFlightexp = "Select your departure to Paris";
	  assertEquals(TextFlight, TextSFlightexp);
	  }
  @Test (groups = {"search","hotels"})
  public void hotel() throws Exception {
	  driver.findElement(By.id("tab-hotel-tab-hp")).click();
	  String TextHotel = driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[3]/div/div/div[1]/label/span[1]")).getText();
	  String TextHotelexp = "Going to";
	  assertEquals(TextHotel, TextHotelexp);
	  
	  driver.findElement(By.xpath("//*[@id=\"hotel-destination-hp-hotel\"]")).sendKeys(" Paris");
	  driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys("05/05/2019");
	  driver.findElement(By.xpath("//*[@id=\"hotel-checkout-hp-hotel\"]")).sendKeys("05/21/2019");
	  driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[10]/label/button")).click();
	
	  Thread.sleep(5000);                          
	  String TextHotelLand = driver.findElement(By.xpath("//*[@id='searchWizard']/div[2]/div[1]/div/div[2]/div[1]/button")).getText();
	  String TextHotelLandExp = "Paris (and vicinity), France";
	  assertEquals(TextHotelLand, TextHotelLandExp);
  }
  @Test (groups = {"search","flight","hotel"})
  public void flightandhotel() throws Exception {
	  driver.findElement(By.id("tab-package-tab-hp")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"package-origin-hp-package\"]")).sendKeys("Washington"); 
	  driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"package-destination-hp-package\"]")).sendKeys("Paris");
	  driver.findElement(By.xpath("//*[@id=\"aria-option-0\"]/span[2]")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("package-departing-hp-package")).sendKeys("05/05/2019");
	  driver.findElement(By.id("package-returning-hp-package")).click();
	  driver.findElement(By.xpath("//*[@id='package-returning-wrapper-hp-package']/div/div/div[3]/table/tbody/tr[4]/td[3]/button")).click();
		  
	  String MoreOpt = driver. findElement(By.xpath("//*[@id=\"package-advanced-options-fields-hp-package\"]")).getCssValue("opacity");
	  if (MoreOpt.equals("0")) {
		driver. findElement(By.xpath("//*[@id=\"package-advanced-options-hp-package\"]/span")).click();
	} 
	  select = new Select (driver.findElement(By.xpath("//*[@id=\"package-advanced-preferred-class-hp-package\"]")));
	  select.deselectByVisibleText("Economy/Coach");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"search-button-hp-package\"]")).click();
	  Thread.sleep(5000);
	  String TextFrom = driver.findElement(By.xpath("//*[@id='searchWizard']/div[2]/div[1]/div/div[2]/div[1]/button")).getText();
	  String TextFromexp = "Washington, DC, United States (WAS-All Airports)";
	  String TextTo = driver.findElement(By.xpath("//*[@id='searchWizard']/div[2]/div[1]/div/div[2]/div[2]/button")).getText();
	  String TextToexp = "Paris (and vicinity), France";
	  assertEquals(TextFrom, TextFromexp);
	  assertEquals(TextTo, TextToexp);
	  
	  }
  @Test (groups = {"search","car"})
  public void car() throws Exception {
	  driver.findElement(By.xpath("//*[@id=\"tab-car-tab-hp\"]/span[2]")).click();
	  String TextCar = driver.findElement(By.xpath("//*[@id=\"gcw-cars-form-hp-car\"]/div[3]/div[1]/div/div[1]/label/span[1]")).getText();
	  String TextCArexp = "Picking up";
	  assertEquals(TextCar, TextCArexp);
	  driver.findElement(By.xpath("//*[@id='car-pickup-hp-car']")).sendKeys("Paris");
	  driver.findElement(By.xpath("//*[@id='aria-option-0']/span[2]")).click();
	  driver.findElement(By.xpath("//*[@id='car-pickup-date-hp-car']")).sendKeys("05/05/2019");
	  driver.findElement(By.xpath("//*[@id='car-pickup-time-hp-car']")).click();
	  select = new Select (driver.findElement(By.xpath("//*[@id='car-pickup-time-hp-car']")));
      select.selectByVisibleText("12:00 pm");
	  driver.findElement(By.id("car-dropoff-date-hp-car")).click(); 
	  driver.findElement(By.xpath("//*[@id='car-dropoff-date-end-hp-car']/div/div/div[3]/table/tbody/tr[4]/td[3]/button")).click();
	  driver.findElement(By.xpath("//*[@id='car-dropoff-time-hp-car']")).click();
	  select = new Select (driver.findElement(By.xpath("//*[@id='car-dropoff-time-hp-car']")));
      select.selectByVisibleText("12:00 pm");
	  System.out.println("Click");
	  String MoreOpt = driver. findElement(By.id("cars-adv-options-hp-car")).getCssValue("opacity");
	  if (MoreOpt.equals("0")) {
		driver. findElement(By.xpath("//*[@id=\"gcw-cars-form-hp-car\"]/a")).click();
	} 
	  select = new Select(driver.findElement(By.xpath("//*[@id='car-options-type-hp-car']")));
	  select.selectByVisibleText("Sports car");
	  
	  select = new Select(driver.findElement(By.xpath("//*[@id='car-options-vendor-hp-car']")));
	  select.selectByVisibleText("Enterprise");
	  
      driver.findElement(By.xpath("//*[@id='gcw-cars-form-hp-car']/div[7]/label/button")).click();
    
	  String TextCars = driver.findElement(By.xpath("//*[@id='search-summary']/div[1]/div/div/div/div[1]/div/span[1]")).getText();
	  String TextCarsExp = "Paris (CDG-Roissy-Charles de Gaulle)";
	  assertEquals(TextCars, TextCarsExp);
       }
  
  @Test (groups = {"search","cruise"})
  public void cruise() throws Exception {
	  wait = new WebDriverWait (driver, 50);
	  driver.findElement(By.xpath("//*[@id='tab-cruise-tab-hp']/span[2]")).click();
	  Thread.sleep(3000);
	  select = new Select(driver.findElement(By.xpath("//*[@id='cruise-destination-hp-cruise']")));
	  select.selectByVisibleText("Europe");
//	  wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//*[@id='cruise-destination-hp-cruise']"),"Europe"));
	  Thread.sleep(3000);
	  select = new Select(driver.findElement(By.xpath("//*[@id='cruise-departure-month-hp-cruise']")));
	  select.selectByVisibleText("May 2019");
//	  wait.until(ExpectedConditions.textToBePresentInElement(By.id("cruise-departure-month-hp-cruise"),"May 2019"));
      
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='gcw-cruises-form-hp-cruise']/div[3]/label/button")).click(); 
	  String TextCruise = driver.findElement(By.xpath("//*[@id='destination-select']")).getText();
	  String TextCruiseExp = "Europe";
	  assertEquals(TextCruise, TextCruiseExp);
  }
  
  @Test (groups = {"search","todo"})
  public void todo() throws Exception {
	  driver.findElement(By.xpath("//*[@id='tab-activity-tab-hp']/span[1]/span")).click();
	  Thread.sleep(1000);
	  String TextTodo = driver.findElement(By.xpath("//*[@id=\"gcw-activities-form-hp-activity\"]/div[3]/div/div/div[1]/label/span[1]")).getText();
	  String TextTodoExp = "Destination";
	  assertEquals(TextTodo, TextTodoExp);
	  driver.findElement(By.xpath("//*[@id='activity-destination-hp-activity']")).sendKeys("Paris");
	  driver.findElement(By.xpath("//*[@id='aria-option-0']/span[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"activity-start-hp-activity\"]")).sendKeys("05/05/2019");
	  driver.findElement(By.xpath("//*[@id=\"activity-end-hp-activity\"]")).click();
	  driver.findElement(By.xpath("//*[@id='activity-end-wrapper-hp-activity']/div/div/div[3]/table/tbody/tr[4]/td[1]/button")).click();
	  driver.findElement(By.xpath("//*[@id='gcw-activities-form-hp-activity']/div[5]/label/button")).click();
	  
	  String TextCruise = driver.findElement(By.xpath("//*[@id='activitiesPlayback']/div[2]/div[1]/div/div[1]/span[2]")).getText();
	  String TextCruiseExp = "Paris (and vicinity), France";
	  assertEquals(TextCruise, TextCruiseExp);  
  } 
  
  @Test (groups = {"search","rentals"})
  public void rentals() throws Exception {
	  driver.findElement(By.xpath("//*[@id=\"tab-vacation-rental-tab-hp\"]/span[1]/span")).click();
	  Thread.sleep(1000);
	  String TextRentals = driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-vacationRental\"]/div[3]/div/div/div[1]/label/span[1]")).getText();
	  String TextRentalsExp = "Going to";
	  assertEquals(TextRentals, TextRentalsExp);
	  driver.findElement(By.xpath("//*[@id=\"hotel-destination-hp-vacationRental\"]")).sendKeys("Paris");
	  driver.findElement(By.xpath("//*[@id='aria-option-0']/span[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"hotel-checkin-hp-vacationRental\"]")).sendKeys("05/05/2019");
	  driver.findElement(By.xpath("//*[@id=\"hotel-checkout-hp-vacationRental\"]")).click();
	  driver.findElement(By.xpath("//*[@id='hotel-checkout-wrapper-hp-vacationRental']/div/div/div[3]/table/tbody/tr[4]/td[3]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-vacationRental\"]/div[5]/label/button")).click();
	  
	  String TextRental = driver.findElement(By.xpath("//*[@id='searchWizard']/div[2]/div[1]/div/div[2]/div[1]/button")).getText();
	  String TextRentalExp = "Paris (and vicinity), France";
	  assertEquals(TextRental, TextRentalExp);  
  } 
  
  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.expedia.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait (30, TimeUnit.SECONDS);
  }
 
  @AfterMethod
  public void afterMethod() {
	    driver.close();
	    driver.quit();
  }

}
