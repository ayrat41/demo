import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;



public class Signin {


	private Selenium selenium;

    @Before
    public void setUp() {
        selenium = new DefaultSelenium("localhost",4444,"*googlechrome", "http://www.amazon.com/");
        selenium.start();
    }

    @Test
    public void Createaccount () throws InterruptedException {
        selenium.open("/");
  
        
        Thread.sleep(3000000);
    }
    

}