package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.Electrocasnice;
import pages.MainPage;

import java.util.logging.Logger;

public class WhenStep {

    MainPage mainPage = new MainPage();
    Electrocasnice electrocasnice = new Electrocasnice();
       @When("^press on electrocasnice category$")
    public void pressOnCategory() {
           electrocasnice.ClickOnelectroCasniceCategory();
    }

    @When("^input in search bar a OnePlus$")
    public void inputInSearchBarAOnePlus() {
           mainPage.searchBarMethod();
    }
}
