package data_driven;

import org.json.simple.JSONObject;

import static settings.ForSaleSettings.getTestDataPath;
import static utils.Helper.readJsonFile;

public final class ForSaleTestData {
    private static final JSONObject testData = readJsonFile(getTestDataPath());

    public static String getPhoneNumber() {
        return String.valueOf(testData.get("phoneNumber"));
    }

    public static String getPassword() {
        return String.valueOf(testData.get("password"));
    }
    public static String getTitle(){
        return String.valueOf(testData.get("title"));
    }
    public static String getPrice(){
        return String.valueOf(testData.get("price"));
    }
}
