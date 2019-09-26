package Script;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.imageio.spi.RegisterableService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

public class StenDefinitionsGmailOne {
	WebDriver driver;
	@Given("^Open Chome browser and navigate to url : \"([^\"]*)\"$")
	public void open_Chome_browser_and_navigate_to_url(String url) throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get(url);
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	}

	@Given("^click to Register link on SignIn page$")
	public void click_to_Register_link_on_SignIn_page() throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"gb_70\"]")).click();
	}

	@When("^User enter to edit boxes : \"([^\"]*)\" and \"([^\"]*)\" and click SUBMIT button$")
	public void user_enter_to_edit_boxes_and_and_click_SUBMIT_button(String phone, String password) throws Throwable {
//		List<Map<String,String>>register = regdata.asMaps(String.class, String.class);
		driver.findElement(By.id("identifierId")).sendKeys(phone);
		driver.findElement(By.id("identifierNext")).click();
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(register.get(0).get("password"));
//		driver.findElement(By.partialLinkText("Next")).click();
	}

	@Then("^User not logged in and message should be displayed$")
	public void user_not_logged_in_and_message_should_be_displayed() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"password\"]/div[2]/div[2]/div"));
	}

	@Then("^User close the application$")
	public void user_close_the_application() throws Throwable {
		driver.close();
		driver.quit();
	   
	}

}