package RunnerFiles;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//FeatFiles",
        glue = {"SDs"},
        monochrome = true,
        plugin = {"pretty",
//                "junit:target/cucumber-reports/cucumber.xml",
                "html:target/HTMLReports/report.html",
//                "json:target/cucumber-reports/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@tag1",dryRun=false)


public class RunnerFile {

}
//@CucumberOptions(features={"FeatFiles"},
//glue= {"SDs"}, tags="@tag1")
//public class RunnerFile extends AbstractTestNGCucumberTests{
//
//}
