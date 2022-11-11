package talrise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends CommonPageElements {

    @FindBy(xpath = "//*[.=\"SIGN UP\"]")
    public WebElement signUpButton;

    @FindBy(xpath = "//button[.=\"CREATE MY ACCOUNT\"]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[contains(text(),\"Please \")]")
    public WebElement signUpErrorMessage;

}
