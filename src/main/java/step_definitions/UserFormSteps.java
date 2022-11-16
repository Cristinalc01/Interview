package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import okhttp3.internal.http.BridgeInterceptor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.UserFormPage;
import utils.BrowserUtils;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class UserFormSteps implements CommonPage {
    UserFormPage page;

    public UserFormSteps() {
        page = new UserFormPage();
    }

    @When("I click a button Manage Access")
    public void iClickAButtonManageAccess() {
        BrowserUtils.click(page.manageBtn);
    }

    @And("Verify following input fields are displayed:")
    public void verifyFollowingInputFieldsAreDisplayed(List<String> dataTable) {
        for (String each : dataTable) {
            BrowserUtils.isDisplayed(
                    BrowserUtils.getDriver().findElement(
                            By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, each))
                    )
            );
        }
    }


    @Then("Verify is {string} is displayed")
    public void verifyIsIsDisplayed(String select1) {
        BrowserUtils.isDisplayed(page.role);
    }

    @Then("Verify is {string} is displayedd")
    public void verifyIsIsDisplayedd(String select2) {
        BrowserUtils.isDisplayed(page.batch);
    }

    @When("I fill out the field new user DB:")
    public void iFillOutTheFieldNewUserDB(Map<String, String> map) {
        for (String key : map.keySet()) {
            BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(
                    String.format(XPATH_TEMPLATE_INPUT_FIELD, key)
            )), map.get(key));
            }

        }


        @Then("I click a button add User")
        public void iClickAButtonAddUser () {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format
                (XPATH_TEMPLATE_BUTTON, "Add User"))));


        }

    @Then("I verify new user is displayed in the table")
    public void iVerifyNewUserIsDisplayedInTheTable() {
        List<WebElement> each = BrowserUtils.getDriver().findElements(By.xpath("//td[text()='ms@yahoo.com']"));
        for (WebElement list : each) {
            BrowserUtils.assertEquals(list.getText(), "ms@yahoo.com");

        }
    }
    @Then("I select Role and Batch")
    public void iSelectRoleAndBatch(Map<String, String> map) {
        for (String key : map.keySet()) {
            if (key.equalsIgnoreCase("role")) {
                BrowserUtils.selectByVisibleText(page.role, map.get(key));
            } else {
                BrowserUtils.selectByVisibleText(page.batch, map.get(key));
            }
        }

    }

    @Then("I verify if option filter is display")
    public void iVerifyIfOptionFilterIsDisplay() {
       BrowserUtils.isDisplayed(page.filterBtn);
    }


    @Then("I verify button {string} is display")
    public void iVerifyButtonIsDisplay(String button) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, button))));
    }


    @Then("I click a button {string}")
    public void iClickAButton(String ac) {
        BrowserUtils.click(page.actionBtn);
    }

    @Then("I click in search button")
    public void iClickInSearchButton() {
        BrowserUtils.click(page.filterBtn);
    }

    @Then("I click on {string}")
    public void iClickOn(String show) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON,show))));

    }

    @Then("I verify if db table is display")
    public void iVerifyIfDbTableIsDisplay() {
       BrowserUtils.isDisplayed(page.table);
    }

    @Then("Manage Access should be visible")
    public void manageAccessShouldBeVisible() {
        BrowserUtils.isDisplayed(page.manageBtn);

    }


}
