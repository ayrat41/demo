package runnerClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith (Cucumber.class)
@CucumberOptions(
		features = "src/Features/features.feature",
		glue = "src/Expedia/cucumberExpedia.java",
		format = {"pretty","html:src/Output"},
		dryRun = true,
		tags = "@smoke",
		monochrome = true,
		strict = false)
public class runner {
	
}
