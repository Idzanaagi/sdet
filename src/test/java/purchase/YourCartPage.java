package purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage {
    WebDriver driver;
    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    private WebElement btnCheckout;

    public void submitCheckout() {
        btnCheckout.click();
    }
}
