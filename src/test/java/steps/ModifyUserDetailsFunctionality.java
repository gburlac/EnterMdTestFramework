package steps;

import context.ScenarioContext;
import cucumber.api.DataTable;
import enums.Context;
import cucumber.api.java.en.When;
import pages.MainPage;
import pages.UserPage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModifyUserDetailsFunctionality {
    UserPage userPage = new UserPage();
    MainPage mainPage = new MainPage();

    @When("user goes to user account details")
    public void goToAccountDetails() throws Exception {
        mainPage.goToUserAccountDetails();
    }

    @When("^edit user details$")
    public void editUserDetails(DataTable dataTable) throws Exception {
        Map<String, String> dataList = dataTable.asMap(String.class, String.class);
        userPage.prenumeField.clear();
        userPage.prenumeField.sendKeys(dataList.get("Prenume"));
        userPage.numeField.clear();
        userPage.numeField.sendKeys(dataList.get("Nume"));
        userPage.passwordField.clear();
        userPage.passwordField.sendKeys(dataList.get("Parola"));
        ScenarioContext.setContext(Context.CHANGED_PASSWORD, dataList.get("Parola"));
        System.out.println("getted password: " + dataList.get("Parola"));
        System.out.println("setted password: " + ScenarioContext.getContex(Context.CHANGED_PASSWORD));
        userPage.confirmPasswordField.clear();
        userPage.confirmPasswordField.sendKeys((dataList.get("Confirma_parola")));
        userPage.phoneField.clear();
        userPage.phoneField.sendKeys(dataList.get("Phone"));
        userPage.cityField.clear();
        userPage.cityField.sendKeys(dataList.get("City"));
        userPage.saveChanges();
        Thread.sleep(10000);
//        userPage.waitNotifications();
    }
}
