import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wb1Test {

	public static void main(String[] args) throws Exception {
		
  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://demoaut.com/");
        Thread.sleep(3000);
        
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.name("firstName")).sendKeys("AIRA");
        driver.findElement(By.name("lastName")).sendKeys("AIBEDULL");
        driver.findElement(By.name("country")).sendKeys("TOGO");
        driver.findElement(By.name("register")).click();
        Thread.sleep(3000);
        
        boolean status = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).isDisplayed();
        System.out.println(status);
        if (status) {
        	System.out.println("Element exist");
        } else {
        	System.out.println("There is no element");
        }
        
        String exp_msg = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
        String success_msg = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
         
        if (exp_msg.equals(success_msg)) {
        	System.out.println("Success");
        } else {
        	System.out.println("Falls");
        }
        
        driver.close();
        driver.quit();
	}

}
