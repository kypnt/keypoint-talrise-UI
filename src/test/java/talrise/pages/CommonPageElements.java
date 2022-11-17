package talrise.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import talrise.utilities.Driver;


public abstract class CommonPageElements extends Driver {

    public CommonPageElements() {
        PageFactory.initElements(driver,this);
    }



}
