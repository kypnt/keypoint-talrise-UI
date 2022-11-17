package talrise.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import talrise.utilities.CommonSteps;

public class SignUpStepDefs extends CommonSteps {

    @Given("the user clicks on sign up link")
    public void the_user_clicks_on_sign_up_link() {
        signUpPage.signUpButton.click();

    }

    @When("the user clicks the Create My Account button")
    public void theUserClicksTheCreateMyAccountButton() {

        signUpPage.createAccountButton.click();
    }

    @Then("error message should appear")
    public void errorMessageShouldAppear() {
        signUpPage.signUpErrorMessage.isDisplayed();
    }


    @Given("User is on the sign up page")
    public void userIsOnTheSignUpPage() {

        signUpPage.signUpButton.click();
    }

    @When("User enters valid inputs")
    public void userEntersValidInputs() {

        signUpPage.formFill();

    }

    @Then("User should be able to sign up.")
    public void userShouldBeAbleToSignUp() {
     signUpPage.RolePageAssertion();



    }
}
