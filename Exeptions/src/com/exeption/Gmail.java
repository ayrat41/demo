package com.exeption;

public class Gmail {

	public static void main(String[] args) {
		
		Gmail gmail = new Gmail();
			try{
			    gmail.openBrowser();
	   		    gmail.Login();
			    gmail.Logout();
		   	    gmail.closeBrowser();
		   	} catch (Exception e) {
		   		System.out.println("Exception occured");
		   		e.printStackTrace();
		   	} finally {
		   		gmail.Login();
		   		gmail.Logout();
		   	    gmail.closeBrowser();
		   	}

	}
	public void openBrowser() {
		System.out.println("Open browser");
			int x=10/0;
	}
	public void Login() {
		System.out.println("Login");
	
	}
	public void Logout() {
		System.out.println("Logout");
	}
	public void closeBrowser() {
		System.out.println("Close browser");
	}
}
