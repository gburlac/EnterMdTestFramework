package steps;

import cucumber.api.java.en.When;
import pages.LoginPopup;
import pages.MainPage;
import pages.MainPageAsLogged;
import pages.ProductPage;
import util.Waiter;
import util.WindowsHandler;

public class WhenStep {

    MainPage mainPage = new MainPage();
    LoginPopup loginPopup = new LoginPopup();
    MainPageAsLogged mainPageAsLogged = new MainPageAsLogged();
    ProductPage productPage = new ProductPage();

    @When("^press on electrocasnice category$")
    public void pressOnCategory() {
        mainPage.ClickOnelectroCasniceCategory();
    }

    @When("^input in search bar a OnePlus$")
    public void inputInSearchBarAOnePlus() {
    }

    @When("^user clicks on login menu$")
    public void clickOnLoginMenu() {
        mainPage.accessLoginMenu();
    }

    @When("^user clicks on 'facebook' icon$")
    public void clickOnFacebookIcon() {
        mainPage.loginViaFacebook();
        WindowsHandler.switchWindow();
    }

    @When("^user enters credentials")
    public void enterCredentials() {
        Waiter.waitById("email");
        Waiter.waitById("pass");
        loginPopup.inputEmail("");
        loginPopup.inputPassword("");
    }

    @When("^user press login button$")
    public void clickLoginButton() {
        loginPopup.login();
        WindowsHandler.switchBackToMain();
    }

    @When("^user clicks on 'categoryList'$")
    public void openCategoryList() {
        mainPageAsLogged.openAllCategories();
    }

    @When("^user clicks on 'telefoane' category$")
    public void openTelefoaneCategories() {
        mainPageAsLogged.openAllTelefoaneCategories();
    }

    @When("^user clicks on 'smartphones' category$")
    public void openSmartphonesCategory(){
        mainPageAsLogged.goToSmartphones();
    }

    @When("^user clicks on product$")
    public void openPhoneDetails() {
        mainPageAsLogged.openPhoneDetails();
    }

    @When("^user add product to cart$")
    public void addToCart() {
        productPage.addProductToCart();
    }

    @When("^user clicks on cart icon$")
    public void clickOnCartIcon() {
        productPage.clickOnCartIcon();
    }

    @When("^user clicks on 'visualize cart' button$")
    public void goToCart() throws Exception {
        productPage.goToCart();
    }



//
//    @When("^user choose 'samsung' brand$")
//    public void openSamsungPhones(){
//        mainPageAsLogged.goToSamsungPhones();
//    }
}
