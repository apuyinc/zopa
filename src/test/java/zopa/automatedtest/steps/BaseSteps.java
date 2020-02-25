package zopa.automatedtest.steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSteps {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;



    public WebDriver getDriver() {
        return webDriver;
    }

    public WebDriverWait getDriverWait() {
        return webDriverWait;
    }


}
