import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demoaut.com/");
		driver.get("https://www.amazon.com/");
		driver.get("https://www.capitalone.com/");
		
		driver.switchTo().frame(1);
		driver.switchTo().alert();
	}

}
