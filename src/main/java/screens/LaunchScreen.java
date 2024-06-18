package screens;

import org.openqa.selenium.By;

import static utils.SharedSteps.clickOnElement;

public class LaunchScreen {

    private final By allowNotificationButtonLocator = By.id("com.android.permissioncontroller:id/permission_allow_button");
    private final By postAdButtonLocator = By.id("com.forsale.forsale:id/navgraph_postad");

    //Prevent instance
    private LaunchScreen() {
    }

    public static LaunchScreen getLaunchScreen() {
        return new LaunchScreen();
    }

    public LaunchScreen allowNotification(){
        clickOnElement(allowNotificationButtonLocator);
        return this;
    }
    public void clickOnPostAd(){
        clickOnElement(postAdButtonLocator);
    }
}
