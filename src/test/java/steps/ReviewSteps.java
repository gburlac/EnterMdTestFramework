package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pages.*;
import util.Driver;
import util.TakeScreens;
import util.Waiter;

public class ReviewSteps {
    Page page = new Page();
    ProductPage productPage = page.getProductPage();
    Logger log = Logger.getLogger(ReviewSteps.class);
    @And("^clicks on \\[Write review\\] button$")
    public void clicksOnWriteReviewButton() {
        productPage.writeReviewButtonClick();
        log.info("Write review button is clicked");
        TakeScreens.takeScreenshot(Driver.getDriver(),  "Write review button is clicked");
    }

    @Then("^Appears form with 'Name', 'Email' and 'Message' fields, 'stars'-bar for selecting quality, and \\[Send\\] button$")
    public void appearsFormWithNameEmailAndMessageFieldsStarsBarForSelectingQualityAndSendButton() {
        productPage.reviewFormCheck();
        log.info("'Name', 'Email' and 'Message' fields, 'stars'-bar for selecting quality, and \\[Send\\] button are displayed");
    }

    @When("^User fills in the (.*?) (.*?) (.*?) fields and submit$")
    public void userFillInAllFieldsValidDataAndClickSendButton(String name, String email, String message) {
            productPage.reviewFormComplete(name, email, message);
            log.info("Data is introduced, send review buton is clicked");
            TakeScreens.takeScreenshot(Driver.getDriver(),  "Write review button is clicked");
    }

    @Then("^Success message appears$")
    public void successMessageAppears() {
        productPage.reviewSentNotificationCheck();
    }
}
