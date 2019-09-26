package Runnner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="src/Features/GmailOne.feature",
                 glue={"Script"})
public class RunnerGmailOne {

}
