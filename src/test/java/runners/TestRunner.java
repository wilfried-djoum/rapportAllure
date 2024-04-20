package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
        },
        features = "F:\\ISJ\\Inge4\\Semestre2\\Test Logiciel\\automatisation_selennium\\src\\test\\resources\\features",
        glue = {"steps", "org/example/pageObjects"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
