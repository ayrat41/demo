package stepDefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilFiles.base;

@Listeners(ListenerTest.testListener.class)
public class NewTest extends base{


  	@Test
  	@Given("^user open the browser and navigate to \"([^\"]*)\"$")
  	public void user_open_the_browser_and_navigate_to(String arg1) throws Throwable {
  		base.launchBrowser(arg1);
  		
  	}
  	@Test
  	@Then("^home page is open$")
  	public void home_page_is_open() throws Throwable {
  		String hpTitleString = driver.getTitle();
  		System.out.println(hpTitleString);
  		assertTrue(hpTitleString.contains("Amazon"));
  		Assert.assertTrue(false);
  	}
  	@Test
  	@When("^user click signin button$")
  	public void user_click_signin_button() throws Throwable {
  		driver.findElement(By.id("nav-link-accountList")).click();
  		Assert.assertTrue(false);
  	}
  	@Test
  	@Then("^sign in page is open$")
  	public void sign_in_page_is_open() throws Throwable {
  		String signInTItle = driver.getTitle();
  		System.out.println(signInTItle);
  		Assert.assertTrue(signInTItle.contains("Amazon Sign In"));
  	}
  	@Test
  	@Given("^user click signin button and sign in page is open$")
  	public void user_click_signin_button_and_sign_in_page_is_open() throws Throwable {
  		driver.findElement(By.id("nav-link-accountList")).click();
  	}
  	@Test
  	@When("^user input no data no User name and Password and hit submit button$")
  	public void user_input_no_data_no_User_name_and_Password_and_hit_submit_button() throws Throwable {
  		driver.findElement(By.id("signInSubmit")).click();
  		
  	}
  	@Test
  	@Then("^Error messages should be dissplayed$")
  	public void error_messages_should_be_dissplayed() throws Throwable {
  		String errMsgEMailAct = driver.findElement(By.id("auth-email-missing-alert")).getText();
  		String errMagEmailExpString = "Enter your email or mobile phone number";
  		Assert.assertTrue(errMsgEMailAct.contains(errMagEmailExpString));	
  		String errMsgPwdAct = driver.findElement(By.id("auth-password-missing-alert")).getText();
  		String errMagPwdExpString = "Enter your password";
  		Assert.assertTrue(errMsgPwdAct.contains(errMagPwdExpString));	
  	}
  	@Test
  	@When("^user input \"([^\"]*)\" in User name edit box and no data no to Password and hit submit button$")
  	public void user_input_in_User_name_edit_box_and_no_data_no_to_Password_and_hit_submit_button(String arg1) throws Throwable {
  		driver.findElement(By.id("ap_email")).sendKeys(arg1);
  		driver.findElement(By.id("signInSubmit")).click();
  		String errMsgPwdAct = driver.findElement(By.id("auth-password-missing-alert")).getText();
  		String errMagPwdExpString = "Enter your password";
  		Assert.assertTrue(errMsgPwdAct.contains(errMagPwdExpString));	
  	}
  	@Test
  	@Then("^Error message should be dissplayed$")
  	public void error_message_should_be_dissplayed() throws Throwable {
  		String errMsgPwdAct = driver.findElement(By.id("auth-password-missing-alert")).getText();
  		String errMagPwdExpString = "Enter your password";
  		Assert.assertTrue(errMsgPwdAct.contains(errMagPwdExpString));
  	}
  	@Test
  	@When("^user input \"([^\"]*)\" in User name edit box and \"([^\"]*)\" in Password edit box and hit submit button$")
  	public void user_input_in_User_name_edit_box_and_in_Password_edit_box_and_hit_submit_button(String arg1, String arg2) throws Throwable {
  		driver.findElement(By.id("ap_email")).sendKeys(arg1);
  		driver.findElement(By.id("ap_password")).sendKeys(arg2);
  		driver.findElement(By.id("signInSubmit")).click();
  	}
  	@Test
  	@Then("^User navigate to Account page$")
  	public void user_navigate_to_Account_page() throws Throwable {
  		String titleAcc = driver.getTitle();
  		String expectedTitle = "Amazon";
  		Assert.assertTrue(titleAcc.contains(expectedTitle));
  	}
  	@Then("^close and quit the browser$")
  	public void close_and_quit_the_browser() throws Throwable {
  		base.closeBrowser();
  	}
  	
  	@AfterSuite
  	public void close() {
  		driver.close();
  		driver.quit();
  	}
  
}
