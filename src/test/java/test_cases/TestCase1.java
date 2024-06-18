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

public class TestCase1 extends Base {


    LaunchScreen launchScreen = getLaunchScreen();
    LoginScreen loginScreen = getLoginScreen();
    PostAdScreen postAdScreen = getPostAdScreen();

    @Test
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

    @Test
    public void test() {
        launchScreen.allowNotification()
                .clickOnPostAd();
        loginScreen.enterPhoneNumber(getPhoneNumber())
                .enterPassword(getPassword())
                .clickOnLogin();
        assertEquals(postAdScreen.clickOnChooseCategory()
                .selectAutomotiveCategory()
                .selectCarsSection()
                .selectMercedesSClassCar()
                .clickOnChooseYourServiceLocation()
                .selectKuwaitCityDistrict()
                .selectMirqabArea()
                .selectBlock1()
                .enterTitle(getTitle())
                .enterPrice(getPrice())
                .getAddMediaScreenTextViewValue(),"Add Media","Can't Navigate to Add Media Screen");
    }
}
