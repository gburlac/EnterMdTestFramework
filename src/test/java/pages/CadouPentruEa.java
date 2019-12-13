package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.*;

import static junit.framework.Assert.assertTrue;

public class CadouPentruEa extends Page {
    Actions actions = new Actions(Driver.getDriver());

    @FindBy(xpath = "//ul[@id='text_links_2948']/li[contains(@class, 'ty-text-links__item ty-level-0')][6]")
    private WebElement cadouPentruEaLink;
    //*[@id="pages"]/div[3]/div/div[4]/div/div/div[2]/div/div/div/div[4]/div/div/form/div/a/div[1]/img
    @FindBy(xpath = "//*[@id=\"pagination_contents\"]/div[4]/div[1]/div/div[2]/form/div/a/div[2]/span")
    private WebElement productBobyCompact;
    @FindBy(xpath = "//*[@id=\"products\"]/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/a/span")
    private WebElement changeColorToBlueDark;
    @FindBy(xpath = "//*[@id=\"button_cart_74766\"]")
    private WebElement buttonAddToCart;
    @FindBy(xpath = "//a[contains(@class, 'ty-btn ty-btn__primary')]")
    private WebElement buttonGoToCart;
    @FindBy(xpath = "//img[@id='det_img_1232188157']")
    private WebElement inCartItem;
    //button[@id='button_cart_95196']
    @FindBy(xpath = "//button[@id='button_cart_95196']")
    private WebElement productFromCadouPentruEa;


    public void assertInCartItem() {
        assertTrue(inCartItem.isDisplayed());
    }

    public void clickButtonGoToCart() {
        buttonGoToCart.click();
    }

    public void clickButtonAddToCart() {
        actions.moveToElement(buttonAddToCart).build().perform();
        buttonAddToCart.click();
    }

    public void clickChangeColorToBlueDark() {
        changeColorToBlueDark.click();
    }

    public void clickproductFromCadouPentruEa() {
        productFromCadouPentruEa.click();
    }

    public void clickCadouPentruEaLink() {

        actions.moveToElement(cadouPentruEaLink).build().perform();
        cadouPentruEaLink.click();
    }

}
