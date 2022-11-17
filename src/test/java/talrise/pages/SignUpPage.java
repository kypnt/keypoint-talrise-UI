package talrise.pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import talrise.utilities.CommonSteps;

public class SignUpPage extends CommonPageElements {

    Faker faker = new Faker();
    String linkedIn = "https://www.linkedin.com/in/";
    static String currentURL;



    @FindBy(xpath = "//*[.=\"SIGN UP\"]")
    public WebElement signUpButton;

    @FindBy(xpath = "//button[.=\"CREATE MY ACCOUNT\"]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[contains(text(),\"Please \")]")
    public WebElement signUpErrorMessage;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[@id=\"linkedIn\"]")
    public WebElement linkedInBox;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passswordBox;

    @FindBy(xpath = "//*[@id=\"confirmPassword\"]")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//*[@name=\"checkbox\"]")
    public WebElement GDPRcheckbox;

    @FindBy(xpath = "//button[.=\"CREATE MY ACCOUNT\"]")
    public WebElement signUpcreateAccountButton;



    public void formFill(){
        firstNameBox.sendKeys(faker.name().firstName());
        lastNameBox.sendKeys(faker.name().lastName());
        linkedInBox.sendKeys(linkedIn.concat(faker.name().firstName()));
        emailBox.sendKeys(faker.internet().emailAddress());
        passswordBox.sendKeys("Test123456!");
        confirmPasswordBox.sendKeys("Test123456!");
        GDPRcheckbox.click();
        signUpcreateAccountButton.click();

    }
    public void RolePageAssertion(){
        CommonSteps.waitFor(5);
        currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        Assert.assertTrue("We are in choose role page",currentURL.contains("chooseRole"));


        }
}
