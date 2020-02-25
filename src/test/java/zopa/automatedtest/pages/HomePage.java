package zopa.automatedtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    private static final int TIMEOUT = 20;
    private static final int POLLING = 100;

    private By seeYourRates_Button = By.cssSelector("a[data-automation='ZA.button-Loans'] footer span");

    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public void goToSeeYourRates() {
        wait.until(ExpectedConditions.elementToBeClickable(seeYourRates_Button));
        driver.findElement(seeYourRates_Button).click();
    }

}
