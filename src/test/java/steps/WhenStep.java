package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pages.CadouPentruEa;
import pages.Electrocasnice;
import pages.MainPage;
import util.Driver;

import java.util.concurrent.TimeUnit;

public class WhenStep {

    MainPage mainPage = new MainPage();
    Electrocasnice electrocasnice = new Electrocasnice();
    CadouPentruEa cadouPentruEa = new CadouPentruEa();
    static Logger log = Logger.getLogger(WhenStep.class);

    @When("^press on electrocasnice category$")
    public void pressOnCategory() {
        electrocasnice.ClickOnelectroCasniceCategory();
    }

    @When("^input in search bar a OnePlus$")
    public void inputInSearchBarAOnePlus() {
        mainPage.searchBarMethod();
    }

    @When("^select OnePlus (\\d+) Pro device$")
    public void selectOnePlusProDevice(int arg0) throws InterruptedException {
//        Thread.sleep(5000);
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.clickOnSelectOnePlus();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("^add to wishlist$")
    public void addToWishlist() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.clickbuttonAddToWishlist();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("^go to wishlist$")
    public void goToWishlist() throws InterruptedException {
//        Thread.sleep(5000);
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.clickbuttonCheckWischlist();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("^go to cadou pentru ea category$")
    public void goToCadouPentruEaCategory() {
        cadouPentruEa.clickCadouPentruEaLink();
        cadouPentruEa.clickCadouPentruEaLink();

    }

    @When("^select  Bobby Compact anti-theft product$")
    public void selectBobbyCompactAntiTheftProduct() throws InterruptedException {
        Thread.sleep(4000);
        cadouPentruEa.clickProductBobyCompact();
    }

    @When("^select color to blue$")
    public void selectColorToBlue() {
        cadouPentruEa.clickChangeColorToBlueDark();
    }

    @When("^add to cart$")
    public void addToCart() {
        cadouPentruEa.clickButtonAddToCart();
    }

    @When("^go to cart$")
    public void goToCart() {
        cadouPentruEa.clickButtonGoToCart();
    }
}
