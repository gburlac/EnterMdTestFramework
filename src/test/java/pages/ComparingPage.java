package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ComparingPage extends Page{
    @FindBy (xpath = "//div[@class='pm-product-descr']")
    List<WebElement> addToCartButtonsList;

    public void assertNumberOfAddToCartButtons(){
        Assert.assertEquals(2, addToCartButtonsList.size());
    }
}
