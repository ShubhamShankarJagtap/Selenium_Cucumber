package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = ".//feature//login.feature",
        glue = "stepdefinition",
//        dryRun = true,
        monochrome = true,
        plugin = {"pretty", "html:Report/CucumberReport/Report.htm"}
)

public class Runner {
}
