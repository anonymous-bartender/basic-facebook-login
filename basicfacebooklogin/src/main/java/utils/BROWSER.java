/**
 *
 * This is a helper class to initiate the selenium driver based on selected browser and return it.
 *
 * Author: Arghajit Bhattacharya
 */

package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BROWSER {

    public static WebDriver CHROME() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        return driver;

    }

    public static WebDriver FIREFOX() {
        // write code here
        return null;
    }

}
