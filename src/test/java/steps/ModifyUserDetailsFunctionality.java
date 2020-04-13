package steps;

import java.util.Map;

import org.apache.log4j.Logger;

import context.ScenarioContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import enums.Context;
import pages.MainPage;
import pages.Page;
import pages.UserPage;

public class ModifyUserDetailsFunctionality {

    Page page = new Page();

    UserPage userPage = page.getUserPage();

    MainPage mainPage = page.getMainPage();

    Logger log = Logger.getLogger(ModifyUserDetailsFunctionality.class);

    @When("user goes to user account details")
    public void goToAccountDetails() {
        mainPage.goToUserAccountDetails();
        log.info("User account details page is displayed.");
    }

    @When("^edit user details$") // leave
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
        System.out.println("setted password: " + ScenarioContext.getContext(Context.CHANGED_PASSWORD));
        userPage.confirmPasswordField.clear();
        userPage.confirmPasswordField.sendKeys((dataList.get("Confirma_parola")));
        userPage.phoneField.clear();
        userPage.phoneField.sendKeys(dataList.get("Phone"));
        userPage.cityField.clear();
        userPage.cityField.sendKeys(dataList.get("City"));
        userPage.saveChanges();
        Thread.sleep(10000);
        //        userPage.waitNotifications();
        log.info("User details are updated.");
    }
}
