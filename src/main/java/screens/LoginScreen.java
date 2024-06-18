package screens;

import org.openqa.selenium.By;

import static settings.SharedSteps.clickOnElement;
import static settings.SharedSteps.sendTextToElement;

public class LoginScreen {

    private final By phoneEditBoxLocator = By.xpath("//android.view.View[@resource-id=\"phoneNumberField\"]/android.view.View/android.widget.EditText");
    private final By passwordEditBoxLocator = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
    private final By loginButtonLocator = By.xpath("//android.view.View[@resource-id=\"loginBtn\"]/android.widget.Button");

    //Prevent instance
    private LoginScreen() {

    }

    public static LoginScreen getLoginScreen() {
        return new LoginScreen();
    }

    public LoginScreen enterPhoneNumber(String phoneNumber) {
        sendTextToElement(phoneEditBoxLocator, phoneNumber);
        return this;
    }

    public LoginScreen enterPassword(String password) {
        sendTextToElement(passwordEditBoxLocator, password);
        return this;
    }

    public void clickOnLogin() {
        clickOnElement(loginButtonLocator);
    }
}
