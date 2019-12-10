package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.*;

import static junit.framework.Assert.assertTrue;

public class CadouPentruEa extends Page {


    @FindBy(xpath = "//ul[@id='text_links_2948']/li[contains(@class, 'ty-text-links__item ty-level-0')][6]")
    private WebElement cadouPentruEaLink;
    //*[@id="pages"]/div[3]/div/div[4]/div/div/div[2]/div/div/div/div[4]/div/div/form/div/a/div[1]/img
    @FindBy(xpath = "//*[@id=\"pages\"]/div[3]/div/div[4]/div/div/div[2]/div/div/div/div[4]/div/div/form/div/a/div[2]")
    private WebElement productBobyCompact;
    @FindBy(xpath = "//*[@id=\"products\"]/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/a/span")
    private WebElement changeColorToBlueDark;
    @FindBy(xpath = "//*[@id=\"button_cart_74766\"]")
    private WebElement buttonAddToCart;
    @FindBy(xpath = "//a[contains(@class, 'ty-btn ty-btn__primary')]")
    private WebElement buttonGoToCart;
    @FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[2]/a")
    private WebElement inCartItem;

    private Actions actions = new Actions(Driver.getDriver());

    public void assertInCartItem() {
        assertTrue(inCartItem.isDisplayed());
    }

    public void clickButtonGoToCart() {
        buttonGoToCart.click();
    }

    public void clickButtonAddToCart() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(buttonAddToCart).build().perform();
        buttonAddToCart.click();
    }

    public void clickChangeColorToBlueDark() {
        changeColorToBlueDark.click();
    }

    public void clickProductBobyCompact() {
        productBobyCompact.click();
    }

    public void clickCadouPentruEaLink() {
        actions.moveToElement(cadouPentruEaLink).build().perform();
        cadouPentruEaLink.click();
    }

}
