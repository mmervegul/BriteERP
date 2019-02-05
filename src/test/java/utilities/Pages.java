package utilities;

import pages.*;

public class Pages {

    private LoginPage loginPage;
    private NegativeLoginPage negativeLoginPage;
    private InboxPage inboxPage;
    private ChannelsPage channelsPage;
    private GeneralChanelPage generalChanelPage;
    private LinkButtonsPage linkButtonsPage;

    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;

    }

    public NegativeLoginPage negativeLogin(){
        if(negativeLoginPage == null) {
            negativeLoginPage = new NegativeLoginPage();
        }
        return negativeLoginPage;
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

    public LinkButtonsPage linkButtonsPage(){
        if(linkButtonsPage == null) {
            linkButtonsPage = new LinkButtonsPage();
        }
        return linkButtonsPage;
    }
}
