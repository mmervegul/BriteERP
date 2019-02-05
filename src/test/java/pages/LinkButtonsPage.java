package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LinkButtonsPage {

    public LinkButtonsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='o_channel_name'])[2]")
    public WebElement starredMessageLinkButton;

    @FindBy(xpath = "(//div[@class='o_composer_input'])[1]")
    public WebElement writeSomethingBox;

}
