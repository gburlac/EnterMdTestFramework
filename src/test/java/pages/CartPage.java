package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Page {
    @FindBy(xpath = "//span[contains(text(), 'Total')]")
    WebElement totalSumOfProducts;
    @FindBy(xpath = "//a[contains(text(), 'Coș de cumpărături')]")
    WebElement assertCartPage;

    public void assertCartIsNotEmpty() throws Exception {
        if (totalSumOfProducts.isDisplayed()) {
            System.out.println(">>>>> You have products in your cart! <<<<<");
        } else {
            throw new Exception(">>>>> Your cart is empty! <<<<<");
        }
    }

    public void assertCartPageIsDisplayed() throws Exception {
        try {
            assertCartPage.isDisplayed();
            System.out.println(">>>>> Cart page is displayed! <<<<<");
        } catch (Exception e){
            System.out.println("There is following exception: " + e.getMessage());
            throw new Exception(">>>>> Your cart is empty! <<<<<");
        }
    }
}
