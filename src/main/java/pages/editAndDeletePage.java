package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class editAndDeletePage {
    public editAndDeletePage() {

        PageFactory.initElements(BrowserUtils.getDriver(), this);}

        @FindBy(xpath = "(//button[@class='btn btn-sm-outline-warning'])[1]")
                public WebElement editBtn;

    @FindBy(xpath = "(//textarea[@name='newText'])[1]")
    public WebElement fieldBox;

    @FindBy(xpath = "//button[@class='btn btn-sm-outline-success']")
    public WebElement checkBtn;

    @FindBy(xpath = "1    test statement1   ")
    public WebElement boxEdited;

    @FindBy(xpath = "(//button[@class='btn btn-outline-danger ml-1'])[1]")
    public WebElement trashBtn;

    }
