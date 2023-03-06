package purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
    WebDriver driver;
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(className = "btn_inventory")
    private WebElement firstProduct;
    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCart;

    public void buyItem() {firstProduct.click();}
    public void goToCart() {
        shoppingCart.click();
    }
}
