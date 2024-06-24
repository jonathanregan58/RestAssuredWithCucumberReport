package testRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;


@CucumberOptions(
    features = "src/test/resources/Features",
    glue = {"stepDefinitions"},
    tags = {"@ResponseCodeTest200"},
    plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
    monochrome = true
)

public class Runner extends AbstractTestNGCucumberTests{
   
   
}