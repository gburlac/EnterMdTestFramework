package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.MainPage;

public class ThenSteps {
    MainPage mainPage = new MainPage();

    @Then("^electrocasnice category is displayed$")
    public void electrocasniceCategoryIsDisplayed() {
        mainPage.electroCasniceCategoryIsDisplayed();
    }

    @And("^tehnica de bucatarie part is displayed$")
    public void tehnicaDeBucatariePartIsDisplayed() {
        mainPage.tehnicaDeBucatarieLabel();
    }

    @And("^aparate de uz casnice part is displaed$")
    public void aparateDeUzCasnicePartIsDisplaed() {
        mainPage.aparateDeUzCasnicePart();
    }

    @And("^ingrijire personala part is displayed$")
    public void ingrijirePersonalaPartIsDisplayed() {
        mainPage.ingrijirePersonala();
    }
}
