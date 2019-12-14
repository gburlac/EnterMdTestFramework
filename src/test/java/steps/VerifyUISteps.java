package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pages.CadouPentruEa;
import pages.CastiPage;
import pages.Electrocasnice;
import pages.ToateCategoriile;
import util.Driver;
import util.TakeScreens;

public class VerifyUISteps {

    Electrocasnice electrocasnice = new Electrocasnice();
    static Logger log = Logger.getLogger(VerifyUISteps.class);


    @When("^press on electrocasnice category$")
    public void pressOnCategory() {
        electrocasnice.ClickOnelectroCasniceCategory();
        log.info("Press on electrocasnice category");
    }
    @Then("^electrocasnice category is displayed$")
    public void electrocasniceCategoryIsDisplayed() {
        electrocasnice.electroCasniceCategory();
        TakeScreens.takeScreenshot(Driver.getDriver(), "electrcasnice");
        log.info("Electrocasnice category is displayed");
    }
    @Then("^tehnica de bucatarie part is displayed$")
    public void tehnicaDeBucatariePartIsDisplayed() {
        electrocasnice.tehnicaDeBucatarieLabel();
        TakeScreens.takeScreenshot(Driver.getDriver(), "tehnicaDeBucatarieLabel");
        log.info("Tehnica de bucatarie part is displayed");
    }
    @Then("^aparate de uz casnice part is displaed$")
    public void aparateDeUzCasnicePartIsDisplaed() {
        electrocasnice.aparateDeUzCasnicePart();
        TakeScreens.takeScreenshot(Driver.getDriver(), "aparateDeUzCasnicePartIsDisplaed");
        log.info("Aparate de uz casnice part is displaed");
    }

    @Then("^ingrijire personala part is displayed$")
    public void ingrijirePersonalaPartIsDisplayed() {
        electrocasnice.ingrijirePersonala();
        TakeScreens.takeScreenshot(Driver.getDriver(), "ingrijirePersonalaPartIsDisplayed");
        TakeScreens.takeFullScreenshot(Driver.getDriver(),"electrocasniceFullPage");
        log.info("Ingrijire personala part is displayed");
    }


}
