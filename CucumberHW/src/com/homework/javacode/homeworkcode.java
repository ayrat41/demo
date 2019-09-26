package com.homework.javacode;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

        
public class homeworkcode {
	WebDriver driver;
	
	// Scenario 1 
	@Given("^Open Chome browser and navigate to http://demoaut\\.com/$")
	public void open_Chome_browser_and_navigate_to_http_demoaut_com() throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("http://demoaut.com/");
        Thread.sleep(3000);
	}

	@Given("^click to Register link on fome page$")
	public void click_to_Register_link_on_fome_page() throws Throwable {
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@When("^User enter to edit boxes : firstname \"([^\"]*)\" and lastname \"([^\"]*)\" phone \"([^\"]*)\" email \"([^\"]*)\" click SUBMIT button$")
	public void user_enter_to_edit_boxes_firstname_and_lastname_phone_email_click_SUBMIT_button(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
	    driver.findElement(By.name("lastName")).sendKeys(arg2);
	    driver.findElement(By.name("phone")).sendKeys(arg3);
	    driver.findElement(By.id("userName")).sendKeys(arg4);
	    driver.findElement(By.name("register")).click();
	    Thread.sleep(5000);  }


	@Then("^User succesfully registred and \"([^\"]*)\" message should be displayed$")
	public void user_succesfully_registred_and_message_should_be_displayed(String arg5) throws Throwable {
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText());
	    Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).isDisplayed());
	}

	@Then("^User close the application$")
	public void user_close_the_application() throws Throwable {
	   driver.close();
	   driver.quit();
	}

	
	// Scenario 2
	
	@When("^User login entering: userename \"([^\"]*)\" and password  \"([^\"]*)\" click SUBMIT button$")
	public void user_login_entering_userename_and_password_click_SUBMIT_button(String arg1, String arg2) throws Throwable {
		 driver.findElement(By.name("userName")).sendKeys(arg1);
		 driver.findElement(By.name("password")).sendKeys(arg2);
	     driver.findElement(By.name("login")).click();
	}
		
	@Then("^User succesfully loggedin  and Success login message should be displayed$")
	public void user_succesfully_loggedin_and_Success_login_message_should_be_displayed() throws Throwable {
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).getText());
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).isDisplayed());
	}


	@When("^User enter data to edit boxes Departing From \"([^\"]*)\" On month \"([^\"]*)\" Date \"([^\"]*)\" Arriving In \"([^\"]*)\" Returning On month \"([^\"]*)\" Date \"([^\"]*)\"$")
	public void user_enter_data_to_edit_boxes_Departing_From_On_month_Date_Arriving_In_Returning_On_month_Date(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		driver.findElement(By.name("passCount")).sendKeys("1");
        driver.findElement(By.name("fromPort")).sendKeys(arg1);
        driver.findElement(By.name("fromMonth")).sendKeys(arg2);
        driver.findElement(By.name("fromDay")).sendKeys(arg3);
        driver.findElement(By.name("toPort")).sendKeys(arg4);
        driver.findElement(By.name("toMonth")).sendKeys(arg5);
        driver.findElement(By.name("toDay")).sendKeys(arg6);
	}

	@When("^User chose Service class Economy and Airline preference - No preference and Click Continue button$")
	public void user_chose_Service_class_Economy_and_Airline_preference_No_preference_and_Click_Continue_button() throws Throwable {
		driver.findElement(By.name("airline")).sendKeys("No Preference");
        driver.findElement(By.name("findFlights")).click();
        Thread.sleep(3000);
	}
	@Then("^User navigated to Select Flight page and Text messase is displayed$")
	public void user_navigated_to_Select_Flight_page_and_Text_messase_is_displayed() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).isDisplayed());
	}

	@When("^User Click to Blue Skies Airlines radio button at depart and User Click to Pangea Airlines radio button at Return and User Click Continue button$")
	public void user_Click_to_Blue_Skies_Airlines_radio_button_at_depart_and_User_Click_to_Pangea_Airlines_radio_button_at_Return_and_User_Click_Continue_button() throws Throwable  {
		Thread.sleep(5000);
		WebElement DepartRB = driver.findElement(By.cssSelector("input[value ='Pangea Airlines$362$274$9:17']"));
		DepartRB.click();
		WebElement ReturnRB = driver.findElement(By.cssSelector("input[value ='Unified Airlines$633$303$18:44']"));
		ReturnRB.click();
	    driver.findElement(By.name("reserveFlights")).click();
	}

	@Then("^User navigated to Book a Flight page and Success message should be displayed$")
	public void user_navigated_to_Book_a_Flight_page_and_Success_message_should_be_displayed() throws Throwable {
		System.out.println(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).getText());
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).isDisplayed());
	}

	@When("^User  enter First Name \"([^\"]*)\" and Last name \"([^\"]*)\" and Select \"([^\"]*)\" in meal preferences select box$")
	public void user_enter_First_Name_and_Last_name_and_Select_in_meal_preferences_select_box(String arg1, String arg2, String arg3) throws Throwable {
		driver.findElement(By.name("passFirst0")).sendKeys(arg1);
        driver.findElement(By.name("passLast0")).sendKeys(arg2);
        driver.findElement(By.name("pass.0.meal")).sendKeys(arg3);
	}

	@When("^User Select Visa credit card in Card Type select box and enter \"([^\"]*)\" in Number edit box and Select \"([^\"]*)\" and \"([^\"]*)\" from Expiration select boxes in Credit card$")
	public void user_Select_Visa_credit_card_in_Card_Type_select_box_and_enter_in_Number_edit_box_and_Select_and_from_Expiration_select_boxes_in_Credit_card(String arg1, String arg2, String arg3) throws Throwable{
	   driver.findElement(By.name("creditCard")).sendKeys("Visa");
	   driver.findElement(By.name("creditnumber")).sendKeys(arg1);
	   driver.findElement(By.name("cc_exp_dt_mn")).sendKeys(arg2);
	   driver.findElement(By.name("cc_exp_dt_yr")).sendKeys(arg1);
	}

	@When("^User enter Firstname \"([^\"]*)\" Middle empty Last name \"([^\"]*)\" in Credit card edit boxes$")
	public void user_enter_Firstname_Middle_empty_Last_name_in_Credit_card_edit_boxes(String arg1, String arg2) throws Throwable {
	   driver.findElement(By.name("cc_frst_name")).sendKeys(arg1);
	   driver.findElement(By.name("cc_last_name")).sendKeys(arg2);
	}

	@When("^User enter \"([^\"]*)\" to Adress editbox and \"([^\"]*)\" to City edit box and \"([^\"]*)\" to Province/State edit box and \"([^\"]*)\" to Postal code edit box and select \"([^\"]*)\" from Country select box and click Secure Purchase button$")
	public void user_enter_to_Adress_editbox_and_to_City_edit_box_and_to_Province_State_edit_box_and_to_Postal_code_edit_box_and_select_from_Country_select_box_and_click_Secure_Purchase_button(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		driver.findElement(By.name("billAddress1")).sendKeys(arg1);
		driver.findElement(By.name("billCity")).sendKeys(arg2);
		driver.findElement(By.name("billState")).sendKeys(arg3);
		driver.findElement(By.name("billZip")).sendKeys(arg4);
		driver.findElement(By.name("billCountry")).sendKeys(arg5);
	}

	@Then("^User navigated to purchase conformation \"([^\"]*)\" message should be displayed$")
	public void user_navigated_to_purchase_conformation_message_should_be_displayed(String arg1) throws Throwable {
	   
	    
	}
}
