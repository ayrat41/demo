
public class test {

	private Selenium selenium;
	@Before
	public void setup() {
	selenium = new DefaultSelenium ("localhost",4444,"*googlechrome", "http://demoaut.com/");
	selenium.start();
}
