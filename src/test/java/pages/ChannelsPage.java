package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChannelsPage {

    public ChannelsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "o_mail_open_channels")
    public WebElement channelsLink;

    @FindBy(xpath = "(//button[@class='btn btn-primary pull-right btn-sm oe_kanban_action oe_kanban_action_button'])[6]")
    public WebElement joinButtonForEventChannel;

    @FindBy(xpath = "(//button[@class='btn btn-primary pull-right btn-sm oe_kanban_action oe_kanban_action_button'])[3]")
    public WebElement leaveButtonForTeamChannel;

    @FindBy(xpath = "//div[@class='oe_module_vignette oe_kanban_global_click o_kanban_record']")
    public WebElement generalChannel;

    @FindBy(linkText = "Members")
    public WebElement members;

    @FindBy(xpath = "//span[.='Discussion Group']")
    public WebElement discussionGroup;

    @FindBy(xpath = "(//span[.='sales'])[1]")
    public WebElement firstSalesChannel;

    @FindBy(xpath = "//a[.='Members']")
    public WebElement membersButton;




}
