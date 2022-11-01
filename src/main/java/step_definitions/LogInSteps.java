package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.LogInPage;
import utils.BrowserUtils;

public class LogInSteps implements CommonPage {
    LogInPage page;
    public LogInSteps() {
        page = new LogInPage();
    }

    @Given("I open website url")
    public void i_open_website_url() {
        BrowserUtils.getDriver();
    }

    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String username, String password) {

        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Username"))), username);

        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Password"))), password);

        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_BUTTON, "Login"))));

        Assert.assertTrue(true);
    }


}

