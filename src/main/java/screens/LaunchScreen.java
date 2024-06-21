package screens;

import org.openqa.selenium.By;

import static utils.SharedSteps.clickOnElement;

public class LaunchScreen {

    private final By allowNotificationButtonLocator = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
    private final By postAdButtonLocator = By.xpath("//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/navigation_bar_item_small_label_view\" and @text=\"Post an Ad\"]");

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
