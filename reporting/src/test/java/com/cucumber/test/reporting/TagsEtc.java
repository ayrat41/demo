// this comment specially for git


package com.cucumber.test.reporting;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TagsEtc {
	
	@Before()
	public void globalBefore() {
		System.out.println("This is global before method");
	}
	
	@After()
	public void globalAfter() {
		System.out.println("This is global after method");
	}
	
	@Before("@Run4all")
	public void globalBefore1() {
		System.out.println("This is tagged before method");
	}
	
	@After("@Run4all")
	public void globalAfter1() {
		System.out.println("This is tagged after method");
	}
	
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
		System.out.println("This is Scenario 1 method 1");
	}

	@When("^navigate to www\\.demoaut,com$")
	public void navigate_to_www_demoaut_com() throws Throwable {
		System.out.println("This is Scenario 1 method 2");
	}

	@Then("^home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
		System.out.println("This is Scenario 1 method 3");
	}

	@Given("^open the browser navigate to www\\.demoaut,com home page is displayed$")
	public void open_the_browser_navigate_to_www_demoaut_com_home_page_is_displayed() throws Throwable {
		System.out.println("This is Scenario 2 method 1");
	}

	@When("^Click on SIGN_ON button$")
	public void click_on_SIGN_ON_button() throws Throwable {
		System.out.println("This is Scenario 2 method 2");
	}

	@Then("^SIGN_ON is displayed$")
	public void sign_on_is_displayed() throws Throwable {
		System.out.println("This is Scenario 2 method 3");
	}

	@When("^Click on REGISTER button$")
	public void click_on_REGISTER_button() throws Throwable {
		System.out.println("This is Scenario 3 method 2");
	}
	
	@Then("^REGISTER is displayed$")
	public void register_is_displayed() throws Throwable {
		System.out.println("This is Scenario 3 method 3");
	}

	@When("^Click on SUPPORT button$")
	public void click_on_SUPPORT_button() throws Throwable {
		System.out.println("This is Scenario 4 method 2");
	}
	
	@Then("^SUPPORT is displayed$")
	public void support_is_displayed() throws Throwable {
		System.out.println("This is Scenario 4 method 3");   
	}
	
	@When("^Click on CONTACT button$")
	public void click_on_CONTACT_button() throws Throwable {
		System.out.println("This Scenario 5 method 2");
	}
	
	@Then("^CONTACT is displayed$")
	public void contact_is_displayed() throws Throwable {
		System.out.println("This Scenario 5 method 3");	   
	}

	@When("^User enter UN \"([^\"]*)\", PW\"([^\"]*)\"Click and click on SIGN_IN button$")
	public void user_enter_UN_PW_Click_and_click_on_SIGN_IN_button(String arg1, String arg2) throws Throwable {
		System.out.println("This Scenario 6 method 2");
	}
	@Then("^Registred page is displayed$")
	public void registred_page_is_displayed() throws Throwable {
		System.out.println("This Scenario 6 method 3");
	}

	@When("^Click on your destination button$")
	public void click_on_your_destination_button() throws Throwable {
		System.out.println("This Scenario 7 method 2");
	}

	@Then("^YourDestination is displayed$")
	public void yourdestination_is_displayed() throws Throwable {
		System.out.println("This Scenario 7 method 3");
	}

	@When("^Click on featured vacation destinations button$")
	public void click_on_featured_vacation_destinations_button() throws Throwable {
		System.out.println("This Scenario 8 method 2");
	}

	@Then("^Featured vacation destinations is displayed$")
	public void featured_vacation_destinations_is_displayed() throws Throwable {
		System.out.println("This Scenario 8 method 3");
	}
}
