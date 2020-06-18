package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/java/features" 
		,glue= {"stepDefinitions"}
		,format= {"pretty","html:test-report"}
		
		)

public class TestRunner {
	

}
