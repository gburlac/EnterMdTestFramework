package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CastiPage extends Page {

    @FindBy(xpath = "//div[contains(@class,'span16 uk-margin-bottom')]//div[4]//div[1]//div[1]//a[1]//picture[1]//img[1]")
    private WebElement butonCasti;
    @FindBy(xpath = "//button[@id='button_cart_95028']")
    private WebElement butonAddtocartProduct;
    @FindBy(xpath = "//div[@id='cart_status_3262_cart']")
    private WebElement butonCartStatus;
    @FindBy(xpath = "//a[@class='ty-btn ty-btn__secondary xh-highlight']")
    private WebElement butonCartStatusSecondary;
    @FindBy(xpath = "//a[contains(@class, 'ty-btn ty-btn__primary')]")
    private WebElement butonCartStatusPopUp;
    @FindBy(xpath = "//button[@name='dispatch[checkout.customer_info]']")
    private WebElement butonCartProcessFaraInregistrare;


    public void clickButonCartProcessFaraInregistrare() {

        butonCartProcessFaraInregistrare.click();
    }

    public void clickButonCartStatusPopUp() {

        butonCartStatusPopUp.click();
    }

    public void clickButonCartStatusSecondary() {

        butonCartStatusSecondary.click();
    }

    public void clickButonCartStatus() {
        butonCartStatus.click();

    }

    public void clickButonAddtocartProduct() {
        butonAddtocartProduct.click();
    }

    public void clickButonCasti() {
        butonCasti.click();
    }
}
