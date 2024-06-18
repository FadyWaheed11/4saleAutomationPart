package screens;

import org.openqa.selenium.By;

import static utils.SharedSteps.*;

public class PostAdScreen {

    private final By categoryFieldLocator = By.id("com.forsale.forsale:id/chooseCategoryField");
    private final By automotiveCategoryLocator = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.forsale.forsale:id/rvCategorySelection\"]/android.view.ViewGroup[1]");
    private final By carsFieldLocator = By.xpath("//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/tvCategoryName\" and @text=\"Cars\"]");
    private final By mercedesCarFieldLocator = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.forsale.forsale:id/rvCategorySelection\"]/android.view.ViewGroup[8]");
    private final By mercedesSClassTypeLocator = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.forsale.forsale:id/rvCategorySelection\"]/android.view.ViewGroup[9]");
    private final By nextButtonLocator = By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.forsale.forsale:id/compose_view\"]/android.view.View/android.view.View/android.widget.Button");
    private final By districtFieldLocator = By.id("com.forsale.forsale:id/chooseDistrictField");
    private final By locationSelectorLocator = By.id("com.forsale.forsale:id/locationSelectorText");
    private final By kuwaitCityLocator = By.xpath("//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/txtSelector\" and @text=\"Kuwait City\"]");
    private final By doneButtonLocator = By.id("com.forsale.forsale:id/btnProceed");
    private final By areaSelectorLocator = By.xpath("//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/locationSelectorText\" and @text=\"Choose Area\"]");
    private final By mirqabAreaLocator = By.xpath("//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/txtSelector\" and @text=\"Mirqab\"]");
    private final By blockSelectorLocator = By.xpath("//android.widget.TextView[@resource-id=\"com.forsale.forsale:id/locationSelectorText\" and @text=\"Choose Block\"]");
    private final By block1FieldLocator = By.xpath("//android.widget.GridView[@resource-id=\"com.forsale.forsale:id/rvSelection\"]/android.view.ViewGroup[1]");
    private final By finalDoneButtonLocator = By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.forsale.forsale:id/compose_view\"]/android.view.View/android.view.View/android.widget.Button");
    private final By titleFieldLocator = By.id("com.forsale.forsale:id/adTitleField");
    private final By priceFieldLocator = By.id("com.forsale.forsale:id/adPriceField");
    private final By toolBarErrorMessage = By.id("com.forsale.forsale:id/toolbar");
    private final By textViewAddMediaScreenLocator = By.xpath("//android.widget.TextView[@text=\"Add Media\"]");

    //Prevent instance
    private PostAdScreen() {

    }

    public static PostAdScreen getPostAdScreen() {
        return new PostAdScreen();
    }

    public PostAdScreen clickOnChooseCategory() {
        clickOnElement(categoryFieldLocator);
        return this;
    }

    public PostAdScreen selectAutomotiveCategory() {
        clickOnElement(automotiveCategoryLocator);
        return this;
    }

    public PostAdScreen selectCarsSection() {
        clickOnElement(carsFieldLocator);
        return this;
    }

    public PostAdScreen selectMercedesSClassCar() {
        clickOnElement(mercedesCarFieldLocator);
        clickOnElement(mercedesSClassTypeLocator);
        return this;
    }

    public PostAdScreen clickOnNextButton() {
        clickOnElement(nextButtonLocator);
        return this;
    }

    public PostAdScreen clickOnChooseYourServiceLocation() {
        clickOnElement(districtFieldLocator);
        return this;
    }

    public PostAdScreen selectKuwaitCityDistrict() {
        clickOnElement(locationSelectorLocator);
        clickOnElement(kuwaitCityLocator);
        clickOnElement(doneButtonLocator);
        return this;
    }

    public PostAdScreen selectMirqabArea() {
        clickOnElement(areaSelectorLocator);
        clickOnElement(mirqabAreaLocator);
        clickOnElement(doneButtonLocator);
        return this;
    }

    public PostAdScreen selectBlock1() {
        clickOnElement(blockSelectorLocator);
        clickOnElement(block1FieldLocator);
        clickOnElement(doneButtonLocator);
        clickOnElement(finalDoneButtonLocator);
        return this;
    }

    public PostAdScreen enterTitle(String title) {
        sendTextToElement(titleFieldLocator, title);
        return this;
    }

    public PostAdScreen enterPrice(String price) {
        sendTextToElement(priceFieldLocator, price);
        clickOnNextButton();
        return this;
    }

    public boolean isToolBarDisplayed() {
        return isDisplayed(toolBarErrorMessage);
    }

    public String getAddMediaScreenTextViewValue() {
        return getTextOfElement(textViewAddMediaScreenLocator);
    }

}
