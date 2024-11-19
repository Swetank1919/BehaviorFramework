package Steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features",glue="Steps",plugin = {"pretty", "html:target/htmlreport.html"}
)
public class TestRunnerbehave extends AbstractTestNGCucumberTests {

}
