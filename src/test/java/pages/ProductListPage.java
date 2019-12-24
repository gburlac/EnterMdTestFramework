package pages;

import enums.Context;
import context.ScenarioContext;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import util.Waiter;
import java.util.List;
import java.util.Random;

public class ProductListPage extends Page {
    @FindBy(xpath = "//div[@class='ty-compare']")
    WebElement compareButton;

    @FindBy(xpath = "//a[@class='ty-btn ty-btn__text picon-compare-two  cm-ajax cm-ajax-full-render text-button ']")
    List<WebElement> addProductToCompareButton;

    @FindBy(xpath = "//div[@class='ty-grid-list__image']")
    List<WebElement> productsOnPageList;

    @FindBy(xpath = "//form[contains(@name,'product_form')]//div[@class='ty-grid-list__item-name product-title']//span")
    List<WebElement> productNameLabel;

    @FindBy(xpath = "//*[@id=\"pagination_contents\"]/div[2]/div/div[1]/div[2]/div[2]/select")
    WebElement sortingByDropdown;

    @FindBy(xpath = "//*[@id=\"content_376_239\"]/li[2]//ul//li//a")
    List<WebElement> filterCheckboxName;

    @FindBy(xpath = "//*[@id=\"content_376_239\"]/li[2]//ul//li//a//input")
    List<WebElement> filterCheckbox;
    Page page = new Page();

    public void openProductPageByID() {
        int a = 0;
        Random random = new Random();
        a = random.ints(0, productNameLabel.size()-1).findFirst().getAsInt();
        ScenarioContext.setContext(Context.PRODUCT_NAME,productNameLabel.get(a).getText());
        productsOnPageList.get(a).click();
        Waiter.waitByXPath("//span//span//a");
    }
    public void filterAssert() {
        String productValue;
        for (WebElement webElement : productNameLabel) {
            productValue = webElement.getText();
//            assertTrue(value.contains(selectedCategory));
            String filterValue = (String) ScenarioContext.getContext(Context.SELECTED_MANUFACTURER_FILTER);
            Assert.assertTrue(productValue.contains(filterValue));
        }
    }

    public void checkFilterCheckbox(int i) {
        ScenarioContext.setContext(Context.SELECTED_MANUFACTURER_FILTER,filterCheckboxName.get(i).getText());
        filterCheckbox.get(i).click();
    }

    public void addingProductsInCompareList(int i) {
        addProductToCompareButton.get(i).click();
        Waiter.waitByXPathUntilDissapear("//div[@id=\"ajax_loading_box\"]");
        Waiter.waitByXPathUntilDissapear("//div[@class='ty-product-notification__item clearfix']");
    }
    public void compareButtonClick()
    {
        compareButton.click();
        Waiter.waitByXPath("//span[@class='support-trigger-round-icon support-icon-comments-o']");
    }

    public void changingCountOfItemsOnPage(String dropdownValue){
        Select changingCountOfItems = new Select(sortingByDropdown);
        changingCountOfItems.selectByVisibleText(dropdownValue);
    }

    public void checkCountOfItemsOnPage(int count){
        ScenarioContext.setContext(Context.COUNT_OF_ITEMS_ON_THE_PAGE, productsOnPageList.size());
        Assert.assertEquals(productsOnPageList.size(), count);
    }
}
