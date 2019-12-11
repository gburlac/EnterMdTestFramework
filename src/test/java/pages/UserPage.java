package pages;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class UserPage extends Page {

    @FindBy(xpath = "//input[@id='elm_6']")
    WebElement prenumeField;
    @FindBy(xpath = "//input[@id='elm_7']")
    WebElement numeField;
    @FindBy(xpath = "//input[@id='password1']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id='password2']")
    WebElement confirmPasswordField;
    @FindBy(xpath = "//input[@id='elm_31']")
    WebElement phoneField;
    @FindBy(xpath = "//input[@id='elm_23']")
    WebElement cityField;
//    @FindBy(xpath = "//body/div/div/div/div/div/div/div/div/div/div/form/div[2]/button[1]")
    @FindBy(xpath = "//button[contains(@type, 'submit')]")
    WebElement saveButton;

    public void enterInformatiiDeContactData(){

    }

    public void enterSecuritateData(){

    }

    public void enterAdresaDeLivrareData(){

    }

    public void saveChanges(){
        saveButton.click();
    }





}
