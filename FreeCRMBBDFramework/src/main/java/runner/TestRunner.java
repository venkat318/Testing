package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:/FreeCRMBBDFramework/src/main/java/features/Login.feature",
			glue= {"stepDefinitions"} ,
			plugin = {"pretty", "html:test-output"}
			)
public class TestRunner {

}
