package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Driver;
import util.TakeScreens;

public class LoginPopupVKontakte extends Page {

    Logger log = Logger.getLogger(LoginPopupVKontakte.class);

    @FindBy(xpath = "//div[@class='box_msg_gray box_msg_padded']//b[contains(text(),'ВКонтакте')]")
    private WebElement vkElement;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emaiField;
    @FindBy(xpath = "//input[@name='pass']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;


    public void showAssertsVKLoginPopup() {
        try {
            Assert.assertTrue(vkElement.isDisplayed());
            log.info(">>> Login via VKontakte pop up window is displayed! <<<");
        } catch (Exception e) {
            log.info(">>> Login via VKontakte pop up window is not displayed! <<<");
        }
    }

    public void inputEmail(String email) throws Exception {
        showAssertsVKLoginPopup();
        TakeScreens.takeScreenshot(Driver.getDriver(), "login_popup_window_VK");
        if (emaiField.isDisplayed()) {
            emaiField.click();
            emaiField.clear();
            emaiField.sendKeys(email);
        } else {
            throw new Exception(">>>>> Cannot find EMAIL field! <<<<<");
        }
    }

    public void inputPassword(String password) throws Exception {
        if (passwordField.isDisplayed()) {
            passwordField.click();
            passwordField.clear();
            passwordField.sendKeys(password);
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
