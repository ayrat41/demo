package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilFIle.UtilFile;

@Listeners(ListenersTry.ListenersTest.class)

public class Test1 {
	
	@BeforeMethod
	public void LaunchSuite() {
		UtilFile.launchBrowser("https://www.google.com/");
	}
	@Parameters({"x1", "y1"})
	@Test (priority=1, groups="smoke")
	public void f1(String x1, String y1) {
		assertEquals(x1, y1);
	}
	@Parameters({"x2", "y2"})
	@Test (priority =2, groups = "smoke")
	public void f2(String x2, String y2) {
		assertEquals(x2, y2);
	}
	@Parameters({"x3", "y3"})
	@Test (priority=3, groups="regression")
	public void f3(String x3, String y3) {
		assertEquals(x3, y3);
	}
	@Parameters({"x4", "y4"})
	@Test (priority=4, groups="regression")
	public void f4(String x4, String y4) {
		assertEquals(x4, y4);
	}
	@Parameters({"x5", "y5"})
	@Test(priority=5, groups = "regression")
	public void f5(String x5, String y5) {
		assertEquals(x5, y5);
	}
	
	@AfterMethod
	public void close() {
		UtilFile.closeBrowser();
	}
  
}
