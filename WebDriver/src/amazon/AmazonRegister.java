package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonRegister {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\Browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com/");
        driver.manage().window().maximize();
//      driver.switchTo().alert().accept();
//      driver.switchTo().alert().accept();//- Handle PopUps - click OK;
//      driver.switchTo().alert().dismiss();// - Handle PopUps - click Cancel
        
//      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); - wait every line of code before it throws an exception;
//      WebDriverWait Wait = new WebDriverWait(driver,3);
//      WebElement element= Wait.until (ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList")));//wait till element presented or active;
//      ExpectedConditions.visibilityOf(element);
//      driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
        Thread.sleep(1000);
        //By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]")).click();
        String [] XpathEdit = {"//*[@id=\"ap_customer_name\"]", "//*[@id=\"ap_email\"]","//*[@id=\"ap_password\"]", "//*[@id=\"ap_password_check\"]"};
        String [] XpathMsg = {"//*[@id=\"auth-customerName-missing-alert\"]/div/div", "//*[@id=\"auth-email-missing-alert\"]/div/div", "//*[@id=\"auth-password-missing-alert\"]/div/div", "//*[@id=\"auth-passwordCheck-missing-alert\"]/div/div" };
        String [] ErrMsg = {"Enter your name", "Enter your email", "Enter your password", "Type your password again"};
        String [] CaseName = {"name", "email", "password", "passwordCheck"};
        String [] Case1 = {"", "", "", ""};
        String [] Case2 = {"Tester", "", "", ""};
        String [] Case3 = {"Tester", "Tester@gamil.com" , "", ""};
        String [] Case4 = {"Tester", "Tester@gamil.com","Tester 123", ""};
        String [] Case5 = {"Tester", "Tester@gamil.com","Tester 123", "Tester 123"};       
        
 //case1       
        for (int x = 0; x < Case1.length; x++) {
        	driver.findElement(By.xpath(XpathEdit[x])).sendKeys(Case1[x]);
        	driver.findElement(By.id("continue")).click();
        }
        
        for (int x = 0; x < Case1.length; x++) {
            String DisplaiedMsg = driver.findElement(By.xpath(XpathMsg[x])).getText();
            if (DisplaiedMsg.contains(ErrMsg[x])) {       	
    			System.out.println(ErrMsg[x]+"Pass");
    		} else {
    			System.out.println( ErrMsg[x] + "Case1 failed");
    		}
        }
 //case2      
        for (int x = 0; x < Case2.length; x++) {
        	driver.findElement(By.xpath(XpathEdit[x])).clear();
        	driver.findElement(By.xpath(XpathEdit[x])).sendKeys(Case2[x]);
            driver.findElement(By.id("continue")).click();  
        }
            
        for (int x = 0; x < Case2.length; x++) {
			 String DisplaiedMsg = driver.findElement(By.xpath(XpathMsg[x])).getText();	
            if (DisplaiedMsg.contains(ErrMsg[x]) && Case2[x] == "") {
    			System.out.println(ErrMsg[x]+"Pass");
    		}	else if (DisplaiedMsg.isEmpty() && !Case2[x].isEmpty()) {
    			System.out.println(ErrMsg[x] + " is gone - Pass");
    		} else {
    			System.out.println( ErrMsg[x] + " Case 2 failed");
    		}            
       }
//case3
        for (int x = 0; x < Case3.length; x++) {
        	driver.findElement(By.xpath(XpathEdit[x])).clear();
        	driver.findElement(By.xpath(XpathEdit[x])).sendKeys(Case3[x]);
        	driver.findElement(By.id("continue")).click();
        }
        	
        for (int x = 0; x < Case3.length; x++) {
        	String DisplaiedMsg = driver.findElement(By.xpath(XpathMsg[x])).getText();
        
             if (DisplaiedMsg.contains(ErrMsg[x]) && Case3[x].isEmpty()) {
     			System.out.println(ErrMsg[x]+" Case 3 Pass");
     		}	else if (DisplaiedMsg.isEmpty() && !Case3[x].isEmpty()) {
     			System.out.println(ErrMsg[x] + " is gone - Case 3 Pass");
     		} else {
     			System.out.println(ErrMsg[x] + " Case 3 failed");
     		}            
        }
//case4        
        for (int x = 0; x < Case4.length; x++) {
        	driver.findElement(By.xpath(XpathEdit[x])).clear();
        	driver.findElement(By.xpath(XpathEdit[x])).sendKeys(Case4[x]);
            driver.findElement(By.id("continue")).click();
        }
        for (int x = 0; x < Case4.length; x++) {            
            String DisplaiedMsg = driver.findElement(By.xpath(XpathMsg[x])).getText();
            
            if (DisplaiedMsg.contains(ErrMsg[x]) && Case4[x].isEmpty()) {
    			System.out.println(ErrMsg[x]+" Pass");
    		}	else if (DisplaiedMsg.isEmpty() && !Case4[x].isEmpty()) {
    			System.out.println(ErrMsg[x] + " is gone - Case 4 Pass");
    		} else {
    			System.out.println(ErrMsg[x] + " Case 4 failed");
    		}           
       }
        
        Thread.sleep(3000);
                 
//case5       
        for (int x = 0; x < Case5.length; x++) {
				driver.findElement(By.xpath(XpathEdit[x])).clear();
                driver.findElement(By.xpath(XpathEdit[x])).sendKeys(Case5[x]);
                driver.findElement(By.id("continue")).click();
               
        }
      
                String DisplaiedMsg = driver.findElement(By.xpath("//*[@id='cvf-page-content']/div/div/div[1]/form/div[1]/div[1]/h1")).getText();
                String Title = driver.getTitle();
                System.out.println(Title);
                if (DisplaiedMsg.contains("Verify email adress") || Title.contains("Please confirm your identity")) {
        			System.out.println("Case 5 Pass");
        		} else {
        			System.out.println("Case 5 failed");
        		}             
               		
	driver.close();
	driver.quit();
        }
		
}
