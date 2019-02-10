package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class InboxPage {

    public InboxPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-inbox mr8']")
    public WebElement inboxButton;

    @FindBy(className = "o_thread_title")
    public WebElement emptyInboxMessage;



}
