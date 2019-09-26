package com.test.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (
		features = "src/loginfeature/Tags_Hoocks_etc.feature",
		glue = "com.test.stepdefinations",
		tags = {"@register"}	
		)

public class TestRunner {

}
