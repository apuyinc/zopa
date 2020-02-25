package zopa.automatedtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {


    protected static WebDriver driver;
    protected static WebDriverWait wait;

    protected void javaScriptClickByid(String id) {

        String javascriptString = "document.getElementById('" + id + "').click();";

        //JavascriptExecutor because Selenium click on contentpopupdocumentmask delegates to tkpopup and makes it impossible
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(javascriptString);

    }

    protected static void sendKeysMoreSlowly(final WebElement element, final String keys, long waitTime) {
        for (int i = 0; i < keys.length(); i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            element.sendKeys(Character.toString(keys.charAt(i)));
        }
    }


    protected void setFocusOnDefaultContent(WebDriver driver) {
        driver.switchTo().defaultContent();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }
}
