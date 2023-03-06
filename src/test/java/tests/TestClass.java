package tests;

import login.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import purchase.*;
import webdriver.WebdriverSetting;

public class TestClass extends WebdriverSetting {
    private String link = "https://www.saucedemo.com/";

    @Test
    public void loginWithInvalidUsernameAndPassword() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.open(link);
        loginPage.fillUsernameFakeData();
        loginPage.fillPasswordFakeData();
        loginPage.submitForm();
        loginPage.checkErrorMessage();
    }
    @Test
    public void successfulPurchase() {
        purchase.LoginPage loginPage = PageFactory.initElements(driver, purchase.LoginPage.class);
        ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
        YourCartPage yourCartPage = PageFactory.initElements(driver, YourCartPage.class);
        YourInformationPage yourInformationPage = PageFactory.initElements(driver, YourInformationPage.class);
        OverviewPage overviewPage = PageFactory.initElements(driver, OverviewPage.class);
        CompletePage completePage = PageFactory.initElements(driver, CompletePage.class);

        loginPage.open(link);
        loginPage.fillUsername();
        loginPage.fillPassword();
        loginPage.submitForm();

        productsPage.buyItem();
        productsPage.goToCart();

        yourCartPage.clickCheckout();

        yourInformationPage.fillFirstNameField();
        yourInformationPage.fillLastNameField();
        yourInformationPage.fillCodeField();
        yourInformationPage.submitForm();

        overviewPage.clickFinish();

        completePage.checkCurrentUrl();
        completePage.checkCompleteHeader();

    }
}