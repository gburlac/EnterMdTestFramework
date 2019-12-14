package pages;

import cucumber.api.java.de.Wenn;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.Driver;
import util.DrawBorder;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

import java.security.cert.X509Certificate;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
import static junit.framework.Assert.assertTrue;

public class MainPage extends Page {

    WebDriver driver = Driver.getDriver();
    DrawBorder dB;

    //find elements
    Actions actions = new Actions(Driver.getDriver());
    //*[@id="index"]/div[3]/div/div[1]/div/div/ul/li[1]/a
    //div[contains(@class, 'ty-wysiwyg-content')]/ul/li[1]/a
    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[1]/a")
    private WebElement electroCasniceCategory;
    @FindBy(xpath = "//*[@id=\"categories\"]/div[3]/div/div[2]/div/div/div/h1")
    private WebElement electroCasniceCategoryMainLabel;
    @FindBy(xpath = "//div[@id='block1']/h2[contains(@class, 'uk-cover tm-landing-white-title')]")
    private WebElement tehnicaDeBucatarieLabel;
    @FindBy(xpath = "//div[@id='block1']/h2[contains(@class, 'uk-cover tm-landing-white-title')]")
    private WebElement aparateDeUzCasnicePart;
    @FindBy(xpath = "//*[@id=\"block3\"]/h2")
    private WebElement ingrijirePersonala;
    @FindBy(xpath = "//div[contains(@class, 'auth uk-grid')]")
    private WebElement loginOption;
    @FindBy(xpath = "//button[@name='dispatch[auth.login]']")
    private WebElement loginViaFBButton;
    @FindBy(xpath = "//a[3]//img[1]")
    private WebElement facebookIcon;
    @FindBy(className = "name")
    private WebElement loginMenu;
    @FindBy(xpath = "//input[@id='login_popup3262']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@id='psw_popup3262']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@name='dispatch[auth.login]']")
    private WebElement loginButton;
    @FindBy(xpath = "//div[@class='ty-control-group error']//p[1]")
    private WebElement errorEmail;
    @FindBy(xpath = "//div[@class='cm-notification-content notification-content alert-error']")
    private WebElement notificationAlertError;
    @FindBy(xpath = "//div[@class='ty-control-group error']//p[1]")
    private WebElement invalidEmailAlert;
    @FindBy(xpath = "//div[@class='ty-control-group ty-password-forgot error']//p[1]")
    private WebElement invalidPasswordAlert;


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
    //a[contains(@class, 'uk-margin-small-top uk-button uk-button-default uk-border-pill ty-tk-product-button')]
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
        actions.moveToElement(buttonBuyInCredit).build().perform();
        buttonBuyInCredit.click();
    public void accessLoginMenu() {
//        dB.drawBorder(loginOption, driver);
        loginOption.click();
        Waiter.waitByXPath("//form[contains(@name,'popup3262_form')]");
        showAssertsLoginMenu();
        TakeScreens.takeScreenshot(driver, "login_menu");
    }

    public void inputEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void clickbuttonselectIphone() {
        selectIphone.click();

    public void inputPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void loginViaFacebook() {
//        dB.drawBorder(facebookIcon, driver);
        facebookIcon.click();
    }

    public void clickButtonAddToWishlistIphone() {
        buttonAddToWishlistIphone.click();
    }

    public void clickbuttonCheckWischlist() {
        buttonCheckWischlist.click();

    public void invalidLoginFlow(String email, String password) {
        driver.navigate().refresh();
        accessLoginMenu();
        Waiter.waitById("login_popup3262");
        inputEmail(email);
        inputPassword(password);
        clickLoginButton();
    }

    public void repeatEmailAndPassword(String email, String password) {
        driver.navigate().refresh();
        inputEmail(email);
        inputPassword(password);
        clickLoginButton();
    }


    public void showAssertsLoginMenu() {
        try {
            Assert.assertTrue(loginViaFBButton.isDisplayed());
            System.out.println(">> Login pop up is displayed! <<<");
        } catch (Exception e) {
            System.out.println(">>> Login pop up is not displayed! <<<");
        }
    }

    public void clickbuttonAddToWishlist() {
        buttonAddToWishlist.click();
    }

    public void clickOnSelectOnePlus() {
        selectOnePlus.click();


    public void checkThatUserIsLoggedIn() throws Exception {
        if (!loginMenu.getText().equals("în cont")) {
            System.out.println(">>> User is logged in! <<<");
        } else {
            throw new Exception("Login failed!");
        }
    }

    public void searchBarMethod(String value) {
        searchBar.sendKeys(value);

    public void assertAlertNotification(String errorMessage) {
        if (errorMessage.contains("Adresa de e-mail din")){
            Assert.assertTrue(invalidEmailAlert.isDisplayed());
            log.println("ENTERED INVALID EMAIL");
        }
        if (errorMessage.contains("Campul Parola")) {
            Assert.assertTrue(invalidPasswordAlert.isDisplayed());
            log.println("ENTERED INVALID PASSWORD");
        }
        if (errorMessage.contains("Numele de utilizator sau parola introdusa este incorecta")){
            Assert.assertTrue(notificationAlertError.isDisplayed());
            log.println(">> ENTERED INVALID CREDENTIALS! <<<");
        }
    }



}
