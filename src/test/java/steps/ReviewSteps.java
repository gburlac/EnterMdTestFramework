package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pages.*;
import util.Waiter;

public class ReviewSteps {
    Page page = new Page();
    ProductPage productPage = page.getProductPage();
    Logger log = Logger.getLogger(ReviewSteps.class);
    @And("^clicks on \\[Write review\\] button$")
    public void clicksOnWriteReviewButton() {
        productPage.writeReviewButtonClick();
        log.info("Write review button is clicked");
    }

    @Then("^Appears form with 'Name', 'Email' and 'Message' fields, 'stars'-bar for selecting quality, and \\[Send\\] button$")
    public void appearsFormWithNameEmailAndMessageFieldsStarsBarForSelectingQualityAndSendButton() {
        productPage.reviewFormCheck();
        log.info("'Name', 'Email' and 'Message' fields, 'stars'-bar for selecting quality, and \\[Send\\] button are displayed");
    }

    @When("^User fill in all fields valid data and click \\[Send\\] button$")
    public void userFillInAllFieldsValidDataAndClickSendButton() {
            productPage.reviewFormComplete();
            log.info("Write review button is clicked");
        }

    @Then("^Success message appears$")
    public void successMessageAppears() {
        productPage.reviewSentNotificationCheck();
    }
}
