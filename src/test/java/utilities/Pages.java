package utilities;

import pages.*;

public class Pages {

    private LoginPage loginPage;
    private NegativeLoginPage negativeLoginPage;
    private InboxPage inboxPage;
    private ChannelsPage channelsPage;
    private GeneralChanelPage generalChanelPage;
    private PrivateChannelPage privateChannelPage;
    private StarredMessagePage starredMessagePage;
    private DirectMessagePage directMessagePage;

    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;

    }

    public NegativeLoginPage negativeLogin() {
        if(negativeLoginPage == null) {
            negativeLoginPage = new NegativeLoginPage();
        }
        return negativeLoginPage;
    }

    public InboxPage inbox() {
        if(inboxPage == null) {
            inboxPage = new InboxPage();
        }
        return inboxPage;
    }

    public ChannelsPage channels() {
        if(channelsPage == null) {
            channelsPage = new ChannelsPage();
        }
        return channelsPage;
    }

    public GeneralChanelPage generalChanel() {
        if(generalChanelPage == null) {
            generalChanelPage = new GeneralChanelPage();
        }
        return generalChanelPage;
    }

    public StarredMessagePage starredMessage() {
        if(starredMessagePage == null) {
            starredMessagePage = new StarredMessagePage();
        }
        return starredMessagePage;
    }

    public PrivateChannelPage privateChannel() {
        if(privateChannelPage == null) {
            privateChannelPage = new PrivateChannelPage();
        }
        return privateChannelPage;
    }

    public DirectMessagePage directMessage() {
        if(directMessagePage == null) {
            directMessagePage = new DirectMessagePage();
        }
        return directMessagePage;
    }
}
