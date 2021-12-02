package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/SubscriptionPrompt.feature", glue = {"tests"},
tags= "@promptDisappearTest",    	
monochrome = true,
plugin = {"pretty", "html:target/HtmlReports",
		"json:target/JSONReport/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
