package WorkWithExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Excel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoaut.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1000);
		driver.close();
		driver.quit();

	}

}
