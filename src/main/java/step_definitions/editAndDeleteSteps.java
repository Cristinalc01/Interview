package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.UserFormPage;
import pages.editAndDeletePage;
import utils.BrowserUtils;

import java.util.List;

public class editAndDeleteSteps implements CommonPage {

   editAndDeletePage page;

   public editAndDeleteSteps() {
       page = new editAndDeletePage();}


    @When("I click a button edit in Do's")
    public void iClickAButtonEditInDoS() {
        BrowserUtils.click(page.editBtn);
    }


    @When("I edit writing test statement in statement")
    public void iEditWritingTestStatementInStatement() {
       BrowserUtils.sendKeys(page.fieldBox,"test Statement1");
    }

    @When("I click on check")
    public void iClickOnCheck() {
       BrowserUtils.click(page.checkBtn);
        
    }

    @Then("I should see my edition")
    public void iShouldSeeMyEdition() {
        BrowserUtils.assertEquals(page.boxEdited.getText(), "1       test statement1");

    }

    @When("I click in the trash button")
    public void iClickInTheTrashButton() {
       BrowserUtils.click(page.trashBtn);
        
    }

    @Then("it should erase")
    public void itShouldErase() {
        List<WebElement> each = BrowserUtils.getDriver().findElements(By.xpath("//td[text()='ssdda']"));
        for (WebElement list : each) {
            BrowserUtils.assertFalse(list.equals("ssdda"));

        }

    }

}
