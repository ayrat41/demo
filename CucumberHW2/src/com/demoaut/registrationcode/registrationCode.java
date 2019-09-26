package com.demoaut.registrationcode;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registrationCode {
        WebDriver driver;
        
        @Given("^User Launches the browser and navigates to www\\.demoaut\\.com$")
        public void user_Launches_the_browser_and_navigates_to_www_demoaut_com() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("http://demoaut.com/");
        Thread.sleep(3000);
	}

	@Given("^User click to Register button and navigates to User registration page$")
	public void user_click_to_Register_button_and_navigates_to_User_registration_page() throws Throwable {
		driver.findElement(By.linkText("REGISTER")).click();
	}

	@When("^User enter all the reristration data and verify the browser$")
	public void user_enter_all_the_reristration_data_and_verify_the_browser(DataTable regdata) throws Throwable {
	    List<Map<String, String>> regmap = regdata.asMaps(String.class, String.class);
	    for (int i = 0; i < regmap.size(); i++) {

	    driver.findElement(By.name("firstName")).sendKeys(regmap.get(i).get("firstname"));
	    driver.findElement(By.name("lastName")).sendKeys(regmap.get(i).get("lastname"));
	    driver.findElement(By.name("phone")).sendKeys(regmap.get(i).get("phone"));
	    driver.findElement(By.name("userName")).sendKeys(regmap.get(i).get("email"));
	    driver.findElement(By.name("address1")).sendKeys(regmap.get(i).get("adress"));
	    driver.findElement(By.name("city")).sendKeys(regmap.get(i).get("city"));
	    driver.findElement(By.name("state")).sendKeys(regmap.get(i).get("state"));
	    driver.findElement(By.name("postalCode")).sendKeys(regmap.get(i).get("postalcode"));
	    driver.findElement(By.name("country")).sendKeys(regmap.get(i).get("country"));
	    driver.findElement(By.name("email")).sendKeys(regmap.get(i).get("username"));
	    driver.findElement(By.name("password")).sendKeys(regmap.get(i).get("password"));
	    driver.findElement(By.name("confirmPassword")).sendKeys(regmap.get(i).get("confirmpassword"));
	    driver.findElement(By.name("register")).click();
	    Thread.sleep(5000);
	    Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).isDisplayed());
	    driver.get("http://demoaut.com/mercuryregister.php?osCsid=a54b7bdd8395f7a3b73391190660e782");
	    }
	}
	@When("^User enter all the reristration data \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"> and verify the browser$")
	public void user_enter_all_the_reristration_data_and_verify_the_browser(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12) throws Throwable{
		
	    driver.findElement(By.name("firstName")).sendKeys(arg1);
	    driver.findElement(By.name("lastName")).sendKeys(arg2);
	    driver.findElement(By.name("phone")).sendKeys(arg3);
	    driver.findElement(By.name("userName")).sendKeys(arg4);
	    driver.findElement(By.name("address1")).sendKeys(arg5);
	    driver.findElement(By.name("city")).sendKeys(arg6);
	    driver.findElement(By.name("state")).sendKeys(arg7);
	    driver.findElement(By.name("postalCode")).sendKeys(arg7);
	    driver.findElement(By.name("country")).sendKeys(arg8);
	    driver.findElement(By.name("email")).sendKeys(arg9);
	    driver.findElement(By.name("password")).sendKeys(arg10);
	    driver.findElement(By.name("confirmPassword")).sendKeys(arg11);
	    driver.findElement(By.name("register")).click();
	    Thread.sleep(5000);
	    Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).isDisplayed());
//	    driver.get("http://demoaut.com/mercuryregister.php?osCsid=a54b7bdd8395f7a3b73391190660e782");
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
	    driver.close();
	    driver.quit();
	}


}
