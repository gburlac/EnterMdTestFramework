package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.DrawBorder;
import util.Driver;
import util.TakeScreens;

public class MainPageAsLogged extends Page {

    WebDriver driver = Driver.getDriver();
    DrawBorder dB;

    @FindBy(id = "megamenubutton")
    WebElement allCategories;
    @FindBy(xpath = "//li[contains(@class,'first-level blue')]//a[contains(text(),'Telefoane')]")
    WebElement telefoaneCategoriesList;
    @FindBy(xpath = "//a[contains(text(),'Smartphone-uri')]")
    WebElement smartphonesCategory;
    @FindBy(xpath = "//a[contains(@class,'cm-ajax cm-ajax-full-render cm-history')][contains(text(),'Samsung')]")
    WebElement samsungCategory;
    @FindBy(xpath = "//img[@id='det_img_95196']")
    WebElement phoneDetails;


    public void openAllCategories(){
        dB.drawBorder(allCategories, driver);
        TakeScreens.takeScreenshot(driver, "go_to_all_categories");
        allCategories.click();
    }

    public void openAllTelefoaneCategories(){
        dB.drawBorder(telefoaneCategoriesList, driver);
        TakeScreens.takeScreenshot(driver, "telefoane_categories");
        telefoaneCategoriesList.click();
    }

    public void openPhoneDetails(){
        dB.drawBorder(phoneDetails, driver);
        TakeScreens.takeScreenshot(driver, "go_to_phone_details");
        phoneDetails.click();

    }

    public void goToSmartphones(){
        Actions actions = new Actions(Driver.getDriver());
        dB.drawBorder(smartphonesCategory, driver);
        TakeScreens.takeScreenshot(driver, "go_to_smartphones");
        actions.moveToElement(smartphonesCategory).build().perform();
        smartphonesCategory.click();
    }

    public void goToSamsungPhones(){
        dB.drawBorder(samsungCategory, driver);
        TakeScreens.takeScreenshot(driver,"go_to_samsung");
        samsungCategory.click();
    }

    public void assertAllCategories() throws Exception {
        try {
            telefoaneCategoriesList.isDisplayed();
            System.out.println(">>>>> List of all categories is displayed! <<<<<");
        } catch (Exception e){
            throw new Exception(">>>>> List of all categories is NOT displayed! <<<<<");
        }
    }

    public void assertAllTelefoaneCategories() throws Exception {
        try {
            smartphonesCategory.isDisplayed();
            System.out.println(">>>>> List of all categories is displayed! <<<<<");
        } catch (Exception e){
            throw new Exception(">>>>> List of all categories is NOT displayed! <<<<<");
        }
    }

    public void assertPhoneDetails() throws Exception {
        try {
            smartphonesCategory.isDisplayed();
            System.out.println(">>>>> List of all categories is displayed! <<<<<");
        } catch (Exception e){
            throw new Exception(">>>>> List of all categories is NOT displayed! <<<<<");
        }
    }

}
