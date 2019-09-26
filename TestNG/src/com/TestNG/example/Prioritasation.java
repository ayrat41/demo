package com.TestNG.example;

import org.testng.annotations.Test;

public class Prioritasation {
  @Test
  public void b() {
	  System.out.println("Priority1");
  }
  @Test
  public void f2() {
	  System.out.println("Priority2");
  }
  @Test
  public void c() {
	  System.out.println("Priority3");
  }
  @Test
  public void f4() {
	  System.out.println("Priority4");
  }
}
