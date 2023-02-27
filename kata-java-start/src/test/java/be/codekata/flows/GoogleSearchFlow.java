package be.codekata.flows;

import be.codekata.pages.GoogleResultPage;
import be.codekata.pages.GoogleSearchPage;
import org.openqa.selenium.WebDriver;

public class GoogleSearchFlow {
    private WebDriver driver;

    public GoogleSearchFlow(WebDriver driver) {
        this.driver = driver;
    }

    public String searchFor(String searchTerm) {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.acceptCookies();

        googleSearchPage.searchFor(searchTerm);

        GoogleResultPage googleResultPage = new GoogleResultPage(driver);
        String firstGoogleResult = googleResultPage.getFirstResult();
        return firstGoogleResult;
    }
}
