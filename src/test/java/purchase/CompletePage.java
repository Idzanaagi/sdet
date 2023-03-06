package purchase;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage {
    WebDriver driver;
    public CompletePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(className = "complete-header")
    private WebElement completePurchaseHeader ;

    public void checkCompleteHeader() {
        Assertions.assertEquals("Thank you for your order!", completePurchaseHeader.getText());
    }
}
