package pages;


import context.ScenarioContext;
import enums.Context;
import enums.Users;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.*;
import java.util.List;

public class MainPage extends Page {
    Page page = new Page();
    Logger log = Logger.getLogger(MainPage.class);
    WebDriver driver = Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());
    LoginPopupFacebook loginPopupFacebook = page.getLoginPopupFacebook();
    LoginPopupVKontakte loginPopupVKontakte = page.getLoginPopupVKontakte();
    LoginPopupOdnoklassniki loginPopupOdnoklassniki = page.getLoginPopupOdnoklassniki();

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
    @FindBy(xpath = "//a[2]//img[1]")
    private WebElement VKontakteIcon;
    @FindBy(xpath = "//div[@id='auth-modal']//a[1]//img[1]")
    private WebElement odnoklassnikiIcon;
    @FindBy(className = "//div[contains(@class, 'name')]")
    private WebElement loginMenu;
    @FindBy(xpath = "//div[contains(@class, 'auth uk-grid')]")
    private WebElement userMenu;
    @FindBy(xpath = "//div[contains(@class, 'auth')]//div[contains(@class, 'name')]//span")
    private WebElement userName;
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
    @FindBy(xpath = "//div[@class='tab-credit-submit']")
    private WebElement checkCreditPage;
    @FindBy(id = "megamenubutton")
    private WebElement allCategories;
    @FindBy(xpath = "//li[contains(@class,'first-level blue')]//a[contains(text(),'Telefoane')]")
    private WebElement telefoaneCategoriesList;
    @FindBy(xpath = "//a[contains(text(),'Smartphone-uri')]")
    private WebElement smartphonesCategory;
    @FindBy(xpath = "//div[contains(@class, 'pm-grid')]//form[contains(@name, 'product_form')]//div[contains(@class, 'ty-grid-list__image')]")
    List<WebElement> productList;
    @FindBy(xpath = "//li[contains(@class, 'first-level')]//a[contains(text(), 'Televizoare')]")
    private WebElement TVCategoriesList;
    @FindBy(xpath = "//li[contains(@class, 'second-level')]//a[contains(text(), 'Televizoare')]")
    private WebElement televizoareCategory;
    @FindBy(xpath = "//li[@class='first-level blue']//a[contains(text(),'Transport')]")
    private WebElement transportCategoriesList;
    @FindBy(xpath = "//a[contains(text(),'Transport electric')]")
    private WebElement transportCategory;
    @FindBy(xpath = "//img[@id='det_img_98146']")
    private WebElement transportDetails;
    @FindBy(xpath = "//div[@class='uk-width-auto@m']//li[6]//a[1]")
    private WebElement logoutOption;
    @FindBy(xpath = "//div[contains(@class, 'uk-dropdown')]//li//a[contains(@href, 'detalii-profil')]")
    private WebElement myAccount;
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
    @FindBy(xpath = "//div[@id='languages_638']//div//a[@href='https://enter.online/ru/']")
    private WebElement langChangerRU;
    @FindBy(xpath = "//div[@id='languages_638']//div//a[@href='https://enter.online/']")
    private WebElement langChangerRO;
    @FindBy(xpath = "//*[@id=\"languages_638\"]/div[1]/a")
    private WebElement langChanger;

    public void loginViaSocial(String socialNetwork, Users user) throws Exception {
        accessLoginMenu();
        try {
            switch (socialNetwork) {
                case "Facebook":
                    loginViaFacebook(user);
                    break;
                case "VK":
                    loginViaVKontakte(user);
                    break;
                case "Odnoklassniki":
                    loginViaOdnoklassniki(user);
                    break;
            }
            WindowsHandler.switchBackToMain();
            log.info("User is logged via " + socialNetwork + "account.");
        } catch (Exception e) {
            throw new Exception("Cannot login via " + socialNetwork + "account.");
        }
    }

    private void loginViaFacebook(Users user) throws Exception {
        goToLoginViaFacebook();
        WindowsHandler.switchWindow();
        Waiter.waitById("email");
        Waiter.waitById("pass");
        loginPopupFacebook.inputEmail(user.getEmail());
        loginPopupFacebook.inputPassword(user.getPassword());
        loginPopupFacebook.login();
    }

    private void loginViaVKontakte(Users user) throws Exception {
        goToLoginViaVKontakte();
        WindowsHandler.switchWindow();
        Waiter.waitByXPath("//input[@name='email']");
        Waiter.waitByXPath("//input[@name='pass']");
        loginPopupVKontakte.inputEmail(user.getEmail());
        loginPopupVKontakte.inputPassword(user.getPassword());
        loginPopupVKontakte.login();
    }

    private void loginViaOdnoklassniki(Users user) throws Exception {
        goToLoginViaOdnoklassniki();
        WindowsHandler.switchWindow();
        Waiter.waitByXPath("//input[@id='field_email']");
        Waiter.waitByXPath("//input[@id='field_password']");
        loginPopupOdnoklassniki.inputEmail(user.getEmail());
        loginPopupOdnoklassniki.inputPassword(user.getPassword());
        loginPopupOdnoklassniki.login();
    }

    public void showAssertsLoginMenu() {
        try {
            Assert.assertTrue(loginButton.isDisplayed());
            log.info(">> Login pop up is displayed! <<<");
        } catch (Exception e) {
            log.info(">>> Login pop up is not displayed! <<<");
        }
    }

    public void checkThatUserIsLoggedIn(String user) throws Exception {
        if (userName.getText().contains(user)) {
            log.info("User is logged in!");
        } else {
            throw new Exception("Login failed!");
        }
    }

    public void goToLoginViaFacebook() throws Exception {
        if (facebookIcon.isDisplayed()) {
            facebookIcon.click();
        } else {
            throw new Exception(">>>>> Cannot find Facebook icon! <<<<");
        }
    }

    public void goToLoginViaVKontakte() throws Exception {
        if (VKontakteIcon.isDisplayed()) {
            VKontakteIcon.click();
        } else {
            throw new Exception(">>>>> Cannot find VKontakte icon! <<<<");
        }
    }

    public void goToLoginViaOdnoklassniki() throws Exception {
        if (odnoklassnikiIcon.isDisplayed()) {
            odnoklassnikiIcon.click();
        } else {
            throw new Exception(">>>>> Cannot find Odnoklassniki icon! <<<<<");
        }
    }

    public void openAllCategories() {
        TakeScreens.takeScreenshot(driver, "go_to_all_categories");
        allCategories.click();
    }

    public void openAllTelefoaneCategories() {
        TakeScreens.takeScreenshot(driver, "telefoane_categories");
        telefoaneCategoriesList.click();
    }

    public void goToSmartphones() {
        TakeScreens.takeScreenshot(driver, "go_to_smartphones");
        actions.moveToElement(smartphonesCategory).build().perform();
        smartphonesCategory.click();
    }

    public void selectSmartphonesCategory() {
        allCategories.click();
        telefoaneCategoriesList.click();
        smartphonesCategory.click();
    }

    public void asserttElectrocasniceButton() {
        Assert.assertTrue(electrocasniceButton.isDisplayed());
    }

    public void assertLogoEnter() {
        Assert.assertTrue(logoEnter.isDisplayed());
    }

    public void assertNouatiSiPromotiiButton() {
        Assert.assertTrue(nouatiSiPromotiiButton.isDisplayed());
    }

    public void assertGadgeturiPentruOriceVirstaButton() {
        Assert.assertTrue(gadgeturiPentruOriceVirstaButton.isDisplayed());
    }

    public void assertSfaturiUtileButton() {
        Assert.assertTrue(sfaturiUtileButton.isDisplayed());
    }

    public void openAllTVCategories() {
        TakeScreens.takeScreenshot(driver, "tv_categories");
        TVCategoriesList.click();
    }

    public void goToTelevizoare() {
        TakeScreens.takeScreenshot(driver, "go_to_televizoare");
        actions.moveToElement(televizoareCategory).build().perform();
        televizoareCategory.click();
    }

    public void openAllTransportCategories() {
        TakeScreens.takeScreenshot(driver, "transport_categories");
        transportCategoriesList.click();
    }

    public void goToTransportElectric() {
        TakeScreens.takeScreenshot(driver, "go_to_transport_electric");
        actions.moveToElement(transportCategory).build().perform();
        transportCategory.click();
    }

    public void selectProduct(int productId) {
        TakeScreens.takeScreenshot(driver, "products_list");
        productList.get(productId).click();
    }

    public void logout() throws Exception {
        try {
            userMenu.click();
            logoutOption.click();
        } catch (Exception e){
            throw new Exception("An error occured while logging out from the site.");
        }

    }

    public void assertUserIsLoggedOut() throws Exception {
        try {
            if (userName.getText().equals("intră în cont"))
                log.info(">>>>> SUCCESS! User is logged out! <<<<<");
        } catch (Exception e) {
            throw new Exception(">>>>> ERROR! User is not logged out! <<<<<");
        }
    }

    public void goToUserAccountDetails() {
        userMenu.click();
        myAccount.click();
    }

    public void inputPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void assertcheckCreditPage() {
        Assert.assertTrue(checkCreditPage.isDisplayed());
    }

    public void clickButtonBuyInCredit() {
        actions.moveToElement(buttonBuyInCredit).build().perform();
        buttonBuyInCredit.click();
    }

    public void accessLoginMenu() {
        loginOption.click();
        Waiter.waitByXPath("//form[contains(@name,'popup3262_form')]");
        TakeScreens.takeScreenshot(driver, "login_menu");
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

    public void assertMainPageUIElements() {
        Assert.assertTrue(electrocasniceButton.isDisplayed());
        Assert.assertTrue(logoEnter.isDisplayed());
        Assert.assertTrue(nouatiSiPromotiiButton.isDisplayed());
        Assert.assertTrue(gadgeturiPentruOriceVirstaButton.isDisplayed());
        Assert.assertTrue(sfaturiUtileButton.isDisplayed());
        if (ScenarioContext.getContext(Context.LANGUAGE)=="RU") {
            Assert.assertEquals("Бытовая техника", electrocasniceButton.getText());
            Assert.assertEquals("Новости", nouatiSiPromotiiButton.getText());
            Assert.assertEquals("Акции", gadgeturiPentruOriceVirstaButton.getText());
            Assert.assertEquals("Полезные советы", sfaturiUtileButton.getText());
        }
        else if (ScenarioContext.getContext(Context.LANGUAGE)=="RO"){
            Assert.assertEquals("Electrocasnice", electrocasniceButton.getText());
            Assert.assertEquals("Noutăți", nouatiSiPromotiiButton.getText());
            Assert.assertEquals("Promoții", gadgeturiPentruOriceVirstaButton.getText());
            Assert.assertEquals("Sfaturi Utile", sfaturiUtileButton.getText());
        }

    }

    public void langChangerClick() {
        langChangerRU.click();
    }
}
