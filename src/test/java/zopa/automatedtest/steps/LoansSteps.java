package zopa.automatedtest.steps;

import io.cucumber.java.en.And;
import zopa.automatedtest.pages.LoansPage;

public class LoansSteps extends BaseSteps{

    private LoansPage loansPage;

    public LoansSteps() {
        loansPage = new LoansPage();
    }

    @And("navigates to see your rates")
    public void navigatesToSeeYourRates() {
        loansPage.navigateToGetMyPersonalizedRates();
    }
}
