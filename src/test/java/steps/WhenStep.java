package steps;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.Driver;


public class WhenStep {

    WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage();
    LoginPopup loginPopup = new LoginPopup();
    MainPageAsLogged mainPageAsLogged = new MainPageAsLogged();
    ProductPage productPage = new ProductPage();

    ///////////// examples ////////////
    Electrocasnice electrocasnice = new Electrocasnice();
    CadouPentruEa cadouPentruEa = new CadouPentruEa();
    ToateCategoriile toateCategoriile = new ToateCategoriile();
    CastiPage castiPage = new CastiPage();
    static Logger log = Logger.getLogger(WhenStep.class);

//    @When("^user clicks on login menu$")
//    public void clickOnLoginMenu() {
//        mainPage.accessLoginMenu();
//    }

//    @When("^user clicks on 'facebook' icon$")
//    public void clickOnFacebookIcon() {
//        mainPage.loginViaFacebook();
//        WindowsHandler.switchWindow();
//    }

//    @When("^user enters credentials")
//    public void enterCredentials() {
//        Waiter.waitById("email");
//        Waiter.waitById("pass");
//        loginPopup.inputEmail("");
//        loginPopup.inputPassword("");
//    }

//    @When("^user press login button$")
//    public void clickLoginButton() {
//        loginPopup.login();
//        WindowsHandler.switchBackToMain();
//    }
    /* ------------------------- */
//    @When("^user clicks on 'categoryList'$")
//    public void openCategoryList() {
//        mainPageAsLogged.openAllCategories();
//    }


//    @When("^user clicks on 'telefoane' category$")
//    public void openTelefoaneCategories() {
//        mainPageAsLogged.openAllTelefoaneCategories();
//    }

//    @When("^user clicks on 'smartphones' category$")
//    public void openSmartphonesCategory(){
//        mainPageAsLogged.goToSmartphones();
//    }

//    @When("^user clicks on product$")
//    public void openPhoneDetails() {
//        mainPageAsLogged.openPhoneDetails();
//    }

//    @When("^user add product to cart$")
//    public void addToCart() {
//        productPage.addProductToCart();
//    }

//    @When("^user clicks on cart icon$")
//    public void clickOnCartIcon() {
//        productPage.clickOnCartIcon();
//    }

//    @When("^user clicks on 'visualize cart' button$")
//    public void goToCart() throws Exception {
//        productPage.goToCart();
//    }
//    @When("^user tries to log in with invalid (.*?) and (.*?)$")
//    public void loginNegative(){
////        mainPage.accessLoginMenu();
////        Waiter.waitById("login_popup3262");
////        mainPage.inputNegativeEmail("testmail.com");
////        mainPage.clickLoginButton();
//        mainPage.invalidLoginFlow("test@test.com", "1");
//        mainPage.invalidLoginFlow("test@test.com", "   ");
//    @When("^user choose 'samsung' brand$")
//    public void openSamsungPhones(){
//        mainPageAsLogged.goToSamsungPhones();
}


