
/**
 *
 * THis is a JUNit test runner file which is invoked by maven surefire plugin.
 * Later it uses cucumber class to propagate the tests.
 *
 * Author: Arghajit Bhattacharya
 */

package tests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/features",
        format = {"pretty", "html:target/cucumber-html-report"},
        tags = {},
        monochrome = true,
        glue=  {"stepdefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"}
)


public class TestRunner {
    // nothing here

}