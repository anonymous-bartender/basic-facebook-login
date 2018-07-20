package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.homepage;
import pages.newsfeed;

import utils.BROWSER;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is the step definition file contianing all the steps of feature files.
 * For now CHROME is hard-coded here. We can make browser choice flexible by passing it from a .config file.
 * For optimal use of driver instance, we can create a singleton class or driverManger instance to handle the driver session.
 * <p>
 * Author: Arghajit Bhattacharya
 */

public class steps {


    private WebDriver driver;
    private homepage home;
    private newsfeed feed;

    private Map<String, String> dataContext = new HashMap<>();



    @Before
    public void setup() {
        try {
            driver = BROWSER.CHROME();

        } catch (Exception e) {
            e.printStackTrace();
            assert false;
        }
        assert true;

    }


    @Given("^user load (.*) in browser$")
    public void user_load_https_www_facebook_com_in_browser(String url) {

        driver.get(url);
        assert true;

    }

    @When("^user provide login credential$")
    public void user_provide_login_credential(DataTable table) {


        home = new homepage(driver);
        List<List<String>> creds = table.raw();
        assert home.login(creds.get(0).get(0), creds.get(0).get(1));

    }

    @When("^user add a new post$")
    public void user_add_a_new_post(DataTable table) {

        List<List<String>> msg = table.raw();
        dataContext.put("status", msg.get(0).get(0));

        try {
            feed = new newsfeed(driver);
            assert feed.postStatus(msg.get(0).get(0));
        } catch (Exception e) {
            e.printStackTrace();
            assert false;
        }
    }

    @Then("^post is successfully added$")
    public void post_is_successfully_added() {

        String expected=null,actual=null;

        try {
            actual = feed.matchMostRecentPost().trim();
            expected = dataContext.get("status").trim();


            assert actual == expected;

        } catch(AssertionError ae) {
            System.out.println("Expected ["+expected+"] Actual ["+actual+"]");
        }


        catch (Exception e) {
            e.printStackTrace();
            assert false;
        }

    }

    @After
    public void teardown() {
       // driver.quit();
    }


}
