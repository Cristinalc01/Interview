package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class logOutPage {

    public logOutPage() {


        PageFactory.initElements(BrowserUtils.getDriver(), this);}

        @FindBy(xpath = "//u[normalize-space()='Sign out']")
        public WebElement logOutBtn;

    @FindBy(xpath ="" )
    public WebElement logPage;
    }
