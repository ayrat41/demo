package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilFIle.UtilFile;

public class Test2 {
	@BeforeMethod
	public void LaunchSuite() {
		UtilFile.launchBrowser("https://www.google.com/");
	}
	@Parameters({"x", "y"})
	@Test (priority=1, groups="smoke")
	public void f1(String x, String y) {
		assertEquals(x, y);
	}
	
	@Parameters({"x", "y"})
	@Test (priority =2, groups = "smoke")
	public void f2(int x, int y) {
		assertEquals(x, y);
	}
	
	@Parameters({"x", "y"})
	@Test (priority=3, groups="regression")
	public void f3(String x, String y) {
		assertEquals(x, y);
	}
	
	@Parameters({"x", "y"})
	@Test (priority=4, groups="regression")
	public void f4(int x, int y) {
		assertEquals(x, y);
	}
	
	@Parameters({"x", "y"})
	@Test(priority=5, groups = "regression")
	public void f5(int x, int y) {
		assertEquals(x, y);
	}
	
	@AfterMethod
	public void close() {
		UtilFile.closeBrowser();
	}
  

}
