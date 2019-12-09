package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Smartphones extends Page {
    @FindBy(xpath = "//ul[@id='ranges_376_239']")
    WebElement assertSmartphonesCategory;

    public void showSmartphonesAssert() throws Exception {
        try {
            Assert.assertTrue(assertSmartphonesCategory.isDisplayed());
            System.out.println(">>>>> Smartphones category is opened! <<<<<");
        } catch (Exception e){
            System.out.println("Exception catched: " + e.getMessage());
            throw new Exception(">>>>> Smartphones category is NOT opened! <<<<<");
        }
    }
}
