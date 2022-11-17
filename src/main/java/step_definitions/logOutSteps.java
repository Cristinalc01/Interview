package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.UserFormPage;
import pages.logOutPage;
import utils.BrowserUtils;

public class logOutSteps implements CommonPage {

     logOutPage page;

    public logOutSteps() {
        page = new logOutPage();
    }



    @When("verify log out button is display")
    public void verifyLogOutButtonIsDisplay() {
        BrowserUtils.isDisplayed(page.logOutBtn);

    }

    @When("I click in log out button")
    public void iClickInLogOutButton() {
        BrowserUtils.click(page.logOutBtn);


    }

    @Then("I should return to login page {string}")
    public void iShouldReturnToLoginPage(String Url) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), Url);
    }
}
