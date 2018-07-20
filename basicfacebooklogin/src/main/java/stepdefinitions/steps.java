package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.BeforeClass;
//import cucumber.api.java.before;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * This is the step definition file contianing all the steps of feature files.
 * For now CHROME is hard-coded here. We can make browser choice flexible by passing it from a .config file.
 * For optimal use of driver instance, we can create a singleton class or driverManger instance to handle the driver session.
 *
 * Author: Arghajit Bhattacharya
 *
 */

public class steps {


    @Before
    public void hooks() {
    System.out.println("Hooks");

    }

    WebDriver driver;

    @Given("^user load .* in browser$")
    public void user_load_https_www_facebook_com_in_browser(String url) {
        System.out.println(url);

        assert true;

    }

    @When("^user provide login credential$")
    public void user_provide_login_credential(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

        List<List<String>> creds = table.raw();
        System.out.println(creds);
        assert true;
    }

    @When("^user add a new post$")
    public void user_add_a_new_post(DataTable table) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

        List<List<String>> creds = table.raw();
        System.out.println(creds);
        assert true;
    }

    @Then("^post is successfully added$")
    public void post_is_successfully_added() {
        // Write code here that turns the phrase above into concrete actions
        assert true;
    }



}
