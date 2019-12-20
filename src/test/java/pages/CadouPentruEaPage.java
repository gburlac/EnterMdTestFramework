package pages;

import context.ScenarioContext;
import enums.Context;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.Driver;

import java.util.List;

public class CadouPentruEaPage extends Page {
    Page page = new Page();
    Actions actions = new Actions(Driver.getDriver());

    @FindBy(xpath = "//ul[@id='text_links_2948']/li[contains(@class, 'ty-text-links__item ty-level-0')][6]")
    private WebElement cadouPentruEaLink;
    @FindBy(xpath = "//div[contains(@data-title, 'Pune în coș')]//button[contains(@type, 'submit')]")
    private WebElement buttonAddToCart;
    //button[@id='button_cart_95196']
    //a[contains(@class, 'ty-btn ty-btn__primary')]
    @FindBy(xpath = " //a[contains(@class, 'ty-btn ty-btn__primary')]")
    private WebElement buttonGoToCart;
    @FindBy(xpath = "//img[@id='det_img_1232188157']")
    private WebElement inCartItem;
    @FindBy(xpath = "//button[@id='button_cart_95196']")
    private WebElement productFromCadouPentruEa;
    @FindBy(xpath = "//form[contains(@name,'product_form')]//button[contains(@id, 'button_cart')]")
    List<WebElement> addToCartFromCategoryButton;
    @FindBy(xpath = "//form[contains(@name,'product_form')]")
    List<WebElement> productNameFromCategory;
    //a[@class='ty-cart-content__product-title']
    @FindBy(xpath = "//a[@class='ty-cart-content__product-title']")
    WebElement productNameInCart;
    @FindBy(xpath = "//bdi[contains(text(),'Xiaomi Redmi Note 7')]")
    WebElement productNameInProductPage;
    @FindBy(xpath = "//form[@name='product_form_95196']//span[contains(text(),'Xiaomi Redmi Note 7')]")
    WebElement selectProductName;
    @FindBy(xpath = "//button[@id='button_cart_95196']")
    WebElement buttonAddToCartFromProd;


    public void assertInCartItem() {
        String productName = (String) ScenarioContext.getContex(Context.PRODUCT_NAME);
        Assert.assertEquals(productName, productNameInCart.getText());
//        assertTrue(inCartItem.isDisplayed());
    }


    public void clickProductNameFromCategory(int product) {
        productNameFromCategory.get(product).click();
    }

    public void clickButtonAddToCartFromProd() {
        buttonAddToCartFromProd.click();
    }

    public void clickSelectProductName() {
        selectProductName.click();
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

    public String getProductName() {
        return productNameInProductPage.getText();
    }


}
