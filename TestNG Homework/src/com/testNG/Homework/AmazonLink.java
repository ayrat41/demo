package com.testNG.Homework;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.CSS;
import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonLink {
	WebDriver driver;
	List<WebElement> links;
	List<WebElement> img;
	int Links;
	int Images;
	int LinksWithText;
	int LinksImages;
	int EditBox;
	int Text;


  @BeforeMethod ()
  public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asadu\\Documents\\PNT\\Soft\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @AfterMethod ()
  public void quitbrowser() {
        driver.close();
        driver.quit();
  }
  @Test //all links+ active links
  public void CheckAllLinks() {
	  List<WebElement> links = driver.findElements(By.tagName("a"));
      System.out.println("Total number of links is===> " + links.size());
      ArrayList <WebElement> activeLinks = new ArrayList <WebElement>();
     
		for (int i = 0; i < links.size()-1; i++) {
			if(links.get(i).getAttribute("href") != null) {
			activeLinks.add(links.get(i));
			}
		}
		System.out.println("Total number of active links is===> " + activeLinks.size());
		for(WebElement ele:activeLinks){   
		for (int i = 0; i < img.size()-1; i++) {
				Reporter.log("Link text === " + activeLinks.get(i).getText()+"=ID="  + ele.getAttribute("id") + "=HREF=" + activeLinks.get(i).getAttribute("href"));
				}
		}
//		

	  
  }
  @Test //all images
  public void CheckAllImages() {
	  List<WebElement> img = driver.findElements(By.tagName("img"));
	  ArrayList <WebElement> activeLinksimg = new ArrayList <WebElement>();
      System.out.println("Total number of img is===> " + img.size());
      for (int i = 0; i < img.size()-1; i++) {
		Reporter.log("Images alt text === " + img.get(i).getAttribute("alt") + "== src==" + img.get(i).getAttribute("src"));
		}
      for (int i = 0; i < img.size(); i++) {
			if(img.get(i).getAttribute("href") != null) {
				activeLinksimg.add(img.get(i));
			}
		}
      System.out.println("Total number of imglinks is===> " + img.size());
//		for(WebElement ele:img){
//		System.out.println(ele.getAttribute("name") +"=== " + ele.getAttribute("id") +"=== " + ele.getAttribute("href"));
//	}

	}
  
  @Test //all links with text
  public void CheckTxtLinks() {
	   List<WebElement> TxtLink = driver.findElements(By.tagName("a"));
	   ArrayList <WebElement> activeLinks = new ArrayList<WebElement>();
	   for (int i = 0; i < TxtLink.size(); i++) {
			if(TxtLink.get(i).getAttribute("href") != null) {
			activeLinks.add(TxtLink.get(i));		
		}
		}
		System.out.println("Active links total ===>"+ activeLinks.size());
		String LinkText;	
	    for (int j = 0; j < activeLinks.size(); j++) {
	    LinkText = (activeLinks.get(j).getText());	
	    if (LinkText.length()>0) {
	    	System.out.println("Link has text - " + LinkText);
	    }   
//	    for (WebElement ele: activeLinks) {
//			System.out.println("Active Link ID is===>" + ele.getAttribute("id") + " name ===>" +ele.getAttribute("name"));
//		}
	    
//		for (int j = 0; j < activeLinks.size(); j++) {
//		HttpURLConnection connection =(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
//		connection.connect();
//		String response = connection.getResponseMessage();
//		connection.disconnect();
//	    System.out.println(activeLinks.get(j).getAttribute("href")+ "===>" + response);
//}
 }	   
	  
  }
  @Test //all links with images
  public void CheckAllLinksWithImg() {
  }
  
  @Test //all edit boxes
  public void CheckAllEditBoxes() throws Exception {
	  List<WebElement> EditBox = driver.findElements(By.tagName("input"));
      System.out.println("Total number of Edit Box is===> " + EditBox.size());
     
      for (WebElement ele: EditBox) {
		System.out.println("Edit box ID is===>" + ele.getAttribute("id") + " name ===>" +ele.getAttribute("name"));
	}
  }
  
  
  @Test //all text messages
  public void CheckAllTxtMsg() {
  }
  @Test //all edit boxes
  public void CheckAllSelectBox() throws Exception {
	  List<WebElement> selectbox = driver.findElements(By.tagName("select"));
      System.out.println("Total number of Select Box is===> " + selectbox.size());
     
      for (WebElement ele: selectbox) {
		System.out.println("Select box ID is===>" + ele.getAttribute("id") + " name ===>" +ele.getAttribute("name"));
	}
  }
}
