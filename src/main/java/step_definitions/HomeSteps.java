package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.DashBoardPage;
import pages.HomePage;
import pages.LogInPage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {

    DashBoardPage dashBoardPage;
    HomePage page;
    public HomeSteps() {
        page = new HomePage();
        dashBoardPage = new DashBoardPage();


    }


    @When("I click in nav button {string}")
    public void iClickInNavButton(String button) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_LINKTEXT, button))));

    }



}



