package pages;

import context.ScenarioContext;
import enums.Context;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.Driver;

import java.util.List;

import static junit.framework.Assert.assertTrue;

public class CadouPentruEaPage extends Page {
    Actions actions = new Actions(Driver.getDriver());
    ScenarioContext scenarioContext = new ScenarioContext();

    @FindBy(xpath = "//ul[@id='text_links_2948']/li[contains(@class, 'ty-text-links__item ty-level-0')][6]")
    private WebElement cadouPentruEaLink;
    @FindBy(xpath = "//*[@id=\"button_cart_74766\"]")
    private WebElement buttonAddToCart;
    @FindBy(xpath = "//a[contains(@class, 'ty-btn ty-btn__primary')]")
    private WebElement buttonGoToCart;
    @FindBy(xpath = "//img[@id='det_img_1232188157']")
    private WebElement inCartItem;
    @FindBy(xpath = "//button[@id='button_cart_95196']")
    private WebElement productFromCadouPentruEa;
    @FindBy(xpath = "//form[contains(@name,'product_form')]//button[contains(@id, 'button_cart')]")
    List<WebElement> addToCartFromCategoryButton;
    @FindBy(xpath = "//form[contains(@name,'product_form')]//div[contains(@class, 'product-title')]")
    List<WebElement> productNameFromCategory;
    @FindBy(xpath = "//a[@class='ty-cart-content__product-title']")
    WebElement productNameInCart;


    public void assertInCartItem() {
//        String productName = (String) scenarioContext.getContex(Context.PRODUCT_NAME);
//        Assert.assertEquals(productName, productNameInCart.getText());
        assertTrue(inCartItem.isDisplayed());
    }


    public void clickButtonGoToCart() {
        buttonGoToCart.click();
    }

    public void clickproductFromCadouPentruEa() {
        productFromCadouPentruEa.click();
    }

    public void clickCadouPentruEaLink() {

        actions.moveToElement(cadouPentruEaLink).build().perform();
        cadouPentruEaLink.click();
    }

    public void addToCart(int product) {
        addToCartFromCategoryButton.get(product).click();
    }

    public String getProductName(int product) {
        return productNameFromCategory.get(product).getText();
    }


}
