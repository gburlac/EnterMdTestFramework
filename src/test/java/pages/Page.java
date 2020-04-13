package pages;

import context.ScenarioContext;
import org.openqa.selenium.support.PageFactory;
import steps.CommonSteps;
import util.Driver;

public class Page {
    public Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    MainPage mainPage;
    CartPage cartPage;
    LoginPopup loginPopup;
    LoginPopupFacebook loginPopupFacebook;
    LoginPopupVKontakte loginPopupVKontakte;
    LoginPopupOdnoklassniki loginPopupOdnoklassniki;
    ProductPage productPage;
    CommonSteps commonSteps;
    ScenarioContext scenarioContext;
    UserPage userPage;

    public MainPage getMainPage() {
        return (mainPage == null) ? mainPage = new MainPage() : mainPage;
    }

    public CommonSteps getCommonSteps() {
        return (commonSteps == null) ? commonSteps = new CommonSteps() : commonSteps;
    }

    public UserPage getUserPage() {
        return (userPage == null) ? userPage = new UserPage() : userPage;
    }

    public ScenarioContext getScenarioContext() {
        return (scenarioContext == null) ? scenarioContext = new ScenarioContext() : scenarioContext;
    }

    public LoginPopupFacebook getLoginPopupFacebook() {
        return (loginPopupFacebook == null) ? loginPopupFacebook = new LoginPopupFacebook() : loginPopupFacebook;
    }

    public LoginPopupVKontakte getLoginPopupVKontakte() {
        return (loginPopupVKontakte == null) ? loginPopupVKontakte = new LoginPopupVKontakte() : loginPopupVKontakte;
    }

    public LoginPopupOdnoklassniki getLoginPopupOdnoklassniki() {
        return (loginPopupOdnoklassniki == null) ? loginPopupOdnoklassniki = new LoginPopupOdnoklassniki() : loginPopupOdnoklassniki;
    }

    public CartPage getCartPage() {
        return (cartPage == null) ? cartPage = new CartPage() : cartPage;
    }

    public LoginPopup getLoginPopup() {
        return (loginPopup == null) ? loginPopup = new LoginPopup() : loginPopup;
    }

    public ProductPage getProductPage() {
        return (productPage == null) ? productPage = new ProductPage() : productPage;
    }


}
