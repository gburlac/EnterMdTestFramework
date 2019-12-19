package pages;

import enums.Context;
import context.ScenarioContext;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

import static junit.framework.Assert.assertTrue;

public class ProductListPage extends Page {
    @FindBy(xpath = "//*[@id=\"pagination_contents\"]/div[4]/div[5]/div/div[2]/form/div/div[4]/div/div[3]")
    WebElement product1AddToCompareButton;

    @FindBy(xpath = "//*[@id=\"pm_compare_3262\"]/a/span")
    WebElement compareButton;

    @FindBy(xpath = "//div[@class='ty-grid-list__image']")
    List<WebElement> productsOnPageList;

    @FindBy(xpath = "//form[contains(@name,'product_form')]//div[@class='ty-grid-list__item-name product-title']//span")
    List<WebElement> productnameLabel;

    @FindBy(xpath = "//*[@id=\"pagination_contents\"]/div[2]/div/div[1]/div[2]/div[2]/select")
    WebElement sortingByDropdown;

    @FindBy(xpath = "//*[@id=\"content_376_239\"]/li[2]//ul//li//a")
    List<WebElement> filterCheckboxName;

    @FindBy(xpath = "//*[@id=\"content_376_239\"]/li[2]//ul//li//a//input")
    List<WebElement> filterCheckbox;
//    String selectedCategory;
    Page page = new Page();
    public void product1AddToCompareButtonClick() {
        product1AddToCompareButton.click();
    }

    public void compareButtonClick() {
        compareButton.click();
    }

    public void openProductPageByID() {
        int a = 0;
        Random random = new Random();
        a = random.ints(0, (20 + 1)).findFirst().getAsInt();

//        scenarioContext.setContext(Context.PRODUCT_NAME,productNameLabel.getText());
        productsOnPageList.get(a).click();
    }
    public void filterAssert() {
        String productValue;
        for (WebElement webElement : productnameLabel) {
            productValue = webElement.getText();
//            assertTrue(value.contains(selectedCategory));
            String filterValue = (String) ScenarioContext.getContext(Context.SELECTED_MANUFACTURER_FILTER);
            Assert.assertTrue(productValue.contains(filterValue));
        }
    }
    public void changingCountOfItemsOnPage(String dropdownValue){
        Select changingCountOfItems = new Select(sortingByDropdown);
        changingCountOfItems.selectByVisibleText(dropdownValue);
    }
    public void checkFilterCheckbox(int i) {
//        selectedCategory = filterCheckboxName.get(i).getText();
        ScenarioContext.setContext(Context.SELECTED_MANUFACTURER_FILTER,filterCheckboxName.get(i).getText());
        System.out.println(filterCheckboxName.get(i).getText());
        System.out.println(ScenarioContext.getContext(Context.SELECTED_MANUFACTURER_FILTER));
        filterCheckbox.get(i).click();
    }
    public void checkCountOfItemsOnPage(int count){
        ScenarioContext.setContext(Context.COUNT_OF_ITEMS_ON_THE_PAGE, productsOnPageList.size());
        Assert.assertTrue(productsOnPageList.size() == count);
    }

}
