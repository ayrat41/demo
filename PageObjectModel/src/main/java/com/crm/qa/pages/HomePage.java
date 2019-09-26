package com.crm.qa.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.crm.qa.base.Base;

public class HomePage extends Base {
	public ArrayList<String>CheckAllLinks(){
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		ArrayList<WebElement>activeLinks = new ArrayList<WebElement>();
		
		for (int i = 0; i<links.size();i++) {
			if (links.get(i).getAttribute("href")!=null&& !links.get(i).getAttribute("href").startsWith("javascript")) {
				activeLinks.add(links.get(i));
			}
		}
		for (int i = 0; i < activeLinks.size(); i++) {
			System.out.println(i +" " + activeLinks.get(i).getAttribute("href"));
		}
		ArrayList<String> response = new ArrayList<String>();
		for (int i = 0; i < activeLinks.size(); i++) {
			if (!activeLinks.get(i).getAttribute("href").startsWith("htt")) {
				System.out.println(activeLinks.get(i).getText()+activeLinks.get(i).getClass());
				i++;
			}
//			System.out.println(i + "  " +activeLinks.get(i).getText()+activeLinks.get(i).getClass());
//			HttpURLConnection connection =(HttpURLConnection)new URL(activeLinks.get(i).getAttribute("href")).openConnection();
//			connection.connect();
//			response.add(connection.getResponseMessage());
//			connection.disconnect();
		}
		return response;
	}
}
