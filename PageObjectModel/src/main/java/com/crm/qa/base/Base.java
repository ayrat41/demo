package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;

import com.crm.qa.util.TestUtil;

public class Base {
	public static WebDriver driver;
	public static Properties properties;
	
	
	public Base() {
		properties = new Properties();
		FileInputStream ipFileInputStream;
		try {
			ipFileInputStream = new FileInputStream("C:\\Users\\asadu\\eclipse-workspace\\PageObjectModel\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			properties.load(ipFileInputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		}
		
	}
	public static void initialization() {
		String browser = properties.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\geckodriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.MINUTES);
		driver.get(properties.getProperty("url"));
	}
}
