    import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;

	import com.thoughtworks.selenium.DefaultSelenium;
	import com.thoughtworks.selenium.Selenium;



public class Purchase {

		private Selenium selenium;

	    @Before
	    public void setUp() {
	        selenium = new DefaultSelenium("localhost",4444,"*googlechrome", "http://demoaut.com/");
	        selenium.start();
	    }

	    @Test
	    public void Createaccount () throws InterruptedException {
	        selenium.open("/");
	        
	        selenium.type("name=userName", "mercury");
	        selenium.type("name=password", "mercury");
	        selenium.click("name=login");

	        Thread.sleep(100000);
	        
	 
	        selenium.select("name=passCount", "4");
	        selenium.select("name=fromPort", "Paris");
	        selenium.select("name=fromMonth", "May");
	        selenium.select("name=fromDay", "27");
	        selenium.select("name=toPort", "New York");
	        
            selenium.click("name=findFlights");
            Thread.sleep(2000);
            selenium.click("name=reserveFlights");
            
            selenium.type("name=passFirst0", "mercury");
            selenium.type("name=passLast0", "mercury");
            selenium.select("name=pass.0.meal", "Vegetarian");
            selenium.type("name=passFirst1", "mercury");
            selenium.type("name=passLast1", "mercury");
            selenium.select("name=pass.1.meal", "Vegetarian");
            selenium.type("name=passFirst2", "mercury");
            selenium.type("name=passLast2", "mercury");
            selenium.select("name=pass.2.meal", "Vegetarian");
            selenium.type("name=passFirst3", "mercury");
            selenium.type("name=passLast3", "mercury");
            selenium.select("name=pass.3.meal", "Vegetarian");
            
            selenium.select("name=creditCard", "Visa");
            selenium.type("name=creditnumber", "123456887788");
            selenium.select("name=cc_exp_dt_mn", "10");
            selenium.select("name=cc_exp_dt_yr", "2010");
            selenium.type("name=cc_frst_name", "mercury");
            selenium.type("name=cc_mid_name", "mercury");
            selenium.type("name=cc_last_name", "mercury");
           
            selenium.check("name=ticketLess");
            selenium.type("name=billAddress1", "5th avenue");
            selenium.type("name=billAddress2", "unit 77");
            selenium.type("name=billCity", "New York");
            selenium.type("name=billState", "New York");
            selenium.type("name=billZip", "22222");
            selenium.select("name=billCountry", "RUSSIA");
            selenium.check("name=ticketLess");
            
            selenium.click("name=buyFlights");
            
            
            Thread.sleep(600000);
            
	    }
	@After
	public void tearDown() {
		selenium.stop();
	}

}