package com.homework.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
	@CucumberOptions(
			features = "src/FeatureFile/homework.feature",
			glue = {"com.homework.javacode"},
			tags = {"@Actual"})

public class homeworktestrunner {
	
}
