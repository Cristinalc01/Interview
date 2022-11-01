package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class DashBoardPage {

    public DashBoardPage() {

        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
        @FindBy(xpath = "//input[@name='question']")
        public WebElement question;

    @FindBy(xpath = "//p[text()='what is java?   ']")
    public WebElement dasbd;

    }
