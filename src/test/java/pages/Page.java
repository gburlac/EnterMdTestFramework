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
    SmartphonesCategory smartphonesCategory;
    ToateCategoriilePage toateCategoriilePage;
    ElectrocasnicePage electrocasnicePage;

    public MainPage getMainPage() {
        return (mainPage == null) ? mainPage = new MainPage() : mainPage;
    }

    public CadouPentruEaPage getCadouPentruEaPage() {
        return (cadouPentruEaPage == null) ? cadouPentruEaPage = new CadouPentruEaPage() : cadouPentruEaPage; }

    public CartPage getCartPage() {
        return (cartPage == null) ? cartPage = new CartPage() : cartPage; }

    public LoginPopup getLoginPopup() {
        return (loginPopup == null) ? loginPopup = new LoginPopup() : loginPopup; }

    public MainPageAsLogged getMainPageAsLogged() {
        return (mainPageAsLogged == null) ? mainPageAsLogged = new MainPageAsLogged() : mainPageAsLogged; }

    public ProductPage getProductPage() {
        return (productPage == null) ? productPage = new ProductPage() : productPage; }

    public Smartphones getSmartphones() {
        return (smartphones == null) ? smartphones = new Smartphones() : smartphones; }

    public SmartphonesCategory getSmartphonesCategory() {
        return (smartphonesCategory == null) ? smartphonesCategory = new SmartphonesCategory() : smartphonesCategory; }

    public ToateCategoriilePage toateCategoriile() {
        return (toateCategoriilePage == null) ? toateCategoriilePage = new ToateCategoriilePage() : toateCategoriilePage; }

    public ElectrocasnicePage getElectrocasnicePage() {
        return (electrocasnicePage == null) ? electrocasnicePage = new ElectrocasnicePage() : electrocasnicePage; }
}
