package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty", "html:target"}, features= "src/test/java/FeatureNestle", glue= "Steps", dryRun=false)

public class testRunner {

}
