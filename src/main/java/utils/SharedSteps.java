package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.DriverFactory.getAppiumDriver;

public final class SharedSteps {
    private static final AppiumDriver appiumDriver = getAppiumDriver();
    private static final Wait<WebDriver> wait = new WebDriverWait(appiumDriver, Duration.ofSeconds(10));

    public static void clickOnElement(By elementLocator) {
        try {
            final WebElement element = findElement(elementLocator);
            wait.until(d -> element.isDisplayed());
            element.click();
        } catch (StaleElementReferenceException e) {
            final WebElement element = findElement(elementLocator);
            wait.until(driver1 -> element.isDisplayed());
            element.click();
        }
    }

    public static void sendTextToElement(By elementLocator, String text) {
        try {
            final WebElement element = findElement(elementLocator);
            wait.until(d -> element.isDisplayed());
            element.sendKeys(text);
        } catch (StaleElementReferenceException e) {
            final WebElement element = findElement(elementLocator);
            wait.until(d -> element.isDisplayed());
            element.sendKeys(text);
        }
    }

    public static WebElement findElement(By elementLocator) {
        return wait.until(d -> appiumDriver.findElement(elementLocator));
    }

    public static boolean isDisplayed(By elementLocator) {
        return findElement(elementLocator).isDisplayed();
    }

    public static String getTextOfElement(By elementLocator) {
        return findElement(elementLocator).getText();
    }
}
