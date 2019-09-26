package com.cucumber.test.reporting;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest {
	static WebDriver driver;

	@Given("^User open browser and navigates to www\\.demoaut\\.com homepage is displayed$")
	public void user_open_browser_and_navigates_to_www_demoaut_com_homepage_is_displayed() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoaut.com/");
//		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());

	}

	@When("^User click to SIGN_ON button SIGN_ON page is displayed$")
	public void user_click_to_SIGN_ON_button_SIGN_ON_page_is_displayed() throws Throwable {
		driver.findElement(By.linkText("SIGN-ON"));
//		Assert.assertEquals("Register: Mercury Tours", driver.getTitle());
	}

	@When("^user input username \"([^\"]*)\" and password \"([^\"]*)\" and click submit button$")
	public void user_input_username_and_password_and_click_submit_button(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.name("login")).click();

	}

	@Then("^Book your flight page is open$")
	public void book_your_flight_page_is_open() throws Throwable {
//		Assert.assertEquals("Register: Mercury Tours", driver.getTitle());
	}

	@Then("^user close and quit browser$")
	public void user_close_and_quit_browser() throws Throwable {
		driver.close();
		driver.quit();
	}

	@When("^User click to Register button register page is displayed$")
	public void user_click_to_Register_button_register_page_is_displayed() throws Throwable {
		driver.findElement(By.linkText("REGISTER"));
//		Assert.assertEquals("Register: Mercury Tours", driver.getTitle());
	}

	@When("^User enters below credentials$")
	public void user_enters_below_credentials(DataTable credentials) throws Throwable {
		Map<String, String> list = credentials.asMap(String.class, String.class);
		list.size();
		for (int i = 0; i < list.size(); i++) {
			System.out.println("");			
		}
	}

	@When("^User click submit button$")
	public void user_click_submit_button() throws Throwable {

	}

	@Then("^Welcome page is displayed$")
	public void welcome_page_is_displayed() throws Throwable {

	}

	@Then("^User close the application$")
	public void user_close_the_application() throws Throwable {
		driver.close();
		driver.quit();
	}
}
