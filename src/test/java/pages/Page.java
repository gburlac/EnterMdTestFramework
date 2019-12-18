package pages;

import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class Page {
    public Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    MainPage mainPage;
    CadouPentruEaPage cadouPentruEaPage;
    CartPage cartPage;
    LoginPopup loginPopup;
    MainPageAsLogged mainPageAsLogged;
    ProductPage productPage;
    Smartphones smartphones;
    ToateCategoriilePage toateCategoriilePage;
    ElectrocasnicePage electrocasnicePage;
    ProductListPage productListPage;
    CastiPage castiPage;

    public MainPage getMainPage() {
        return (mainPage == null) ? mainPage = new MainPage() : mainPage;
    }

    public CadouPentruEaPage getCadouPentruEaPage() {
        return (cadouPentruEaPage == null) ? cadouPentruEaPage = new CadouPentruEaPage() : cadouPentruEaPage;
    }

    public CartPage getCartPage() {
        return (cartPage == null) ? cartPage = new CartPage() : cartPage;
    }

    public LoginPopup getLoginPopup() {
        return (loginPopup == null) ? loginPopup = new LoginPopup() : loginPopup;
    }

    public MainPageAsLogged getMainPageAsLogged() {
        return (mainPageAsLogged == null) ? mainPageAsLogged = new MainPageAsLogged() : mainPageAsLogged;
    }

    public ProductPage getProductPage() {
        return (productPage == null) ? productPage = new ProductPage() : productPage;
    }

    public Smartphones getSmartphones() {
        return (smartphones == null) ? smartphones = new Smartphones() : smartphones;
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
}
