package jsExecutor;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.ChangedCharSetException;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.handler.ContextHandler.StaticContext;

import net.bytebuddy.asm.Advice.AllArguments;

public class JSexecutor {
	
	public static void main (String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.expedia.com/");
	
	WebElement element = driver.findElement(By.xpath("//*[@id=\"header-partner-add-hotel-container\"]/a"));
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	String bgColor = element.getCssValue("backgroundColor");
	for(int i=0; i<10; i++) {
		js.executeScript("arguments[0].style.backgroundColor='rgb(0,200,0)'", element);
		js.executeScript("arguments[0].style.backgroundColor='"+bgColor +"'", element);
		Thread.sleep(300);	
	}
	js.executeScript("arguments[0].style.border='3px solid red'", element);
	Thread.sleep(3000);
	
	WebElement element3 = driver.findElement(By.id("tab-flight-tab-hp"));
	js.executeScript("arguments[0].click();", element3);	
	Thread.sleep(3000);
	
	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"flight-departing-hp-flight\"]"));
	js.executeScript("arguments[0].setAttribute('value','05/05/2019');", element2);
	
	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"flight-returning-hp-flight\"]"));
	js.executeScript("arguments[0].setAttribute('value','06/05/2019');", element4);
	Thread.sleep(3000);
	
	js.executeScript("alert('This is test alert')");
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	js.executeScript("arguments[0].click();", element);
	Thread.sleep(3000);
	
	ArrayList <String> tab =new ArrayList <String>(driver.getWindowHandles());
	driver.switchTo().window(tab.get(0));
	js.executeScript("history.go(0)");
	
	System.out.println(js.executeScript("return document.title;").toString());
	System.out.println(js.executeScript("return document.documentElement.innerText;").toString());
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(5000);
	
	element = driver.findElement(By.id("trip-planning-header"));
	js.executeScript("arguments[0].scrollIntoView(true);", element);
	Thread.sleep(5000);
	
	js.executeScript("window.open()");
	Thread.sleep(5000);
	
	js.executeScript("window.open('https://www.rbc.ru/','_blank')");
	Thread.sleep(5000);
	
	driver.close();
	driver.quit();
	
	}
	
}
