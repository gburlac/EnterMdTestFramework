package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.Driver;

import static junit.framework.Assert.assertTrue;

public class MainPage extends Page {

    @FindBy(xpath = "//*[@id=\"iam_search\"]")
    private WebElement searchBar;
    @FindBy(xpath = "//*[@id=\"iam_search_products\"]/li[2]/a/div/div[2]/div[1]")
    private WebElement selectOnePlus;
    @FindBy(xpath = "//button[@id='button_wishlist_9854998549']")
    private WebElement buttonAddToWishlist;
    @FindBy(xpath = "//div[contains(@class, 'ty-float-right')]/a[contains(@class, 'ty-btn ty-btn__secondary')]")
    private WebElement buttonCheckWischlist;
    @FindBy(xpath = "//*[@id=\"det_img_98549\"]")
    private WebElement buttonCheckProductInWischlist;
    @FindBy(xpath = "//*[@id=\"megamenubutton\"]/button[2]")
    private WebElement allCategoriesDropdown;
    @FindBy(xpath = "//*[@id=\"megamenubutton\"]/div/div/div/div[1]/ul/li[1]/a")
    private WebElement allCategoriesDropdownTelephonesCategory;
    @FindBy(xpath = "//*[@id=\"megamenubutton\"]/div/div/div/div[2]/div/div[1]/div[1]/ul/li/a")
    private WebElement allCategoriesDropdownTelephonesCategorySmartphones;
    Actions actions = new Actions(Driver.getDriver());
    public void assertProductInWischlist() throws InterruptedException {
        assertTrue(buttonCheckProductInWischlist.isDisplayed());
    }

    public void clickbuttonCheckWischlist() {
        buttonCheckWischlist.click();
    }

    public void clickbuttonAddToWishlist() {
        buttonAddToWishlist.click();
    }

    public void clickOnSelectOnePlus() {
        selectOnePlus.click();
    }

    public void searchBarMethod() {
        searchBar.sendKeys("Oneplus");
    }
    public void selectSmartphonesCategory(){
        allCategoriesDropdown.click();
        allCategoriesDropdownTelephonesCategory.click();
        allCategoriesDropdownTelephonesCategorySmartphones.click();
        }

}


