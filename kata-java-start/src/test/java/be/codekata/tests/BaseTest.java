package be.codekata.tests;

import be.codekata.flows.GoogleSearchFlow;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;
    GoogleSearchFlow googleSearchFlow;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Tooling\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");

        googleSearchFlow = new GoogleSearchFlow(driver);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
