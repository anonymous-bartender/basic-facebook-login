package tests;
import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This is Junit file to initiate the tests. Cucumbers option will connect the stepdefinitions and feature files.
 *
 * Author: Arghajit Bhattacharya
 */

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "classpath:features",
        format = {"pretty", "html:target/cucumber-html-report"},
        tags = {},
        monochrome = true,
        glue=  {"src/main/java/stepdefinaitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"}
)


public class TestRunner {



//	@AfterClass
//    public static void teardown() {
//        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//        Reporter.setSystemInfo("user", System.getProperty("user.name"));
//        Reporter.setSystemInfo("os", System.getProperty("os"));
//        Reporter.setTestRunnerOutput("Sample test runner output message");
//    }

}