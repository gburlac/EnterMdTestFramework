package pages;

import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import util.DrawBorder;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class ProductPage extends Page {

    WebDriver driver = Driver.getDriver();
    DrawBorder dB;
    MainPageAsLogged mainPageAsLogged = new MainPageAsLogged();
    Actions actions = new Actions(Driver.getDriver());
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

    @FindBy(xpath = "//a[contains(@class,'ty-btn cm-dialog-opener cm-dialog-auto-size uk-button uk-border-rounded uk-button-primary tm-add-review')]")
    WebElement writeReviewButton;

    @FindBy(xpath = "//*[@id=\"dsc_name_95196\"]")
    WebElement reviewNameTextbox;

    @FindBy(xpath = "//*[@id=\"dsc_email_95196\"]")
    WebElement reviewEmailTextbox;

    @FindBy(xpath = "//*[@id=\"dsc_message_95196\"]")
    WebElement reviewMessageTextbox;

    @FindBy(xpath = "//*[@id=\"rating_95196\"]/label[1]")
    WebElement reviewFiveStarsButton;

    @FindBy(xpath = "//*[@id=\"add_post_form_95196\"]/div[2]/button")
    WebElement reviewSendButton;

    @FindBy(xpath = "//*[@id=\"tygh_container\"]/div[3]/div")
    WebElement reviewSentNotification;

    @FindBy(xpath = "//*[@id=\"pagination_contents\"]/div[2]/div/div[1]/div[2]/div[1]/select")
    WebElement sortingByDropdown;

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

    public void writeReviewButtonClick() {
        writeReviewButton.click();
        Waiter.waitByXPath("//*[@id=\"supportNewMessageTyping\"]");
    }
    public void reviewFormCheck(){
        Assert.assertTrue(reviewNameTextbox.isDisplayed());
        Assert.assertTrue(reviewEmailTextbox.isDisplayed());
        Assert.assertTrue(reviewFiveStarsButton.isDisplayed());
        Assert.assertTrue(reviewMessageTextbox.isDisplayed());
    }
    public void reviewFormComplete() {
        reviewNameTextbox.sendKeys("Dima");
        reviewEmailTextbox.sendKeys("dmitryy.1994@gmail.com");
        reviewMessageTextbox.sendKeys("Horoshii telefon, zaryad derjit, ne tormozit, ja dovolen");
        reviewFiveStarsButton.click();
        reviewSendButton.click();
        Waiter.waitByXPathUntilDissapear("/html/body/div[5]/div[2]/div/form/div[2]/button");
    }
    public void reviewSentNotificationCheck(){
        Assert.assertTrue(reviewSentNotification.isDisplayed());
    }

    public void sortingByNameAscendingOrder(){
        Select sortingByDropdownNameAscendingOrder = new Select(sortingByDropdown);
        sortingByDropdownNameAscendingOrder.selectByVisibleText("Preț (mic > mare)");
    }

}
