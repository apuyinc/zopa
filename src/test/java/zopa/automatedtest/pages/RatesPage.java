package zopa.automatedtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RatesPage extends BasePage {


    private By carLoan_RadioButton = By.cssSelector("label[for='radio-id-CAR']");
    private By homeImprovementLoan_RadioButton = By.cssSelector("label[for='radio-id-HOME_IMPROVEMENTS']");
    private By debtConsolidationLoan_RadioButton = By.cssSelector("label[for='radio-id-CONSOLIDATE']");
    private By otherLoan_RadioButton = By.cssSelector("label[for='radio-id-OTHER']");

    private By emailAddress_Input = By.id("text-id-email");

    private By titleMr_RadioButton = By.cssSelector("radio-id-Mr");

    private By firstName_Input = By.id("text-id-firstName");
    private By lastName_Input = By.id("text-id-lastName");
    private By dayOfBirth_Input = By.id("text-id-day");
    private By monthOfBirth_Input = By.id("text-id-month");
    private By yearOfBirth_Input = By.id("text-id-year");
    private By phoneNumber_Input = By.id("text-id-phone");

    private By employmentStatus_Input = By.cssSelector("label[for='radio-id-EMPLOYED_FULL_TIME']");

    private By annualIncome_Input = By.id("text-id-annualIncome");

    private By homeOwner_RadioButton = By.cssSelector("label[for='radio-id-OWNER_NO_MORTGAGE']");

    private By postCode_Input = By.id("text-id-postCode");
    private By selectAddress_Select = By.cssSelector("select[data-automation='ZA.selectAddress']");

    private By moveInMonth_Select = By.cssSelector("select[data-automation='ZA.MoveInDateSelector.Month']");
    private By moveInYear_Select = By.cssSelector("select[data-automation='ZA.MoveInDateSelector.Year']");

    public void SelectLoanCar() {
        wait.until(ExpectedConditions.elementToBeClickable(carLoan_RadioButton));
        driver.findElement(carLoan_RadioButton).click();
    }

    public void typeEmailAddress(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailAddress_Input));
        driver.findElement(emailAddress_Input).sendKeys(email);
    }

    public void selectTitleMr() {
        wait.until(ExpectedConditions.elementToBeClickable(titleMr_RadioButton));
        driver.findElement(titleMr_RadioButton).click();
    }

    public void typeFirstName(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstName_Input));
        driver.findElement(firstName_Input).sendKeys();
    }

    public void typeLastName(String lastName) {
        wait.until(ExpectedConditions.elementToBeClickable(lastName_Input));
        driver.findElement(lastName_Input).sendKeys();
    }

    public void typeDayOfBirth(String day) {
        wait.until(ExpectedConditions.elementToBeClickable(dayOfBirth_Input));
        driver.findElement(dayOfBirth_Input).sendKeys(day);
    }

    public void typeMonthOfBirth(String month) {
        wait.until(ExpectedConditions.elementToBeClickable(dayOfBirth_Input));
        driver.findElement(dayOfBirth_Input).sendKeys(month);
    }

    public void typeYearOfBirth(String year) {
        wait.until(ExpectedConditions.elementToBeClickable(dayOfBirth_Input));
        driver.findElement(dayOfBirth_Input).sendKeys(year);
    }

    public void typePhoneNumber(String phoneNumber) {
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumber_Input));
        driver.findElement(phoneNumber_Input).sendKeys(phoneNumber);
    }

    public void typePostCode(String postalCode) {
        wait.until(ExpectedConditions.elementToBeClickable(postCode_Input));
        driver.findElement(phoneNumber_Input).sendKeys(postalCode);
    }
}
