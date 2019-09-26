package com.TestNG.example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency {
	
	  @Test
	  public void A6() {
		  System.out.println("This is sedan - Audi A6");
		  Reporter.log("A6 passed");
	  }
	  @Test (dependsOnMethods = {"A6"})  
		  public void Accord() {
			  System.out.println("This is sedan - Honda Accord");
		  }
	  @Test (dependsOnMethods = {"Accord"}) 
		  public void Civic() {
			  System.out.println("This is sedan - Honda Civic");
		  }
	  @Test (dependsOnMethods = {"Civic"}) 
		  public void Elantra() {
			  System.out.println("This is sedan - Hyundai Elantra");
		  }
	  @Test (dependsOnMethods = {"SCRV"}) 
		  public void Q5() {
			  System.out.println("This is SUV - Audi Q5");
		  }
	  @Test (dependsOnMethods = {"Q5"}) 
		  public void X5() {
			  System.out.println("This is SUV -BMW X5");
		  }
	  @Test (dependsOnMethods = {"Elantra"}) 
		  public void SCRV() {
			  System.out.println("This is SUV - Honda CRV");
		  }
}
