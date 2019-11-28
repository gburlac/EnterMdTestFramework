package steps;

import cucumber.api.java.en.When;
import pages.EnterPageGB;

public class WhenSteps {

    @When("^Press on category$")
    public void pressOnCategory() {
        EnterPageGB.electroCasniceCategory();
    }
}
