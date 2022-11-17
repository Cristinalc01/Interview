package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class UserFormPage {
    public UserFormPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

@FindBy(xpath = "//u[normalize-space()='Manage Access']")
    public WebElement manageBtn;

    @FindBy(id= "Role")
    public WebElement role;

    @FindBy(id= "Batch")
    public WebElement batch;

    @FindBy(xpath= "//form[@class='form-inline my-2 my-lg-0']//button[@type='submit']")
    public WebElement filterBtn;

     @FindBy(xpath = "(//button[@type='button'][normalize-space()='Action'])[1]")
    public WebElement actionBtn;

     @FindBy(xpath = "(//table[@class='table table-striped table-hover'])[1]")
    public WebElement table;

     @FindBy(xpath = "//u[normalize-space()='Manage Access']")
    public WebElement ManageAccBtn;
}
