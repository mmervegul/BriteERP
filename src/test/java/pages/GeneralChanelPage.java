package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GeneralChanelPage {

    public GeneralChanelPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='fa fa-plus o_add'])[1]")
    public WebElement channelsPlusSign;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement addAChannelBox;

    @FindBy(id = "ui-id-2")
    public WebElement clickName;

    @FindBy(xpath = "(//div[@title='general'])[1]")
    public WebElement clickGeneralChannel;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-link']")
    public WebElement showOlderMessages;



}
