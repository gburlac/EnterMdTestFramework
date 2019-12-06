package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.MainPage;

public class WhenStep {
    MainPage mainPage = new MainPage();
       @When("^press on electrocasnice category$")
    public void pressOnCategory() {
           mainPage.ClickOnelectroCasniceCategory();
    }
}
