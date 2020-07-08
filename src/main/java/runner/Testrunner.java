package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		format = {"pretty","html:target/cucumber-reports/cucumber-pretty"},
				features = "src/main/java/feature",
				tags={"@Scenario2"},
				glue={"stepdefination"})
public class Testrunner extends AbstractTestNGCucumberTests {

}
