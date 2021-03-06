package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
// features,glue, dryRun, plugin, strict, monochrome, tags
@CucumberOptions(features = { "src/test/resources/features"}
	, glue = { "stepDefinition" }
	, tags= {"@Regression, @End2End"}
	, plugin = {"pretty","html:test-output" }
	, dryRun = false
	, monochrome = true)

public class TestRunner {

}
