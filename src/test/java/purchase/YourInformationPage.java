package purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourInformationPage {
    WebDriver driver;
    public YourInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    private String userDate = "text";

    @FindBy(css = "[data-test='firstName']")
    private WebElement firstNameField;
    @FindBy(css = "[data-test='lastName']")
    private WebElement lastNameField;
    @FindBy(css = "[data-test='postalCode']")
    private WebElement codeField;
    @FindBy(css = "[data-test='continue']")
    private WebElement btnContinue;

    public void fillFirstNameField() {
        firstNameField.sendKeys(userDate);
    }
    public void fillLastNameField() {
        lastNameField.sendKeys(userDate);
    }
    public void fillCodeField() {
        codeField.sendKeys(userDate);
    }
    public void submitForm() {
        btnContinue.click();
    }

}
