package pages;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import steps.CommonSteps;
import util.DrawBorder;
import util.Driver;

import static junit.framework.Assert.assertTrue;

public class MainPage extends Page {
    static Logger log = Logger.getLogger(MainPage.class);
    WebDriver driver = Driver.getDriver();
    DrawBorder dB;

    //find elements

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
    @FindBy(xpath = "//button[@id='button_wishlist_9854998549']")
    private WebElement buttonAddToWishlist;
    @FindBy(xpath = "//button[@id='button_wishlist_102069102069']")
    private WebElement buttonAddToWishlistIphone;
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
    @FindBy(xpath = "//*[@id=\"megamenubutton\"]/button[2]")
    private WebElement allCategoriesDropdown;
    @FindBy(xpath = "//*[@id=\"megamenubutton\"]/div/div/div/div[1]/ul/li[1]/a")
    private WebElement allCategoriesDropdownTelephonesCategory;
    @FindBy(xpath = "//*[@id=\"megamenubutton\"]/div/div/div/div[2]/div/div[1]/div[1]/ul/li/a")
    private WebElement allCategoriesDropdownTelephonesCategorySmartphones;
    @FindBy(xpath = "//*[@id=\"index\"]/div[1]/div/div[2]/div/div/div[2]")
    private WebElement logoEnter;
    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[1]/a")
    private WebElement electrocasniceButton;
    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[2]/a")
    private WebElement nouatiSiPromotiiButton;
    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[3]/a")
    private WebElement gadgeturiPentruOriceVirstaButton;
    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[4]/a")
    private WebElement sfaturiUtileButton;
    @FindBy(xpath = "//*[@id=\"languages_638\"]/div[1]/a")
    private WebElement langChanger;
    Actions actions = new Actions(Driver.getDriver());

    //method
    public void assertcheckCreditPage()  {
        assertTrue(checkCreditPage.isDisplayed());
    }

    public void clickButtonBuyInCredit() {
        actions.moveToElement(buttonBuyInCredit).build().perform();
        buttonBuyInCredit.click();
    }


    public void inputEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void clickbuttonselectIphone() {
        selectIphone.click();
    }

    public void clickOnSelectOnePlus() {
        selectOnePlus.click();
    }

    public void searchBarMethod(String value) {
        searchBar.sendKeys(value);
    }

    public void assertAlertNotification(String errorMessage) {
        if (errorMessage.contains("Adresa de e-mail din")) {
            Assert.assertTrue(invalidEmailAlert.isDisplayed());
            log.info("ENTERED INVALID EMAIL");
        }
        if (errorMessage.contains("Campul Parola")) {
            Assert.assertTrue(invalidPasswordAlert.isDisplayed());
            log.info("ENTERED INVALID PASSWORD");
        }
        if (errorMessage.contains("Numele de utilizator sau parola introdusa este incorecta")) {
            Assert.assertTrue(notificationAlertError.isDisplayed());
            log.info(">> ENTERED INVALID CREDENTIALS! <<<");
        }
    }


    public void asserttElectrocasniceButton() {
        assertTrue(electrocasniceButton.isDisplayed());
    }

    public void assertLogoEnter() {
        assertTrue(logoEnter.isDisplayed());
    }

    public void assertNouatiSiPromotiiButton() {
        assertTrue(nouatiSiPromotiiButton.isDisplayed());
    }

    public void assertGadgeturiPentruOriceVirstaButton() {
        assertTrue(gadgeturiPentruOriceVirstaButton.isDisplayed());
    }

    public void assertSfaturiUtileButton() {
        assertTrue(sfaturiUtileButton.isDisplayed());
    }

    public void langChangerClick() {
        langChanger.click();
    }
}
