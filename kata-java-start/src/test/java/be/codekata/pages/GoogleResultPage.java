package be.codekata.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultPage {
    private WebDriver driver;

    public GoogleResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstResult() {
        WebElement firstGoogleResultTitle = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3"));

        String firstGoogleResult = firstGoogleResultTitle.getText();
        return firstGoogleResult;
    }
}
