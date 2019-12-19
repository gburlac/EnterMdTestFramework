package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Driver;

import java.util.List;
import java.util.Random;

import static junit.framework.Assert.assertTrue;

public class Smartphones extends Page {
    @FindBy(xpath = "//ul[@id='ranges_376_239']")
    WebElement assertSmartphonesCategory;
    @FindBy(xpath = "//h1[@id='product_filters_page_title' and contains(text(),'Telefoane Samsung')]")
    WebElement assertSamsungPhones;
    @FindBy(xpath = "//ul//li[contains(@class,'ty-product-filters__item-more')]//ul//li//label")
    List<WebElement> filterCheckbox;
    @FindBy(xpath = "//form[contains(@name,'product_form')]//div[@class='ty-grid-list__item-name product-title']//span")
    List<WebElement> productnameLabel;
    String selectedCategory;
    public void showSmartphonesAssert() throws Exception {
        try {
            Assert.assertTrue(assertSmartphonesCategory.isDisplayed());
            System.out.println(">>>>> Smartphones category is opened! <<<<<");
        } catch (Exception e) {
            System.out.println("Exception catched: " + e.getMessage());
            throw new Exception(">>>>> Smartphones category is NOT opened! <<<<<");
        }
    }

    public void showSamsungAssert() throws Exception {
        try {
            Assert.assertTrue(assertSamsungPhones.isDisplayed());
            System.out.println(">>>>> Samsung phones are displayed! <<<<<");
        } catch (Exception e) {
            System.out.println("Exception catched: " + e.getMessage());
            throw new Exception(">>>>> Samsung phones are NOT displayed! <<<<<");
        }

    }

    public void checkFilterCheckbox(int i) {
        selectedCategory = filterCheckbox.get(i).getText();
        filterCheckbox.get(i).click();
    }

    public void filterAssert() {
        String value;
        for (WebElement webElement : productnameLabel) {
            value = webElement.getText();
            assertTrue(value.contains(selectedCategory));
        }
    }

}
