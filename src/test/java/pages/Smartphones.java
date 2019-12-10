package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Smartphones extends Page {
    @FindBy(xpath = "//ul[@id='ranges_376_239']")
    WebElement assertSmartphonesCategory;
    @FindBy(xpath = "//h1[@id='product_filters_page_title' and contains(text(),'Telefoane Samsung')]")
    WebElement assertSamsungPhones;


    public void showSmartphonesAssert() throws Exception {
        try {
            Assert.assertTrue(assertSmartphonesCategory.isDisplayed());
            System.out.println(">>>>> Smartphones category is opened! <<<<<");
        } catch (Exception e){
            System.out.println("Exception catched: " + e.getMessage());
            throw new Exception(">>>>> Smartphones category is NOT opened! <<<<<");
        }
    }

    public void showSamsungAssert() throws Exception {
        try {
            Assert.assertTrue(assertSamsungPhones.isDisplayed());
            System.out.println(">>>>> Samsung phones are displayed! <<<<<");
        } catch (Exception e){
            System.out.println("Exception catched: " + e.getMessage());
            throw new Exception(">>>>> Samsung phones are NOT displayed! <<<<<");
        }
    }
}
