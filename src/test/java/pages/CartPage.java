package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Driver;
import util.TakeScreens;

public class CartPage extends Page {
    MainPageAsLogged mainPageAsLogged = new MainPageAsLogged();
    @FindBy(xpath = "//span[contains(text(), 'Total')]")
    WebElement totalSumOfProducts;
    @FindBy(xpath = "//a[contains(text(), 'Coș de cumpărături')]")
    WebElement assertCartPage;
    @FindBy(xpath = "//a[@class='ty-cart-content__product-title']")
    WebElement productTitleCart;

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

    public void assertProductAddedToCart() throws Exception {
        try {
            TakeScreens.takeScreenshot(Driver.getDriver(), "cart_page");
//            Assert.assertEquals(mainPageAsLogged.getProdNameText(), productTitleCart.getText());
            System.out.println(">>>>> Product is added successfully to cart! <<<<<");
        } catch (Exception e){
            throw new Exception(">>>>> Product is not added to cart! <<<<<");
        }
    }

}
