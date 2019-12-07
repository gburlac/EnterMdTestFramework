package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.Assert.assertTrue;

public class MainPage extends Page {

    //find elements
    //*[@id="index"]/div[3]/div/div[1]/div/div/ul/li[1]/a
    //div[contains(@class, 'ty-wysiwyg-content')]/ul/li[1]/a

    @FindBy(xpath = "//*[@id=\"iam_search\"]")
    private WebElement searchBar;


    //method
    public void searchBarMethod() {
        searchBar.sendKeys("OnePlus");
    }


}
