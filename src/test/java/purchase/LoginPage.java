package purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private String usernameData = "standard_user";
    private String passwordData = "secret_sauce";

    @FindBy(css = "[data-test='username']")
    private WebElement usernameField;
    @FindBy(css = "[data-test='password']")
    private WebElement passwordField;
    @FindBy(css = "[data-test='login-button']")
    private WebElement btnLogin;
    public void open(String link) {
        driver.get(link);
    }
    public void fillUsername() {
        usernameField.sendKeys(usernameData);
    }
    public void fillPassword() {
        passwordField.sendKeys(passwordData);
    }
    public void submitForm() {
        btnLogin.click();
    }
}
