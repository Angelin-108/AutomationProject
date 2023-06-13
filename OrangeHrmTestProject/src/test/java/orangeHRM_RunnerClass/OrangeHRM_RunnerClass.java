package orangeHRM_RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"orangeHRM_StepDefinition"},
publish=true,
monochrome=true,
tags = "@TC_01",
//tags = "@TC_02",
//tags = "@TC_03",
//tags = "@TC_04",
plugin = {"pretty","html:target/HtmReports/report.html"}
)
public class OrangeHRM_RunnerClass {

}
