package pages;

import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class Page {
    Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
