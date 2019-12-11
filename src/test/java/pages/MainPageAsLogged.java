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
    Actions actions = new Actions(Driver.getDriver());

    @FindBy(id = "megamenubutton")
    WebElement allCategories;
    @FindBy(xpath = "//li[contains(@class,'first-level blue')]//a[contains(text(),'Telefoane')]")
    WebElement telefoaneCategoriesList;
    @FindBy(xpath = "//a[contains(text(),'Smartphone-uri')]")
    WebElement smartphonesCategory;
    @FindBy(xpath = "//a[contains(@class,'cm-ajax cm-ajax-full-render cm-history')][contains(text(),'Samsung')]")
    WebElement samsungCategory;
//    @FindBy(xpath = "//img[@id='det_img_95196']")
    @FindBy(xpath = "//form[@name='product_form_95196']//a[@class='pm-product']")
    public WebElement phoneDetails;
    @FindBy(xpath = "//bdi")
    WebElement productDetailsNameOfProduct;
    @FindBy(xpath = "//div[contains(@class, 'auth uk-grid')]")
    WebElement userMenu;
    @FindBy(xpath = "//div[@class='uk-width-auto@m']//li[6]//a[1]")
    WebElement logoutOption;

    public void openAllCategories(){
//        dB.drawBorder(allCategories, driver);
        TakeScreens.takeScreenshot(driver, "go_to_all_categories");
        allCategories.click();
    }

    public void openAllTelefoaneCategories(){
//        dB.drawBorder(telefoaneCategoriesList, driver);
        TakeScreens.takeScreenshot(driver, "telefoane_categories");
        telefoaneCategoriesList.click();
    }

    public void openPhoneDetails(){
//        dB.drawBorder(phoneDetails, driver);
        TakeScreens.takeScreenshot(driver, "go_to_phone_details");
        phoneDetails.click();
    }

    private String prodName = null;

    public String getProdNameText(){
        if (prodName==null) {
            prodName = productDetailsNameOfProduct.getText();
            return prodName;
        } else {
            return prodName ;
        }
    }

    public void goToSmartphones(){
//        dB.drawBorder(smartphonesCategory, driver);
        TakeScreens.takeScreenshot(driver, "go_to_smartphones");
        actions.moveToElement(smartphonesCategory).build().perform();
        smartphonesCategory.click();
    }

    public void goToSamsungPhones(){
//        dB.drawBorder(samsungCategory, driver);
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

    public void logout() throws Exception {
        actions.moveToElement(userMenu).moveToElement(logoutOption).click().build().perform();
    }

    public void assertUserIsLoggedOut() throws Exception {
        try {
            if (userMenu.getText().equals("intră în cont"))
            System.out.println(">>>>> SUCCESS! User is logged out! <<<<<");
        } catch (Exception e){
            throw new Exception(">>>>> ERROR! User is not logged out! <<<<<");
        }
    }

}
