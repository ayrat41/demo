package Expedia;

import java.sql.Driver;
import java.util.List;

import org.junit.Assert;
import org.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumberExpedia {
	
	static WebDriver driver;
	
	@When("^User open chrome browser and navigate to \"([^\"]*)\"$")
	public void user_open_chrome_browser_and_navigate_to(String arg1) throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(arg1);
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	}

	@Then("^Home page is open and Title wil contain \"([^\"]*)\" text$")
	public void home_page_is_open_and_Title_wil_contain_text(String arg1) throws Throwable {
		driver.getTitle();
		Assert.assertEquals(arg1, driver.getTitle());
	   
	}

	@When("^User clicks Flight button user nanvigated to Book Flight window$")
	public void user_clicks_Flight_button_user_nanvigated_to_Book_Flight_window() throws Throwable {
		driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']")).click();

	}

	@Then("^\"([^\"]*)\" and \"([^\"]*)\" boxes are displayed$")
	public void and_boxes_are_displayed(String arg1, String arg2) throws Throwable {
		Assert.assertEquals(arg1, driver.findElement(By.xpath("//span[@class='label' and text()='Flying from']")).getText());
		Assert.assertEquals(arg2, driver.findElement(By.xpath("//span[@class='label' and text()='Flying to']")).getText());
	    
	}
	@When("^user tape \"([^\"]*)\" in Flying from recommended choise will displayed and user click First option \"([^\"]*)\"$")
	public void user_tape_in_Flying_from_recommended_choise_will_displayed_and_user_click_First_option(String arg1, String arg2) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]")).sendKeys(arg1);
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id=\"typeaheadDataPlain\"]//li"));
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().contains("Dulles")) {
				list.get(i).click();
				break;
			}
		}		
	}

	@When("^user tape \"([^\"]*)\" in Flying To recommended choise will displayed and user click First option \"([^\"]*)\" will appear in Flying to edit box$")
	public void user_tape_in_Flying_To_recommended_choise_will_displayed_and_user_click_First_option_will_appear_in_Flying_to_edit_box(String arg1, String arg2) throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"flight-destination-hp-flight\"]")).clear();
	    driver.findElement(By.xpath("//*[@id=\"flight-destination-hp-flight\"]")).sendKeys(arg1);
	    Thread.sleep(3000);
	    List <WebElement> list = driver.findElements(By.xpath("//ul[@id='typeaheadDataPlain']//li"));
	    for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getText().contains("Charles de Gaulle")) {
				list.get(i).click();
				break;
			}
		}
	    Thread.sleep(10000);
	}


	@Then("^user close and quit the browser$")
	public void user_close_and_quit_the_browser() throws Throwable {
	driver.close();
	driver.quit();
	}
	   
}
