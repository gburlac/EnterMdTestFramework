package pages;

import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class Page {
    public Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    MainPage mainPage;
    CadouPentruEa cadouPentruEa;
    CartPage cartPage;
    LoginPopup loginPopup;
    MainPageAsLogged mainPageAsLogged;
    ProductPage productPage;
    Smartphones smartphones;
    ToateCategoriile toateCategoriile;
    Electrocasnice electrocasnice;

    public MainPage getMainPage() {
        return (mainPage == null) ? mainPage = new MainPage() : mainPage;
    }

    public CadouPentruEa getCadouPentruEa() {
        return (cadouPentruEa == null) ? cadouPentruEa = new CadouPentruEa() : cadouPentruEa; }

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

    public ToateCategoriile toateCategoriile() {
        return (toateCategoriile == null) ? toateCategoriile = new ToateCategoriile() : toateCategoriile; }

    public Electrocasnice getElectrocasnice() {
        return (electrocasnice == null) ? electrocasnice = new Electrocasnice() : electrocasnice; }
}
