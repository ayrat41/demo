package overriding;

import selenium.ChromeDriver;
import selenium.WebDriver;

public class BMW extends Car{
	
	public void start() {
		System.out.println("BMW ----- start");
		
	}
	
	public void theftSafety () {
		System.out.println("BMW ----- theftSafety");
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\aaibedul\\Downloads\\googlechrome");
		WebDriver driver = new ChromeDriver();
	}

}
