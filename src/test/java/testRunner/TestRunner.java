package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\test\\resources\\features\\UrbanLadder.feature",       // Corrected path
        glue = "stepdefinitions",
        dryRun = false, // Set to false for actual execution
        plugin = {
            "pretty",
            "html:target/cucumber-reports/cucumber.html", // Improved path for HTML report
            "json:target/cucumber-reports/cucumber.json"  // Improved path for JSON report
        },
        monochrome = true,
        publish = true // Consider disabling if publishing isn't required
        
        
)
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
