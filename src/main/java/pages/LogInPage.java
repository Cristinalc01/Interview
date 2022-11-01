package pages;

import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LogInPage {
     public LogInPage(){

     PageFactory.initElements(BrowserUtils.getDriver(), this);
}

}

