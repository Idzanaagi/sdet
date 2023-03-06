package webdriver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebdriverSetting {
    public WebDriver driver;
    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\on8d\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterEach
    public void close() {
        driver.quit();
    }
}
