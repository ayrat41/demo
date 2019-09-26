package checkLinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.expedia.com/");
		
		List <WebElement> linksElements = driver.findElements(By.tagName("a"));
		linksElements.addAll( driver.findElements(By.tagName("img")));
		ArrayList <WebElement> actElements = new ArrayList<WebElement>();
		for (int i = 0; i < linksElements.size(); i++) {
			if (linksElements.get(i).getAttribute("href")!=null&&!linksElements.get(i).getAttribute("href").startsWith("javascript")) {
				actElements.add(linksElements.get(i));
			}
		}
		for (int i = 0; i < actElements.size(); i++) {
			System.out.print(actElements.get(i).getAttribute("href"));
			if (!actElements.get(i).getAttribute("href").contains("https://")||!actElements.get(i).getAttribute("href").contains("http://")) {
				i=i+1;
			}
			HttpsURLConnection connection = (HttpsURLConnection) new URL(actElements.get(i).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			System.out.println("===>"+response);
			connection.disconnect();
		}
		}

}
