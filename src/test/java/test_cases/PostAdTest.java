package test_cases;

import base.Base;
import org.testng.annotations.Test;
import screens.LaunchScreen;
import screens.LoginScreen;
import screens.PostAdScreen;

import static data_driven.ForSaleTestData.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static screens.LaunchScreen.getLaunchScreen;
import static screens.LoginScreen.getLoginScreen;
import static screens.PostAdScreen.getPostAdScreen;

public class PostAdTest extends Base {


    LaunchScreen launchScreen = getLaunchScreen();
    LoginScreen loginScreen = getLoginScreen();
    PostAdScreen postAdScreen = getPostAdScreen();

    @Test(priority = 1)
    public void validateThatErrorMessageIsDisplayed() {
        launchScreen.allowNotification()
                .clickOnPostAd();
        loginScreen.enterPhoneNumber(getPhoneNumber())
                .enterPassword(getPassword())
                .clickOnLogin();
        boolean actualResult = postAdScreen.clickOnChooseCategory()
                .selectAutomotiveCategory()
                .selectCarsSection()
                .selectMercedesSClassCar()
                .clickOnNextButton()
                .isToolBarDisplayed();
        assertTrue(actualResult, "Validation Message didn't displayed !");
    }

    @Test(priority = 1)
    public void ValidateThatUserIsNavigatedToNextScreen() {
        launchScreen.allowNotification()
                .clickOnPostAd();
        loginScreen.enterPhoneNumber(getPhoneNumber())
                .enterPassword(getPassword())
                .clickOnLogin();
        String actualResult = postAdScreen.clickOnChooseCategory()
                .selectAutomotiveCategory()
                .selectCarsSection()
                .selectMercedesSClassCar()
                .clickOnChooseYourServiceLocation()
                .selectKuwaitCityDistrict()
                .selectMirqabArea()
                .selectBlock1()
                .enterTitle(getTitle())
                .enterPrice(getPrice())
                .getAddMediaScreenTextViewValue();
        assertEquals(actualResult, "Add Media", "Can't Navigate to Add Media Screen");
    }
}
