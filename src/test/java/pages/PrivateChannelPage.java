package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class PrivateChannelPage {

    public PrivateChannelPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@title='Add'])[3]")
    public WebElement privateChannelPlusButton;

    @FindBy(xpath = "(//input[@class='o_input'])[1]")
    public WebElement addAPrivateChannelBox;

}
