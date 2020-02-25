package zopa.automatedtest.steps;

import io.cucumber.java.en.Given;
import zopa.automatedtest.pages.HomePage;

public class HomeSteps extends BaseSteps {

    private HomePage myHomePage = new HomePage();

    @Given("go to see your rates")
    public void seeYourRates() {
        myHomePage.goToSeeYourRates();
    }

    @Given("user navigates to Zopa")
    public void userNavigatesToZopa() {
        myHomePage.launchBrowser();
        myHomePage.navigateToUrl("https://www.zopa.com");
    }
}
