package Facebook;

import java.util.StringTokenizer;

import javax.swing.plaf.synth.ColorType;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Facebook {
        WebDriver driver;
//        Select select;
        String [] EditBoxName = {"firstname", "lastname", "reg_email__", "reg_passwd__" };
        String [] SelectBoxName = {"birthday_month", "birthday_day", "birthday_year"};
        String [] RadiobuttonXpath = {"//*[@id=\"u_0_s\"]/span[1]/label", "//*[@id=\"u_0_s\"]/span[2]/label"};
        String [] SelectCase1 = {"Month","Day","Year"};
        String [] SelectCase2 = {"Jan","Day","Year"};
        String [] SelectCase3 = {"Jan","1","Year"};
        String [] SelectCase4 = {"Jan","1","1993"}; 
        String [] ErrMsgLinkCase1 = {"//*[@id=\"u_0_d\"]/i[1]", "//*[@id=\"u_0_g\"]/i[1]", "//*[@id=\"u_0_n\"]/i[1]","//*[@id=\"u_0_p\"]/div[2]/i[1]", "//*[@id=\"u_0_p\"]/div[2]/i[2]" };
       
        String [] ErrMsgText = {"What’s your name?", "What’s your name?", "You'll use this when you log in and if you ever need to reset your password.", "rg_passwd__" };
        
        
        
        String [] Case1 = {"", "", "" ,"" };
        String [] Case2 = {"Tester", "", "" ,"" };
        String [] Case3 = {"Tester", "Tester", "" ,"" };
        String [] Case4 = {"Tester", "Tester", "tester@gmail.com" ,"" };
        String [] Case5 = {"Tester", "Tester", "tester@gmail.com" ,"tester123" };
	
        @BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Test Started");
		
	}

	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("Test Ended");
	}

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
		driver = new ChromeDriver();
//		select = new Select(null);
		driver.get("https://www.facebook.com/");
		System.out.println("Browser Launched");
		
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finish");
		driver.close();
		driver.quit();
		
	
	}

	@Test
	public void RegisterAccount() throws Exception {
		
		for (int i = 0; i < EditBoxName.length; i++) {
			
			driver.findElement(By.name(EditBoxName[i])).sendKeys(Case1[i]);
			System.out.println("Edit Box " + EditBoxName[i] + "'" + Case1[i] + "'");
		}
		for (int x = 0; x < SelectBoxName.length; x++) {	
			driver.findElement(By.name(SelectBoxName[x])).sendKeys(SelectCase1[x]);		
			System.out.println("Select Box " + SelectBoxName[x] + "'" + SelectCase1[x] + "'");
		}		
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(1000);
	
		for (int x=0; x < ErrMsgLinkCase1.length; x++) {
		boolean Emoji = driver.findElement(By.xpath(ErrMsgLinkCase1[x])).isDisplayed();	
		if (Emoji)
	    {
	         System.out.println( x + "Error is displayed.");
	    }
	    else
	    {
	        System.out.println(x + "Error is not displayed.");
	    }
		}	
	}
	@Test
	public void Color() throws Exception {
//		String LogIn_Color = driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div")).getAttribute("class");
//		String[] arrColor = LogIn_Color.split("background-color");
//		System.out.println(arrColor);
		String color = driver.findElement(By.xpath("//*[@id='loginbutton']")).getCssValue("background-color");
		System.out.println(color);
		String hex = Color.fromString(color).asHex();
		System.out.println(hex);
		
	}
}

