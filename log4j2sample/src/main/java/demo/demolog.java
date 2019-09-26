package demo;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demolog {
	
	public static void main(String[] args) {
		Logger log = LogManager.getLogger(demolog.class.getName());
		log.info("****************************** Starting test cases execution  *****************************************");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.info("launching chrome broswer");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
		log.info("entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");

		log.info("****************************** starting test case *****************************************");
		log.info("****************************** freeCrmTitleTest *****************************************");
		String title = driver.getTitle();
		System.out.println(title);
		log.info("login page title is--->"+title);
		
		log.info("****************************** ending test case *****************************************");
		log.info("****************************** freeCrmTitleTest *****************************************");
		log.info("****************************** starting test case *****************************************");
		log.info("****************************** freemCRMLogoTest *****************************************");

		boolean b = driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
		
		
		log.info("****************************** ending test case *****************************************");
		log.info("****************************** freemCRMLogoTest *****************************************");
	}

}
