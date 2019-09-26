package runner;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (	features= {"src/main/java/feature"},
					glue = "stepDefinition",
					plugin = {"pretty","html:target/site/cucumber-pretty"},
					dryRun = false,
//					tags = "@smoke",
					monochrome = true,
					strict = false)

@Listeners(ListenerTest.testListener.class)
@Test
public class testRunner extends AbstractTestNGCucumberTests {

}
