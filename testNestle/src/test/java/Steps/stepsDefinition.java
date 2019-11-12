package Steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepsDefinition {
	
	WebDriver driver;
	WebDriverWait wait;
	

@Given("^User navigates \"([^\"]*)\"$")
public void user_navigates(String url){
	System.setProperty("webdriver.chrome.driver", "/Users/aaibedul/Downloads/chromedriver");
	driver=new ChromeDriver();
	wait = new WebDriverWait(driver, 10);
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
	
	
}
@When("^Title of page is \"([^\"]*)\"$")
public void title_of_page_is(String expectedTitle){
	String actualTitle = driver.getTitle();
	System.out.println("Actual title======>"+actualTitle);
	Assert.assertEquals(expectedTitle, actualTitle);
}

@Then("^User clicks button \"([^\"]*)\"$")
public void user_clicks_button(String buttonName){
	driver.findElement(By.linkText(buttonName)).click();
}
@Then("^User clicks \"([^\"]*)\" and chooses \"([^\"]*)\"$")
public void user_clicks_button_and_chooses(String link1, String link2){
	driver.findElement(By.linkText(link1)).click();
	driver.findElement(By.linkText(link2)).click();
}

@Then("^Title is \"([^\"]*)\"$")
public void title_is(String expectedTitle2){
	String actualTitle2 = driver.getTitle();
	System.out.println("Actual title======>"+actualTitle2);
	Assert.assertEquals(expectedTitle2, actualTitle2);
}

@Then("^User exit browser$")
public void user_exit_browser(){
	driver.close();
	driver.quit();
	
}


	
	

}