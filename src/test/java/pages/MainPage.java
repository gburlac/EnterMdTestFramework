package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.Assert.assertTrue;

public class MainPage extends Page {

    //find elements

    @FindBy(xpath = "//*[@id=\"iam_search\"]")
    private WebElement searchBar;
    @FindBy(xpath = "//div[contains(text(),'OnePlus 7 Pro')]")
    private WebElement selectOnePlus;
    @FindBy(xpath = "//li[2]//a[1]//div[1]//div[2]//div[1]")
    private WebElement selectIphone;
    //button[@id='button_wishlist_9854998549']
    //button[@id='button_wishlist_102069102069']
    @FindBy(xpath = "//button[@id='button_wishlist_9854998549']")
    private WebElement buttonAddToWishlist;
    @FindBy(xpath = "//button[@id='button_wishlist_102069102069']")
    private WebElement buttonAddToWishlistIphone;
    //div[@id='pm_wish_list_3262']/a/span
    //div[contains(@class, 'ty-float-right')]/a[contains(@class, 'ty-btn ty-btn__secondary')]
    @FindBy(xpath = "//div[contains(@class, 'ty-float-right')]/a[contains(@class, 'ty-btn ty-btn__secondary')]")
    private WebElement buttonCheckWischlist;
    @FindBy(xpath = "//*[@id=\"det_img_98549\"]")
    private WebElement buttonCheckProductInWischlist;
    @FindBy(xpath = "//img[@id='det_img_102069']")
    private WebElement buttonCheckProductInWischlistIphone;
    @FindBy(xpath = " //a[@class='uk-margin-small-top uk-button uk-button-default uk-border-pill ty-tk-product-button']")
    private WebElement buttonBuyInCredit;
    @FindBy(xpath = "//div[@class='tab-credit-submit']//input[2]")
    private WebElement checkCreditPage;


    //methods

    public void assertcheckCreditPage() throws InterruptedException {
        assertTrue(checkCreditPage.isDisplayed());
    }

    public void assertbuttonCheckProductInWischlistIphone() throws InterruptedException {
        assertTrue(buttonCheckProductInWischlistIphone.isDisplayed());
    }

    public void assertProductInWischlist() throws InterruptedException {
        assertTrue(buttonCheckProductInWischlist.isDisplayed());
    }

    public void clickButtonBuyInCredit() {
        buttonBuyInCredit.click();
    }

    public void clickbuttonselectIphone() {
        selectIphone.click();
    }

    public void clickButtonAddToWishlistIphone() {
        buttonAddToWishlistIphone.click();
    }

    public void clickbuttonCheckWischlist() {
        buttonCheckWischlist.click();
    }

    public void clickbuttonAddToWishlist() {
        buttonAddToWishlist.click();
    }

    public void clickOnSelectOnePlus() {
        selectOnePlus.click();

    }

    public void searchBarMethod(String value) {
        searchBar.sendKeys(value);
    }


}
