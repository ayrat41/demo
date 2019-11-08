package cucumberKamila;


import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features="src/test/resourses/facebook.feature",
glue="steps",
plugin={"pretty", })

public class runner {
}
