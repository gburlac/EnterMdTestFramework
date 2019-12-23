package pages;

import context.ScenarioContext;
import enums.Context;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

import java.util.List;

public class CartPage extends Page {
    @FindBy(xpath = "//span[contains(text(), 'Total')]")
    private WebElement totalSumOfProducts;
    @FindBy(xpath = "//a[contains(text(), 'Coș de cumpărături')]")
    private WebElement assertCartPage;
    @FindBy(xpath = "//a[@class='ty-cart-content__product-title']")
    private WebElement productTitleCart;
    @FindBy(xpath = "//a[contains(@class,'ty-cart-content__product-title')][contains(text(),'Hisense H40B5600 40')]")
    private WebElement TVTitleInCart;
    @FindBy(xpath = "//a[contains(@class,'ty-cart-content__product-title')][contains(text(),'Xiaomi Redmi Note 7')]")
    private WebElement phoneTitleInCart;
    @FindBy(xpath = "//a[contains(@class,'ty-cart-content__product-title')][contains(text(),'Windgoo M11')]")
    private WebElement transportTitleInCart;
    @FindBy(xpath = "//div[contains(@id, 'cart_items')]//a[contains(@class, 'product-title')]")
    List<WebElement> productNamesListInCart;
    @FindBy(xpath = "//input[@id='amount_246748269']")
    private WebElement transportQuantity;
    @FindBy(xpath = "//div[@id='quantity_update_246748269']//a[contains(@class,'cm-decrease ty')]")
    private WebElement transportQuantityDecreaser;
    @FindBy(xpath = "//input[@id='amount_2944274987']")
    private WebElement tvQuantity;
    @FindBy(xpath = "//div[@id='quantity_update_2944274987']//a[@class='cm-decrease ty-value-changer__decrease']")
    private WebElement tvQuantityDecreaser;
    @FindBy(xpath = "//div[contains(@class, 'am-cart-item')]//div[contains(@class, 'ty-center')]//input")
    private WebElement phoneQuantity;
    @FindBy(xpath = "//div[@id='quantity_update_2776009334']//a[@class='cm-decrease ty-value-changer__decrease']")
    private WebElement phoneQuantityDecreaser;
    @FindBy(xpath = "//div[contains(@class, 'am-cart-item')]//div[contains(@class, 'ty-center')]//input")
    private WebElement productQuantity;
    @FindBy(xpath = "//div[contains(@class, 'ty-value-changer')]//a[contains(@class, 'cm-decrease')]")
    private WebElement productQuantityDecreaser;

    Logger log = Logger.getLogger(CartPage.class);

    public void assertProductAddedToCart(String productName) throws Exception {
        try {
            TakeScreens.takeScreenshot(Driver.getDriver(), "cart_page");
            Assert.assertEquals(productName, productTitleCart.getText());
            log.info(">>>>> Selected product is added successfully to cart! <<<<<");
        } catch (Exception e) {
            throw new Exception(">>>>> Selected product is not added to cart! <<<<<");
        }
    }

    public void assertProductDeletedFromCart(String productName) throws Exception {
        try {
            TakeScreens.takeScreenshot(Driver.getDriver(), "cart_page");
            Assert.assertNotEquals(productName, productTitleCart.getText());
            log.info(">>>>> Selected product is deleted successfully to cart! <<<<<");
        } catch (Exception e) {
            throw new Exception(">>>>> Selected product is not deleted to cart! <<<<<");
        }
    }

    public void deleteProductFromCart() {
        while (!productQuantity.getText().equals("0")) {
            productQuantityDecreaser.click();
            waitSpinner();
        }
    }

    public void deletePhoneFromCart() {
        while (!phoneQuantity.getText().equals("0")) {
            phoneQuantityDecreaser.click();
            waitSpinner();
            break;
        }
    }

    public void deleteTVFromCart() {
        while (!tvQuantity.getText().equals("0")) {
            tvQuantityDecreaser.click();
            waitSpinner();
        }
    }

    public void deleteTransportFromCart() {
        while (!transportQuantity.getText().equals("0")) {
            transportQuantityDecreaser.click();
            waitSpinner();
        }
    }

    public void waitSpinner() {
        Waiter.waitByXPath("//div[@id='ajax_loading_box'][contains(@style,'block')]");
        Waiter.waitByXPathUntilDissapear("//div[@id='ajax_loading_box'][contains(@style,'block')]");
    }

    ScenarioContext scenarioContext = new ScenarioContext();

    public void assertProductName() {
        List<WebElement> productList = productNamesListInCart.subList(0, productNamesListInCart.size());
        Assert.assertTrue(productList.contains(ScenarioContext.getContext(Context.PRODUCT_NAME)));
    }
}
