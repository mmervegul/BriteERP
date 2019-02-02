package utilities;

import pages.ChannelsPage;
import pages.GeneralChanelPage;
import pages.InboxPage;
import pages.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private InboxPage inboxPage;
    private ChannelsPage channelsPage;
    private GeneralChanelPage generalChanelPage;

    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;

    }

    public InboxPage inbox(){
        if(inboxPage == null) {
            inboxPage = new InboxPage();
        }
        return inboxPage;
    }

    public ChannelsPage channels(){
        if(channelsPage == null) {
            channelsPage = new ChannelsPage();
        }
        return channelsPage;
    }

    public GeneralChanelPage generalChanel(){
        if(generalChanelPage == null) {
            generalChanelPage = new GeneralChanelPage();
        }
        return generalChanelPage;
    }
}
