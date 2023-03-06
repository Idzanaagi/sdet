package login;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private String fakeUserData = "test";

    private String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";

    @FindBy(css = "[data-test='username']")
    private WebElement usernameField;
    @FindBy(css = "[data-test='password']")
    private WebElement passwordField;
    @FindBy(css = "[data-test='login-button']")
    private WebElement btnLogin;
    @FindBy(css = "[data-test='error']")
    private WebElement errorMessage;
    public void open(String link) {
        driver.get(link);
    }
    public void fillUsernameFakeData() {
        usernameField.sendKeys(fakeUserData);
    }
    public void fillPasswordFakeData() {
        passwordField.sendKeys(fakeUserData);
    }
    public void submitForm() {
        btnLogin.click();
    }
    public void checkErrorMessage() {
        Assertions.assertEquals(expectedErrorMessage, errorMessage.getText());
    }
}
