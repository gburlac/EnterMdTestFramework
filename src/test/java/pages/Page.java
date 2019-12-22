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
    CadouPentruEaPage cadouPentruEaPage;
    CartPage cartPage;
    LoginPopup loginPopup;
    LoginPopupFacebook loginPopupFacebook;
    LoginPopupVKontakte loginPopupVKontakte;
    LoginPopupOdnoklassniki loginPopupOdnoklassniki;
    ProductPage productPage;
    ToateCategoriilePage toateCategoriilePage;
    ElectrocasnicePage electrocasnicePage;
    CastiPage castiPage;
    CommonSteps commonSteps;
    ScenarioContext scenarioContext;
    ProductListPage productListPage;
    UserPage userPage;
    ComparingPage comparingPage;

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

    public CadouPentruEaPage getCadouPentruEaPage() {
        return (cadouPentruEaPage == null) ? cadouPentruEaPage = new CadouPentruEaPage() : cadouPentruEaPage;
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

    public ToateCategoriilePage getToateCategoriilePage() {
        return (toateCategoriilePage == null) ? toateCategoriilePage = new ToateCategoriilePage() : toateCategoriilePage;
    }

    public ElectrocasnicePage getElectrocasnicePage() {
        return (electrocasnicePage == null) ? electrocasnicePage = new ElectrocasnicePage() : electrocasnicePage;
    }

    public ProductListPage getProductListPage() {
        return (productListPage == null) ? productListPage = new ProductListPage() : productListPage;
    }

    public CastiPage getCastiPage() {
        return (castiPage == null) ? castiPage = new CastiPage() : castiPage;
    }

    public ComparingPage getComparingPage() {
        return (comparingPage == null) ? comparingPage = new ComparingPage() : comparingPage;
    }

}
