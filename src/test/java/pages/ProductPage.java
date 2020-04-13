package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class ProductPage extends Page {

    Logger log = Logger.getLogger(ProductPage.class);
    WebDriver driver = Driver.getDriver();

    @FindBy(xpath = "//h3[@id='features' and contains(text(),'tehnice')]")
     WebElement specificatiiTehnice;
    @FindBy(xpath = "//div[contains(@data-title, 'Pune în coș')]//button[contains(@type, 'submit')]")
     WebElement addToCartButton;
    @FindBy(xpath = "//div[contains(@id, 'sw_dropdown_3262_cart')]")
     WebElement cartIcon;
    @FindBy(xpath = "//a[contains(text(), 'Vizualizați coșul')]")
     WebElement goToCart;
    @FindBy(xpath = "//div[@class='ty-cart-items']")
     WebElement cartPopup;
    @FindBy(xpath = "//h1[@id='product_filters_page_title' and contains(text(),'Telefoane Samsung')]")
     WebElement assertSamsungPhones;
    @FindBy(xpath = "//ul[@id='ranges_376_239']")
     WebElement assertSmartphonesCategory;

    @FindBy(xpath = "//bdi")
     WebElement productName;

    public void assertProductDetails() throws Exception {
        try {
            Assert.assertTrue(specificatiiTehnice.isDisplayed());
            log.info(">>>>> Product details page is opened! <<<<<");
        } catch (Exception e) {
            throw new Exception(">>>>> Product details page is opened! <<<<<");
        }
    }

    public void addProductToCart() {
        Waiter.waitByXPath("//bdi");
        TakeScreens.takeScreenshot(driver, "add_to_cart_button");
        addToCartButton.click();
        Waiter.waitByXPath("//h1[contains(text(),'Produs adaugat in cos')]");
        TakeScreens.takeScreenshot(driver, "product_added_to_cart_confirm");
        Waiter.waitByXPathUntilDissapear("//h1[contains(text(),'Produs adaugat in cos')]");
        log.info("Product is added to cart!");
    }

    public void clickOnCartIcon() {
        TakeScreens.takeScreenshot(driver, "cart_icon");
        cartIcon.click();
        log.info("Cart popup is opened!");
    }

    public void goToCart() throws Exception {
        if (goToCart.isDisplayed()) {
            TakeScreens.takeScreenshot(driver, "go_to_cart");
            try {
                if (!cartPopup.getText().equals("Coșul este gol")) {
                    goToCart.click();
                    log.info("Opening cart page!");
                }
            } catch (Exception ex) {
                throw new Exception(">>>>> Your cart is empty! <<<<<");
            }
        } else {
            throw new Exception(">>>>> Error occur while accessing the cart! <<<<<");
        }
    }

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

    public String getProductName() {
        return productName.getText();
    }
}
