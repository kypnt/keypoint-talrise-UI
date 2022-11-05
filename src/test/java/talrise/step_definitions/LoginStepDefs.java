package talrise.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import talrise.utilities.CommonSteps;
import talrise.utilities.ConfigurationReader;

public class LoginStepDefs extends CommonSteps {

    @Given("the user provides valid credentials")
    public void the_user_provides_valid_credentials() {
        loginPage.emailTextbox.sendKeys(ConfigurationReader.get("email"));
        loginPage.passwordTextbox.sendKeys(ConfigurationReader.get("password"));
    }

    @When("the user clicks on login button")
    public void the_user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }


    @Then("the user should be able to logged in successfully")
    public void the_user_should_be_able_to_logged_in_successfully() {
        waitForVisibility(loginPage.loginMessage, 5);
        Assert.assertTrue(loginPage.loginMessage.isDisplayed());
    }

}
