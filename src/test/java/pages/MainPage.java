package pages;

import cucumber.api.java.de.Wenn;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.DrawBorder;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

import java.security.cert.X509Certificate;

import static junit.framework.Assert.assertTrue;

public class MainPage extends Page {

    WebDriver driver = Driver.getDriver();
    DrawBorder dB;

    //find elements
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


    //method
    public void ingrijirePersonala() {
        assertTrue(tehnicaDeBucatarieLabel.isDisplayed());
    }

    public void aparateDeUzCasnicePart() {
        assertTrue(tehnicaDeBucatarieLabel.isDisplayed());
    }

    public void tehnicaDeBucatarieLabel() {
        assertTrue(tehnicaDeBucatarieLabel.isDisplayed());
    }

    public void electroCasniceCategoryIsDisplayed() {
        assertTrue(electroCasniceCategoryMainLabel.isDisplayed());
    }

    public void ClickOnelectroCasniceCategory() {
        electroCasniceCategory.click();
    }

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

}
