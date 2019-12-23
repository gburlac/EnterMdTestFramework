package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.DrawBorder;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class ProductPage extends Page {

    Logger log = Logger.getLogger(ProductPage.class);
    WebDriver driver = Driver.getDriver();

    @FindBy(xpath = "//h3[@id='features' and contains(text(),'tehnice')]")
    private WebElement specificatiiTehnice;
    @FindBy(xpath = "//div[contains(@data-title, 'Pune în coș')]//button[contains(@type, 'submit')]")
    private WebElement addToCartButton;
    @FindBy(xpath = "//div[contains(@id, 'sw_dropdown_3262_cart')]")
    private WebElement cartIcon;
    @FindBy(xpath = "//a[contains(text(), 'Vizualizați coșul')]")
    private WebElement goToCart;
    @FindBy(xpath = "//div[@class='ty-cart-items']")
    private WebElement cartPopup;
    @FindBy(xpath = "//a[contains(@class,'ty-btn cm-dialog-opener cm-dialog-auto-size uk-button uk-border-rounded uk-button-primary tm-add-review')]")
    private WebElement writeReviewButton;
    @FindBy(xpath = "//input[@name='post_data[name]']")
    private WebElement reviewNameTextbox;
    @FindBy(xpath = "//input[@name='post_data[email]']")
    private WebElement reviewEmailTextbox;
    @FindBy(xpath = "//textarea[@name='post_data[message]']")
    private WebElement reviewMessageTextbox;
    @FindBy(xpath = "//label[contains(@class, 'ty-rating__label')][1]")//label[contains(text(),'cut foarte mult')]
    private WebElement reviewFiveStarsButton;
    @FindBy(xpath = "//button[@name='dispatch[discussion.add]']")
    private WebElement reviewSendButton;
    @FindBy(xpath = "//*[@id=\"tygh_container\"]/div[3]/div")
    private WebElement reviewSentNotification;
    @FindBy(xpath = "//h1[@id='product_filters_page_title' and contains(text(),'Telefoane Samsung')]")
    private WebElement assertSamsungPhones;
    @FindBy(xpath = "//ul[@id='ranges_376_239']")
    private WebElement assertSmartphonesCategory;
    @FindBy(xpath = "//a[@class='ty-btn ty-btn__text picon-compare-two   text-button ']")
    private WebElement addToCompareListButton;
    @FindBy(xpath = "//*[@id=\"pagination_contents\"]/div[2]/div/div[1]/div[2]/div[1]/select")
    private WebElement sortingByDropdown;
    @FindBy(xpath = "//bdi")
    private WebElement productName;

    public void assertProductDetails() throws Exception {
        try {
            Assert.assertTrue(specificatiiTehnice.isDisplayed());
            log.info(">>>>> Product details page is opened! <<<<<");
        } catch (Exception e) {
            throw new Exception(">>>>> Product details page is opened! <<<<<");
        }
    }

    public void addProductToCart() {
        Waiter.waitByXPath("//bdi");
        TakeScreens.takeScreenshot(driver, "add_to_cart_button");
        addToCartButton.click();
        Waiter.waitByXPath("//h1[contains(text(),'Produs adaugat in cos')]");
        TakeScreens.takeScreenshot(driver, "product_added_to_cart_confirm");
        Waiter.waitByXPathUntilDissapear("//h1[contains(text(),'Produs adaugat in cos')]");
        log.info("Product is added to cart!");
    }

    public void clickOnCartIcon() {
        TakeScreens.takeScreenshot(driver, "cart_icon");
        cartIcon.click();
        log.info("Cart popup is opened!");
    }

    public void goToCart() throws Exception {
        if (goToCart.isDisplayed()) {
            TakeScreens.takeScreenshot(driver, "go_to_cart");
            try {
                if (!cartPopup.getText().equals("Coșul este gol")) {
                    goToCart.click();
                    log.info("Opening cart page!");
                }
            } catch (Exception ex) {
                throw new Exception(">>>>> Your cart is empty! <<<<<");
            }
        } else {
            throw new Exception(">>>>> Error occur while accessing the cart! <<<<<");
        }
    }

    public void writeReviewButtonClick() {
        Waiter.waitByXPath("//a[contains(@class,'ty-btn cm-dialog-opener cm-dialog-auto-size uk-button uk-border-rounded uk-button-primary tm-add-review')]");
        writeReviewButton.click();
        Waiter.waitByXPath("//button[@name='dispatch[discussion.add]']");
        Waiter.waitByXPath("//label[contains(text(),'cut foarte mult')]");
    }

    public void reviewFormCheck() {
        Assert.assertTrue(reviewNameTextbox.isDisplayed());
        Assert.assertTrue(reviewEmailTextbox.isDisplayed());
        Assert.assertTrue(reviewFiveStarsButton.isDisplayed());
        Assert.assertTrue(reviewMessageTextbox.isDisplayed());
    }

    public void reviewFormComplete(String name, String email, String message) {
        reviewNameTextbox.sendKeys(name);
        reviewEmailTextbox.sendKeys(email);
        reviewMessageTextbox.sendKeys(message);
        reviewFiveStarsButton.click();
        TakeScreens.takeScreenshot(Driver.getDriver(), "Data is introduced");
        reviewSendButton.click();
        Waiter.waitByXPath("//div[@class='cm-notification-content notification-content alert-warning']");
    }

    public void reviewSentNotificationCheck() {
        Waiter.waitByXPath("//div[@class='cm-notification-content notification-content alert-warning']");
        Assert.assertTrue(reviewSentNotification.isDisplayed());
    }


    public void showSmartphonesAssert() throws Exception {
        try {
            Assert.assertTrue(assertSmartphonesCategory.isDisplayed());
            System.out.println(">>>>> Smartphones category is opened! <<<<<");
        } catch (Exception e) {
            System.out.println("Exception catched: " + e.getMessage());
            throw new Exception(">>>>> Smartphones category is NOT opened! <<<<<");
        }
    }

    public void showSamsungAssert() throws Exception {
        try {
            Assert.assertTrue(assertSamsungPhones.isDisplayed());
            System.out.println(">>>>> Samsung phones are displayed! <<<<<");
        } catch (Exception e) {
            System.out.println("Exception catched: " + e.getMessage());
            throw new Exception(">>>>> Samsung phones are NOT displayed! <<<<<");
        }
    }

    public void addToCompareListButtonClick() {
        addToCompareListButton.click();
        Waiter.waitByXPathUntilDissapear("//div[@class='ty-product-notification__item clearfix']");
    }

    public String getProductName() {
        return productName.getText();
    }
}
