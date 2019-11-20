package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepsDefinition {
	WebDriver driver;
	WebDriverWait wait;
	
	
	@Given("^User navigates to page \"([^\"]*)\"$")
	public void user_navigates_to_page(String url){
		System.setProperty("webdriver.chrome.driver", "/Users/aaibedul/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		wait=new WebDriverWait(driver, 10);
		driver.get(url);	
	}

	@When("^Title of page is \"([^\"]*)\"$")
	public void title_of_page_is(String expectedTitle){
		String actualTitle = driver.getTitle();
		wait.until(ExpectedConditions.titleContains("Facebook"));
		System.out.println("ActualTitle =======>"+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("^User enters username \"([^\"]*)\" and password \"([^\"]*)\" and clicks submit button$")
	public void user_enters_username_and_password(String username, String password){
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
	}

	@Then("^Page with title \"([^\"]*)\" is displayed$")
	public void page_with_title_is_displayed(String expectedTitle2){
		String actualTitle2 = driver.getTitle();
		wait.until(ExpectedConditions.titleContains("(17) Facebook"));
		System.out.println("ActualTitle =======>"+actualTitle2);
		Assert.assertEquals(expectedTitle2, actualTitle2);
		
	}


}
