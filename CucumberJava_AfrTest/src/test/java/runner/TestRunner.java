package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/SubscriptionPrompt.feature", glue = {"tests"},
tags= "@promptAppearTest",    	
monochrome = true,
plugin = {"pretty:target/cucumber-pretty.txt",
		"json:target/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
