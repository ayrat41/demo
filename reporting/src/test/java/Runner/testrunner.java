package Runner;


import org.apache.commons.io.filefilter.FalseFileFilter;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\asadu\\eclipse-workspace\\reporting\\src\\test\\java\\Feature\\Tags_Hoocks_etc.feature",
		glue= "com.cucumber.test.reporting",
		format = {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = false,//display console report in readable format
		strict=false,//check if any step is missed in stepdefinition
		dryRun=false//check mapping between features and stepdefinition w/o running script
//		tags = {"~@Smoke", "~@Regrsssion"} //Except syntax
//	    tags = {"@Smoke", "~@Regrsssion"} //AND syntax
//  	tags = {"@Smoke", "@Regrsssion"} //OR syntax	
		)
public class testrunner {

}
