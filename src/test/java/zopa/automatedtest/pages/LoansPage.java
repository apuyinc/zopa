package zopa.automatedtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoansPage extends BasePage {


    private By getMyPersonalizedRates_Button = By.cssSelector("button[data-automation='ZA.button-personal-rate']");

    public void navigateToGetMyPersonalizedRates() {
        wait.until(ExpectedConditions.elementToBeClickable(getMyPersonalizedRates_Button));
        driver.findElement(getMyPersonalizedRates_Button).click();
    }

}
