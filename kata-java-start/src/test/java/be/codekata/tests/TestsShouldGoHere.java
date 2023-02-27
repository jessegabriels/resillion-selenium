package be.codekata.tests;

import be.codekata.models.UserModel;
import be.codekata.models.UserModelBuilder;
import be.codekata.pages.GoogleResultPage;
import be.codekata.pages.GoogleSearchPage;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestsShouldGoHere extends BaseTest {

    @Test
    public void failingTest() {
        assertThat(false, equalTo(true));
    }

    @Test
    public void passingTest() {
        assertThat(true, equalTo(true));
    }

    @Test
    void verifyGoogleTitle() {
        UserModel user = UserModelBuilder.aUserModel().withDefaultUser().build();

        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.acceptCookies();

        String eurofins = "Eurofins";
        googleSearchPage.searchFor(eurofins);

        GoogleResultPage googleResultPage = new GoogleResultPage(driver);
        assertGoogleSearchResults("Eurofins Scientific: Worldwide laboratory testing services", googleResultPage.getFirstResult());
    }

    @Test
    void verifyIjsbeerTitle() {
        assertGoogleSearchResults("Polar bear - Wikipedia", googleSearchFlow.searchFor("Ijsbeer"));
    }

    @Test
    void verifyPlasticPlantResult() {
        assertGoogleSearchResults("Plastic plant wiki", "Artificial plants - Wikipedia");
    }

    @Test
    void verifyWaterGlassWikiResult() {
        assertGoogleSearchResults("Water Glass wiki","Sodium silicate - Wikipedia");
    }

    private void assertGoogleSearchResults(String searchTerm, String expected) {
        String firstGoogleResult = googleSearchFlow.searchFor(searchTerm);
        assertThat(firstGoogleResult, equalTo(expected));
    }


}
