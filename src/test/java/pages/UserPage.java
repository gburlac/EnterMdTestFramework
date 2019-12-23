package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Waiter;

public class UserPage extends Page {

    Logger log = Logger.getLogger(UserPage.class);

    @FindBy(xpath = "//input[@id='elm_6']")
    public WebElement prenumeField;
    @FindBy(xpath = "//input[@id='elm_7']")
    public WebElement numeField;
    @FindBy(xpath = "//input[@id='password1']")
    public WebElement passwordField;
    @FindBy(xpath = "//input[@id='password2']")
    public WebElement confirmPasswordField;
    @FindBy(xpath = "//input[@id='elm_31']")
    public WebElement phoneField;
    @FindBy(xpath = "//input[@id='elm_23']")
    public WebElement cityField;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement saveButton;
    @FindBy(xpath = "//div[@class='cm-notification-container notification-container']")
    WebElement notificationContainer;

    public void assertProfileUpdated() throws Exception {
        try {
            Assert.assertTrue(notificationContainer.isDisplayed());
            log.info("User details updated successfully!");
        } catch (Exception e) {
            throw new Exception("An error occur while updating user details!");
        }
    }

    public void waitNotifications() {
        Waiter.waitByXPath("//sdiv[@class='support-trigger-round-wrapper']");
    }

    public void saveChanges() throws Exception {
        try {
            saveButton.isEnabled();
            saveButton.click();
        } catch (Exception e) {
            throw new Exception("Cannot click SAVE button.");
        }
    }
}
