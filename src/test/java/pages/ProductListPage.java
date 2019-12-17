package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListPage extends Page {
    @FindBy(xpath = "//*[@id=\"pagination_contents\"]/div[4]/div[5]/div/div[2]/form/div/div[4]/div/div[3]")
    WebElement product1AddToCompareButton;
    @FindBy(xpath = "//*[@id=\"pm_compare_3262\"]/a/span")
    WebElement compareButton;
    @FindBy(xpath = "//*[@id=\"pagination_contents\"]/div[4]/div[1]/div/div[2]/form/div/a/div[2]")
    WebElement product1OpenProductPage;

    public void product1AddToCompareButtonClick() {
        product1AddToCompareButton.click();
    }

    public void compareButtonClick() {
        compareButton.click();
    }

    public void product1OpenProductPageClick() {
        product1OpenProductPage.click();
    }
}
