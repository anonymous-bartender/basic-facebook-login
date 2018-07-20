
/**
 * POM file representing the landing page of facebook.com website.
 * Create a instance of the class by passing active driver instance.
 * Author: Arghajit Bahttacharya
 *
 */
package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class newsfeed {

    WebDriver driver;

    /**
     * Following are the UI elements for the specified page
     */

    @FindBy(css="textarea[title*='Write something here...']")
    private WebElement divStatus;

    @FindBy(css="button[data-testid='react-composer-post-button']")
    private WebElement btnShare;

    @FindBy(css="a[title='Profile']")
    private WebElement lnkProfile;

    @FindBy(css="div[role='article']:first-child .userContent p")
    private WebElement firsttimelinePost;

    @FindBy(css="div[aria-label=\"News Feed\"]>div[role='article'] p")
    private WebElement selfRecentPost;



    public newsfeed(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean postStatus(String msg) {

            divStatus.click();
            divStatus.sendKeys(msg);

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait
                .pollingEvery(100,TimeUnit.MILLISECONDS)
                .withTimeout(15,TimeUnit.SECONDS)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.elementToBeClickable(btnShare))
            .click();

            return true;
    }

    public String matchMostRecentPost() {



        WebDriverWait wait = new WebDriverWait(driver, 10);
        String actual = wait
                .pollingEvery(100,TimeUnit.MILLISECONDS)
                .withTimeout(15,TimeUnit.SECONDS)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOf(selfRecentPost))
            .getText();

        return actual.trim();

    }


}
