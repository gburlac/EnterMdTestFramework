package pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import context.ScenarioContext;
import enums.Context;
import enums.Users;
import util.Driver;
import util.TakeScreens;
import util.Waiter;
import util.WindowsHandler;

public class MainPage extends Page {

    Page page = new Page();

    Logger log = Logger.getLogger(MainPage.class);

    WebDriver driver = Driver.getDriver();

    Actions actions = new Actions(Driver.getDriver());

    LoginPopupFacebook loginPopupFacebook = page.getLoginPopupFacebook();

    LoginPopupVKontakte loginPopupVKontakte = page.getLoginPopupVKontakte();

    LoginPopupOdnoklassniki loginPopupOdnoklassniki = page.getLoginPopupOdnoklassniki();

    @FindBy(xpath = "//div[contains(@class, 'auth uk-grid')]")
    WebElement loginOption;

    @FindBy(xpath = "//a[3]//img[1]")
    WebElement facebookIcon;

    @FindBy(xpath = "//a[2]//img[1]")
    WebElement VKontakteIcon;

    @FindBy(xpath = "//div[@id='auth-modal']//a[1]//img[1]")
    WebElement odnoklassnikiIcon;

    @FindBy(xpath = "//div[contains(@class, 'auth uk-grid')]")
    WebElement userMenu;

    @FindBy(xpath = "//div[contains(@class, 'auth')]//div[contains(@class, 'name')]//span")
    WebElement userName;

    @FindBy(xpath = "//input[@id='login_popup3262']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='psw_popup3262']")
    WebElement passwordField;

    @FindBy(xpath = "//button[@name='dispatch[auth.login]']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='cm-notification-content notification-content alert-error']")
    WebElement notificationAlertError;

    @FindBy(xpath = "//div[@class='ty-control-group error']//p[1]")
    WebElement invalidEmailAlert;

    @FindBy(xpath = "//div[@class='ty-control-group ty-password-forgot error']//p[1]")
    WebElement invalidPasswordAlert;

    @FindBy(xpath = "//*[@id=\"iam_search\"]")
    WebElement searchBar;

    @FindBy(xpath = "//div[contains(text(),'OnePlus 7 Pro')]")
    WebElement selectOnePlus;

    @FindBy(xpath = "//li[2]//a[1]//div[1]//div[2]//div[1]")
    WebElement selectIphone;

    @FindBy(xpath = " //a[@class='uk-margin-small-top uk-button uk-button-default uk-border-pill ty-tk-product-button']")
    WebElement buttonBuyInCredit;

    @FindBy(xpath = "//div[@class='tab-credit-submit']")
    WebElement checkCreditPage;

    @FindBy(id = "megamenubutton")
    WebElement allCategories;

    @FindBy(xpath = "//li[contains(@class,'first-level blue')]//a[contains(text(),'Telefoane')]")
    WebElement telefoaneCategoriesList;

    @FindBy(xpath = "//a[contains(text(),'Smartphone-uri')]")
    WebElement smartphonesCategory;

    @FindBy(xpath = "//div[contains(@class, 'pm-grid')]//form[contains(@name, 'product_form')]//div[contains(@class, 'ty-grid-list__image')]")
    List<WebElement> productList;

    @FindBy(xpath = "//li[contains(@class, 'first-level')]//a[contains(text(), 'Televizoare')]")
    WebElement TVCategoriesList;

    @FindBy(xpath = "//li[contains(@class, 'second-level')]//a[contains(text(), 'Televizoare')]")
    WebElement televizoareCategory;

    @FindBy(xpath = "//li[@class='first-level blue']//a[contains(text(),'Transport')]")
    WebElement transportCategoriesList;

    @FindBy(xpath = "//a[contains(text(),'Transport electric')]")
    WebElement transportCategory;

    @FindBy(xpath = "//div[@class='uk-width-auto@m']//li[6]//a[1]")
    WebElement logoutOption;

    @FindBy(xpath = "//div[contains(@class, 'uk-dropdown')]//li//a[contains(@href, 'detalii-profil')]")
    WebElement myAccount;

    @FindBy(xpath = "//*[@id=\"index\"]/div[1]/div/div[2]/div/div/div[2]")
    WebElement logoEnter;

    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[1]/a")
    WebElement electrocasniceButton;

    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[2]/a")
    WebElement nouatiSiPromotiiButton;

    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[3]/a")
    WebElement gadgeturiPentruOriceVirstaButton;

    @FindBy(xpath = "//*[@id=\"index\"]/div[3]/div/div[1]/div/div/ul/li[4]/a")
    WebElement sfaturiUtileButton;

    @FindBy(xpath = "//div[@id='languages_638']//div//a[@href='https://enter.online/ru/']")
    WebElement langChangerRU;

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
            Waiter.waitByXPath("//div[contains(@class, 'auth uk-grid')]");
            userMenu.click();
            logoutOption.click();
        } catch (Exception e) {
            throw new Exception("An error occured while logging out from the site.");
        }
    }

    public void assertUserIsLoggedOut() throws Exception {
        try {
            if (userName.getText().equals("intră în cont")) {
                log.info(">>>>> SUCCESS! User is logged out! <<<<<");
            }
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

    public void accessLoginMenu() {
        loginOption.click();
        Waiter.waitByXPath("//form[contains(@name,'popup3262_form')]");
        TakeScreens.takeScreenshot(driver, "login_menu");
    }

    public void inputEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
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
}
