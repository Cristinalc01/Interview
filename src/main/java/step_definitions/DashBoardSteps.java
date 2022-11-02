package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.DashBoardPage;
import utils.BrowserUtils;

import java.awt.*;

public class DashBoardSteps implements CommonPage {

    DashBoardPage page;

    public DashBoardSteps() {
        this.page = new DashBoardPage();
    }



    @When("I fill the input dashboard")
    public void iFillTheInputDashboard() {
        BrowserUtils.sendKeys(page.dashbd, "Java");
    }


    @Then("I click in the button add")
    public void iClickInTheButtonAdd() {
        BrowserUtils.click(page.add);

    }

    @Then("I Verify the new dashboard is displayed")
    public void iVerifyTheNewDashboardIsDisplayed() {
        BrowserUtils.isDisplayed(page.dashbword);
    }
}
