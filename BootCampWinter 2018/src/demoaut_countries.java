import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class demoaut_countries {

	public static void main(String[] args) throws Exception {
		
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoaut.com/");
        driver.findElement(By.linkText("REGISTER")).click();
        
        Select select = new Select (driver.findElement(By.name("country")));
        List<WebElement> countries = new ArrayList();
        countries = select.getOptions();
        Thread.sleep(3000);
        driver.close();
        driver.quit();
	}

}
