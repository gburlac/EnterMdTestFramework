package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Driver;
import util.TakeScreens;

public class LoginPopupOdnoklassniki extends Page {

    Logger log = Logger.getLogger(LoginPopupOdnoklassniki.class);

    @FindBy(xpath = "//div[@class='ext-widget_h_tx']")
    private WebElement odnoklassnikiElement;
    @FindBy(xpath = "//input[@id='field_email']")
    private WebElement inputEmail;
    @FindBy(xpath = "//input[@id='field_password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//input[@class='button-pro __wide form-actions_yes']")
    private WebElement loginButton;


    public void showAssertOdnoklassnikiLoginPopup() {
        try {
            Assert.assertTrue(odnoklassnikiElement.isDisplayed());
            log.info(">>> Login via Odnoklassniki pop up window is displayed! <<<");
        } catch (Exception e) {
            log.info(">>> Login via Odnoklassniki pop up window is not displayed! <<<");
        }
    }

    public void inputEmail(String email) throws Exception {
        showAssertOdnoklassnikiLoginPopup();
        TakeScreens.takeScreenshot(Driver.getDriver(), "login_popup_window_ODN");
        if (inputEmail.isDisplayed()) {
            inputEmail.click();
            inputEmail.clear();
            inputEmail.sendKeys(email);
        } else {
            throw new Exception(">>>>> Cannot find EMAIL field! <<<<<");
        }
    }

    public void inputPassword(String password) throws Exception {
        if (inputPassword.isDisplayed()) {
            inputPassword.click();
            inputPassword.clear();
            inputPassword.sendKeys(password);
            TakeScreens.takeScreenshot(Driver.getDriver(), "login_and_password_filled");
        } else {
            throw new Exception(">>>>> Cannot find PASSWORD field! <<<<<");
        }
    }

    public void login() throws Exception {
        if (loginButton.isDisplayed()) {
            loginButton.click();
        } else {
            throw new Exception(">>>>> Cannot find LOGIN button! <<<<<");
        }
    }


}
