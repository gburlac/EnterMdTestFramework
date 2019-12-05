package steps;

import cucumber.api.java.en.When;
import pages.MainPage;

public class WhenSteps {
    MainPage mainPage = new MainPage();
//    @When("^Press on '(.*)' category$")
    @When("^Press on electrocasnice category$")
    public void pressOnCategory() {
        mainPage.ClickOnelectroCasniceCategory();
//        mainPage.electroCasniceCategoryIsDisplayed();
    }
}
