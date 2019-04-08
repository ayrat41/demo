import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.io.ByteBufferPool.Bucket;

public class frameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demoaut.com/");
		driver.get("https://www.amazon.com/");
		driver.get("https://www.capitalone.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("test"))));
		
		
		driver.switchTo().frame(1);
		driver.switchTo().alert();
		driver.switchTo().window(null);
	}

}
