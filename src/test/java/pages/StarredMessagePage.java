package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StarredMessagePage {

    public StarredMessagePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='o_channel_name'])[2]")
    public WebElement starredMessageLinkButton;

    @FindBy(xpath = "(//div[@class='o_composer_input'])[1]")
    public WebElement writeSomethingBox;

    @FindBy(xpath = "(//i[@title='Mark as Todo'])[11]")
    public WebElement starButton;

    @FindBy(xpath = "//div[.='No starred message']")
    public WebElement emptyStarredMessageText;



}
