package com.demoaut.RegRunning;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/registrationfeature/registration.feature",
		glue = "com.demoaut.registrationcode",
		tags = {("@Out")})

public class RegistrationRunning {

}
