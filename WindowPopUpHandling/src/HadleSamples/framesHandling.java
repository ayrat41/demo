package HadleSamples;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.javatpoint.com/exception-handling-in-java");
		List<WebElement> frameSet = driver.findElements(By.tagName("iframe"));
		System.out.println(frameSet.size());
		System.out.println(frameSet);
			
	}

}
