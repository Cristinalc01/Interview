package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class DashBoardPage {

    public DashBoardPage() {

        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
  @FindBy(xpath = "//input[@placeholder='New dashboard']")
      public WebElement dashbd;

    @FindBy(xpath = "//button[normalize-space()='+ Add']")
    public WebElement add;

    @FindBy(xpath = "//button[normalize-space()='Java']//img")
    public WebElement dashbword;

}