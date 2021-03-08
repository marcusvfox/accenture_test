package accenture_pom_steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"accenture_pom_steps"},
monochrome =true,
plugin={"pretty","junit:target/JUnitReports/report.xml",
		"html:target/HtmlReports",
		"json:target/JSONreports/report.json"})

public class testRunner {

}