package be.codekata.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    private WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies() {
        WebElement cookiesAgreeButton = driver.findElement(By.id("L2AGLb"));
        cookiesAgreeButton.click();
    }

    public void searchFor(String searchTerm) {
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys(searchTerm);
        googleSearchBox.submit();
    }

}
