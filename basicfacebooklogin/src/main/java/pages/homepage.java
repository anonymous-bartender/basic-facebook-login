package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

    WebDriver driver;

    @FindBy(name="#email")
    WebElement inputUsername;

    @FindBy(css="#pass")
    WebElement inputPassword;

    @FindBy(css="#loginbutton input")
    WebElement btnLogin;



    public homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean login(String username,String password) {

        /*
        For better handling we can use try catch block or other semantics for any UI fallback case
         */

        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);

        btnLogin.click();

        return true;



    }


}
