import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws Exception {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("http://demoaut.com/");

		    List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("Totan number of links is===> " + links.size());
		
			links.addAll(driver.findElements(By.tagName("img")));
			System.out.println("Totan number of links is===> " + links.size());
            ArrayList <WebElement> activeLinks = new ArrayList<WebElement>();
			for (int i = 0; i < links.size(); i++) {
				if(links.get(i).getAttribute("href") != null) {
				;
				activeLinks.add(links.get(i));
					
			}
				
		}
		System.out.println("Total active links are===> " + activeLinks.size());
		for (int j = 0; j < activeLinks.size(); j++) {
			HttpURLConnection connection =(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
		    System.out.println(activeLinks.get(j).getAttribute("href")+ "===>" + response);
	}
	}
}
