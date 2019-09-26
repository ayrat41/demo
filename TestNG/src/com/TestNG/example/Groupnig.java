package com.TestNG.example;
import org.testng.annotations.Test;

public class Groupnig {
  @Test (groups = {"Audi", "Sedan"})
  public void A6() {
	  System.out.println("This is sedan - Audi A6");
  }
  @Test (groups = {"Honda", "Sedan"}) 
	  public void Accord() {
		  System.out.println("This is sedan - Honda Accord");
	  }
  @Test (groups = {"Honda", "Sedan"}) 
	  public void Civic() {
		  System.out.println("This is sedan - Honda Civic");
	  }
  @Test (groups = {"Hyundai", "Sedan"}) 
	  public void Elantra() {
		  System.out.println("This is sedan - Hyundai Elantra");
	  }
  @Test (groups = {"Audi", "SUV"}) 
	  public void Q5() {
		  System.out.println("This is SUV - Audi Q5");
	  }
  @Test (groups = {"BMW", "SUV"}) 
	  public void X5() {
		  System.out.println("This is SUV -BMW X5");
	  }
  @Test (groups = {"Honda", "SUV"}) 
	  public void SCRV() {
		  System.out.println("This is SUV - Honda CRV");
	  }
  }

