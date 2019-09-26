package com.test.stepdefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	   WebDriver driver;
	   
	@Given("^User open the browser and navigate to amazon\\.com$")
	public void user_open_the_browser_and_navigate_to_amazon_com() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
		driver = new ChromeDriver();		
	    driver.get("http://amazon.com/");
	    Thread.sleep(3000);
	}

	@And("^User click on Your Amazon\\.com link$")
	public void user_click_on_Your_Amazon_com_link() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
        Thread.sleep(1000);
	}

	@Then("^login page is displayed$")
	public void login_page_is_displayed() throws Throwable {
		Thread.sleep(3000);
	    org.junit.Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/form/div/div/div/h1")).isDisplayed());
	}

	@Then("^username, pw links and submit button$")
	public void username_pw_links_and_submit_button() throws Throwable {
		Assert.assertTrue(driver.findElement(By.id("ap_email")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.id("ap_password")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.id("signInSubmit")).isDisplayed());
	}
	@Then("^close the application$")
	public void close_the_application() throws Throwable {
		driver.close();
		driver.quit();
	}
	
	@When("^User entars valid username \"([^\"]*)\" and pw \"([^\"]*)\" and click sign in$")
	public void Login(String email, String password) throws Throwable {
	    driver.findElement(By.id("ap_email")).sendKeys(email);
	    driver.findElement(By.id("ap_password")).sendKeys(password); 
	    driver.findElement(By.id("signInSubmit")).click();
	}

	@And("^verify user is logged in succesfully$")
	public void verify_user_is_logged_in_succesfully() throws Throwable {
		boolean msg2 = false;
		if (!(driver.findElement(By.id("continue")).isDisplayed())) {
			msg2 = false;
			
		}	
		Assert.assertFalse(msg2);
	}
	
	@Given("^User click on Register New User link$")
	public void user_click_on_Register_New_User_link() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
        Thread.sleep(1000);
	}

	@When("^User enters below credentials verify error messages$")
	public void user_enters_below_credentials_verify_error_messages(DataTable datavalues) throws Throwable{
	 List<Map<String, String>>datavaluesMap = datavalues.asMaps(String.class, String.class);
     String [] XpathMsg = {"//*[@id=\"auth-customerName-missing-alert\"]/div/div", "//*[@id=\"auth-email-missing-alert\"]/div/div", "//*[@id=\"auth-password-missing-alert\"]/div/div", "//*[@id=\"auth-passwordCheck-missing-alert\"]/div/div" };
     String [] ErrMsg = {"Enter your name", "Enter your email", "Enter your password", "Type your password again"};
	 System.out.println(datavaluesMap);
	 for (int x = 0; x < datavaluesMap.size(); x++) {
		driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).clear(); 
     	driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys(datavaluesMap.get(x).get("your name"));
     	driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).clear();
     	driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(datavaluesMap.get(x).get("email"));
     	driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).clear();
     	driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(datavaluesMap.get(x).get("password"));
     	driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).clear();
     	driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys(datavaluesMap.get(x).get("re-password"));
     	driver.findElement(By.id("continue")).click();
     	if (x==0) {
		 for (int y = 0; y < ErrMsg.length; y++) {
            String DisplaiedMsg = driver.findElement(By.xpath(XpathMsg[y])).getText();
            if (DisplaiedMsg.contains(ErrMsg[y])) {       	
    			System.out.println(ErrMsg[y]+"Pass");
    		} else {
    			System.out.println( ErrMsg[y] + "Case1 failed");
    		}
		 }
     	} else if (x==1) {
 		 for (int y = 0; y < ErrMsg.length; y++) {
			 String DisplaiedMsg = driver.findElement(By.xpath(XpathMsg[y])).getText();	
            if (DisplaiedMsg.contains(ErrMsg[y])) {
    			System.out.println(ErrMsg[y]+"Pass");
    		}	else if (DisplaiedMsg.isEmpty()) {
    			System.out.println(ErrMsg[y] + " is gone - Pass");
    		} else {
    			System.out.println( ErrMsg[y] + " Case 2 failed");
    		}            
         }
     	} else if(x==2) {
         for (int y = 0; y < ErrMsg.length; y++) {
    	    String DisplaiedMsg = driver.findElement(By.xpath(XpathMsg[y])).getText(); 
            if (DisplaiedMsg.contains(ErrMsg[y])) {
   		    System.out.println(ErrMsg[y]+" Case 3 Pass");
            }	else if (DisplaiedMsg.isEmpty()) {
    	    System.out.println(ErrMsg[y] + " is gone - Case 3 Pass");
            } else {
 		    System.out.println(ErrMsg[y] + " Case 3 failed");
     	    }            
         }
 	    } else if(x==3) {
 		 for (int y = 0; y < ErrMsg.length; y++) {            
             String DisplaiedMsg = driver.findElement(By.xpath(XpathMsg[y])).getText();
             
             if (DisplaiedMsg.contains(ErrMsg[y])) {
     			System.out.println(ErrMsg[y]+" Pass");
     		}	else if (DisplaiedMsg.isEmpty()) {
     			System.out.println(ErrMsg[y] + " is gone - Case 4 Pass");
     		} else {
     			System.out.println(ErrMsg[y] + " Case 4 failed");
     		}           
         }
     	} else if(x==4 && driver.findElement(By.xpath("//*[@id='cvf-page-content']/div/div/div[1]/form/div[1]/div[1]/h1")).isDisplayed()) {
     		String DisplaiedMsg = driver.findElement(By.xpath("//*[@id='cvf-page-content']/div/div/div[1]/form/div[1]/div[1]/h1")).getText();
            String Title = driver.getTitle();
            System.out.println(Title);
            if (DisplaiedMsg.contains("Verify email adress") || Title.contains("Please confirm your identity")) {
    			System.out.println("Case 5 Pass");
    		} else {
    			System.out.println("Case 5 failed");
    		}   
     	  }
     	}
     }
}