package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pages.ElectrocasnicePage;
import util.Driver;
import util.TakeScreens;

public class VerifyUISteps {

    ElectrocasnicePage electrocasnicePage = new ElectrocasnicePage();
    static Logger log = Logger.getLogger(VerifyUISteps.class);


    @When("^press on electrocasnice category$")
    public void pressOnCategory() {
        electrocasnicePage.ClickOnelectroCasniceCategory();
        log.info("Press on electrocasnice category");
    }

    @Then("^electrocasnice category is displayed$")
    public void electrocasniceCategoryIsDisplayed() {
        electrocasnicePage.electroCasniceCategory();
        TakeScreens.takeScreenshot(Driver.getDriver(), "electrcasnice");
        log.info("Electrocasnice category is displayed");
    }

    @Then("^tehnica de bucatarie part is displayed$")
    public void tehnicaDeBucatariePartIsDisplayed() {
        electrocasnicePage.tehnicaDeBucatarieLabel();
        TakeScreens.takeScreenshot(Driver.getDriver(), "tehnicaDeBucatarieLabel");
        log.info("Tehnica de bucatarie part is displayed");
    }

    @Then("^aparate de uz casnice part is displaed$")
    public void aparateDeUzCasnicePartIsDisplaed() {
        electrocasnicePage.aparateDeUzCasnicePart();
        TakeScreens.takeScreenshot(Driver.getDriver(), "aparateDeUzCasnicePartIsDisplaed");
        log.info("Aparate de uz casnice part is displaed");
    }

    @Then("^ingrijire personala part is displayed$")
    public void ingrijirePersonalaPartIsDisplayed() {
        electrocasnicePage.ingrijirePersonala();
        TakeScreens.takeScreenshot(Driver.getDriver(), "ingrijirePersonalaPartIsDisplayed");
        TakeScreens.takeFullScreenshot(Driver.getDriver(),"electrocasniceFullPage");
        log.info("Ingrijire personala part is displayed");
    }


}
