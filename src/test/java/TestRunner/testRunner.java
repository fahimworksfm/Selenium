package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Feature",
		
		glue = "StepDefinition"
		
		)

public class testRunner extends AbstractTestNGCucumberTests{

}
