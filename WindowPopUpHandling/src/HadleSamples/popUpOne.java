package HadleSamples;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class popUpOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();
		Set<String> windowSet = driver.getWindowHandles();
		Iterator<String> iterator = windowSet.iterator();
			String parent = iterator.next();
			String child = iterator.next();
			System.out.println(parent);
			
			driver.switchTo().window(parent);
			driver.switchTo().parentFrame();
			
			Thread.sleep(5000);
			driver.switchTo().window(child);
			Thread.sleep(5000);
//			driver.close();
			
			
	}

}
