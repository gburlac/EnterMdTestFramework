package pages;

import org.openqa.selenium.support.PageFactory;
import util.*;

public class Page {
    Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
