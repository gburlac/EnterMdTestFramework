package pages;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends Page {

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
//    @FindBy(xpath = "//body/div/div/div/div/div/div/div/div/div/div/form/div[2]/button[1]")
    @FindBy(xpath = "//button[contains(@type, 'submit')]")
    public WebElement saveButton;

//    public void setPrenumeField() {
//    }
//
//    public void setNumeField() {
//    }
//
//    public void setPasswordField() {
//    }
//
//    public void setConfirmPasswordField() {
//    }
//
//    public void setPhoneField() {
//    }
//
//    public void setCityField() {
//    }
//
//    public void setSaveButton() {
//    }



}
