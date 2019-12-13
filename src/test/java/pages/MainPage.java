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

import static junit.framework.Assert.assertTrue;

public class MainPage extends Page {

    WebDriver driver = Driver.getDriver();
    DrawBorder dB;

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
    @FindBy(xpath = "//*[@id=\"iam_search_products\"]/li[2]/a/div/div[2]/div[1]")
    private WebElement selectOnePlus;
    @FindBy(xpath = "//button[@id='button_wishlist_9854998549']")
    private WebElement buttonAddToWishlist;
    @FindBy(xpath = "//div[contains(@class, 'ty-float-right')]/a[contains(@class, 'ty-btn ty-btn__secondary')]")
    private WebElement buttonCheckWischlist;
    @FindBy(xpath = "//*[@id=\"det_img_98549\"]")
    private WebElement buttonCheckProductInWischlist;
    @FindBy(xpath = "//*[@id=\"megamenubutton\"]/button[2]")
    private WebElement allCategoriesDropdown;
    @FindBy(xpath = "//*[@id=\"megamenubutton\"]/div/div/div/div[1]/ul/li[1]/a")
    private WebElement allCategoriesDropdownTelephonesCategory;
    @FindBy(xpath = "//*[@id=\"megamenubutton\"]/div/div/div/div[2]/div/div[1]/div[1]/ul/li/a")
    private WebElement allCategoriesDropdownTelephonesCategorySmartphones;
    @FindBy(xpath = "//*[@id=\"index\"]/div[1]/div/div[2]/div/div/div[2]/a/svg")
    private WebElement logoEnter;
    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[1]/a")
    private WebElement electrocasniceButton;
    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[2]/a")
    private WebElement nouatisipromotiiButton;
    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[3]/a")
    private WebElement gadgeturiPentruOriceVirstaButton;
    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[4]/a")
    private WebElement sfaturiUtileButton;

    Actions actions = new Actions(Driver.getDriver());
    //method

    public void assertProductInWischlist() throws InterruptedException {
        assertTrue(buttonCheckProductInWischlist.isDisplayed());
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

    public void searchBarMethod() {
        searchBar.sendKeys("Oneplus");
    }

    public void accessLoginMenu() {
//        dB.drawBorder(loginOption, driver);
        loginOption.click();
        Waiter.waitByXPath("//form[contains(@name,'popup3262_form')]");
        showAssertsLoginMenu();
        TakeScreens.takeScreenshot(driver, "login_menu");
    }

    public void inputNegativeEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void inputNegativePassword(String password) {
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

    public void invalidLoginFlow(String email, String password) {
        driver.navigate().refresh();
        accessLoginMenu();
        Waiter.waitById("login_popup3262");
        inputNegativeEmail(email);
        inputNegativePassword(password);
        clickLoginButton();
    }

    public void repeatEmailAndPassword(String email, String password) {
        driver.navigate().refresh();
        inputNegativeEmail(email);
        inputNegativePassword(password);
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

    public void checkThatUserIsLoggedIn() throws Exception {
        if (!loginMenu.getText().equals("în cont")) {
            System.out.println(">>> User is logged in! <<<");
        } else {
            throw new Exception("Login failed!");
        }
    }

    //    public void assertAlertNotification(){
//        if (invalidEmailAlert.isDisplayed() || invalidPasswordAlert.isDisplayed()){
//            System.out.println(">> ENTERED INVALID CREDENTIALS! <<<");
//        } else if (notificationAlertError.isDisplayed()){
//            Waiter.waitByXPath("//sdiv[@class='support-trigger-round-wrapper']");
//            loginOption.click();
//            Waiter.waitByXPath("//form[contains(@name,'popup3262_form')]");
//            showAssertsLoginMenu();
//        }
//    }
    public void assertAlertNotification() {
        if (invalidEmailAlert.isDisplayed() || invalidPasswordAlert.isDisplayed() || notificationAlertError.isDisplayed()) {
            System.out.println(">> ENTERED INVALID CREDENTIALS! <<<");
            invalidLoginFlow("me@me.com", "123123");
        }
    }

    public void selectSmartphonesCategory() {
        allCategoriesDropdown.click();
        allCategoriesDropdownTelephonesCategory.click();
        allCategoriesDropdownTelephonesCategorySmartphones.click();
    }

}
