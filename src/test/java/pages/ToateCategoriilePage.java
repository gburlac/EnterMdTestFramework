package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.Driver;
import static junit.framework.Assert.assertTrue;

public class ToateCategoriilePage extends Page {

    Actions actions = new Actions(Driver.getDriver());

    @FindBy(xpath = "//*[@id=\"megamenubutton\"]/button[2]")
    private WebElement butonToateCategoriile;
    @FindBy(xpath = "//*[@id=\"megamenubutton\"]/div/div/div/div[1]/ul/li[3]/a")
    private WebElement pcPeriferice;
    @FindBy(xpath = "//*[@id=\"megamenubutton\"]/div/div/div/div[2]/div/div[3]/div[4]/ul/li/ul/li[1]/a")
    private WebElement buttonTastaturi;
    @FindBy(xpath = "//input[@id='elm_checkbox_376_239_61352']")
    private WebElement selectOptionTastaturi;
    @FindBy(xpath = "//*[@id=\"elm_checkbox_376_256_65292\"]")
    private WebElement selectOptionTastaturi2;
    @FindBy(xpath = "//button[@id='button_cart_98934']")
    private WebElement selectAndAddToCart;
    @FindBy(xpath = "//a[contains(@class, 'ty-btn ty-btn__primary')]")
    private WebElement buttonVizualizatiCosul;
    @FindBy(xpath = "//*[@id=\"sw_dropdown_3262_cart\"]/a/span/svg/path[1]")
    private WebElement clickOnCart;
    @FindBy(xpath = "//*[@id='det_img_2716447294']")
    private WebElement checkIsInCart;


    public void assertCheckIsInCart() {
        assertTrue(checkIsInCart.isDisplayed());
    }

    public void clickOnCart() {
        clickOnCart.click();
    }

    public void clickbuttonVizualizatiCosul() {
        buttonVizualizatiCosul.click();
    }

    public void clickAddToCart() {
        selectAndAddToCart.click();
    }

    public void selectOptionTastaturi2() {
        selectOptionTastaturi2.click();
    }

    public void selectOptionTastaturi() {
        actions.moveToElement(selectOptionTastaturi).build().perform();
        selectOptionTastaturi.click();
    }

    public void clickbuttonTastaturi() {
        buttonTastaturi.click();
    }

    public void clickpcPeriferice() {
        pcPeriferice.click();
    }

    public void clickButonToateCategoriile() {
        butonToateCategoriile.click();
    }
}
