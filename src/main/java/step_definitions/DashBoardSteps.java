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

    public DashBoardSteps(){
        this.page = new DashBoardPage();
    }
    @Then("I click in Enter new question")
    public void iClickInEnterNewQuestion() {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, "Enter new question"))));
    }

    @Then("I fill out the field New Dashboard")
    public void iFillOutTheFieldNewDashboard() {
            BrowserUtils.sendKeys(page.question,"what is Java?");
        }

    @Then("I click a button Enter")
    public void iClickAButtonEnter() {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, "Enter"))));


    }

    @And("I verify is new dashboard is displayed")
    public void iVerifyIsNewDashboardIsDisplayed() {
        String actualtxt = BrowserUtils.getText(page.dasbd);
        String expected = "what is Java?";
        BrowserUtils.assertEquals(expected, actualtxt);
    }

    }
