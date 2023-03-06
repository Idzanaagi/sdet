package purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage {
    WebDriver driver;
    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "[data-test='finish']")
    private WebElement btnFinish;

    public void clickFinish() {
        btnFinish.click();
    }
}
