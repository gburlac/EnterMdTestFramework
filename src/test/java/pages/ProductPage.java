package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.DrawBorder;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class ProductPage extends Page {

    WebDriver driver = Driver.getDriver();
    DrawBorder dB;
    MainPageAsLogged mainPageAsLogged = new MainPageAsLogged();

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
//    @FindBy(xpath = "//h1[contains(text(),'Produs adaugat in cos')]")
//    WebElement productAddedPopup;

    public void assertProductDetails() throws Exception {
        try {
            Assert.assertTrue(specificatiiTehnice.isDisplayed());
            System.out.println(">>>>> Product details page is opened! <<<<<");
        } catch (Exception e) {
            System.out.println("Exception catched: " + e.getMessage());
            throw new Exception(">>>>> Product details page is opened! <<<<<");
        }
    }

    public void addProductToCart() {
//        dB.drawBorder(addToCartButton, driver);
        Waiter.waitByXPath("//bdi");
//        mainPageAsLogged.getProdNameText();
        TakeScreens.takeScreenshot(driver, "add_to_cart_button");
        addToCartButton.click();
        Waiter.waitByXPath("//h1[contains(text(),'Produs adaugat in cos')]");
        TakeScreens.takeScreenshot(driver, "product_added_to_cart_confirm");
        Waiter.waitByXPathUntilDissapear("//h1[contains(text(),'Produs adaugat in cos')]");
    }

    public void clickOnCartIcon() {
//        dB.drawBorder(cartIcon, driver);
//        if (productAddedPopup.isDisplayed()){
//            Waiter.waitByXpathUntilDissapear("//h1[contains(text(),'Produs adaugat in cos')]");
//        }
        TakeScreens.takeScreenshot(driver, "cart_icon");
        cartIcon.click();
    }

    public void goToCart() throws Exception {
        if (goToCart.isDisplayed()) {
//            dB.drawBorder(goToCart, driver);
            TakeScreens.takeScreenshot(driver, "go_to_cart");
            try {
                if (!cartPopup.getText().equals("Coșul este gol")) {
                    goToCart.click();
                }
            } catch (Exception ex) {
                System.out.println("Exception: " + ex.getMessage());
                throw new Exception(">>>>> Your cart is empty! <<<<<");
            }
        } else {
            throw new Exception(">>>>> Some problems occur with displaying cart popup! <<<<<");
        }
    }
}
