package UtilMethods;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

@Listeners(com.TestNG.Listeners.screenshots.Listeners.class)
public class NewTest extends Base {
	
  @Test
  public void f() {
	  assertEquals(false, true);
  }
  @BeforeMethod
  public void beforeMethod() {
	setUp();
  }

  @AfterMethod
  public void AfterMethod() {
		closeSession();
	  }

}
