package tests.smoke_tests;

import static org.testng.Assert.*;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class ClickableButtonsTest extends TestBase {

    @Test
    public void starredButtonClickableTest() {

        extentLogger = report.createTest("Starred button clickable test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteERPDemo button");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on 'Starred' button");
        pages.starredMessage().starredMessageLinkButton.click();

        extentLogger.pass("Pass : Starred button clickable test");
    }

    @Test
    public void writeSomethingBoxClickableTest() {

        extentLogger = report.createTest("Write something box clickable test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteERPDemo button");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on General Channel");
        pages.generalChanel().clickGeneralChannel.click();

        extentLogger.info("Clicking on 'Write something...' box");
        pages.starredMessage().writeSomethingBox.click();

        extentLogger.pass("Pass : Write something box clickable test");

    }

    @Test
    public void directMessagePlusSignClickableTest() {

        extentLogger = report.createTest("Direct message plus sign clickable test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on direct message plus sign");
        pages.directMessage().directMessagePlusSign.click();

        extentLogger.pass("Pass : Direct message plus sign clickable test");

    }

    @Test
    public void inboxButtonCLickableTest() {

        extentLogger = report.createTest("Inbox button clickable test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on InboxMessage button");
        pages.inbox().inboxButton.click();

        extentLogger.pass("Pass : Inbox button clickable test");
    }

    @Test
    public void channelButtonClickableTest() {

        extentLogger = report.createTest("Channel button clickable test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on Channels button");
        pages.channels().channelsLink.click();

        extentLogger.pass("Pass : Channel button clickable test");
    }

    @Test
    public void discussionGroupClickableTest() {

        extentLogger = report.createTest("Discussion Group clickable test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on Channels button");
        pages.channels().channelsLink.click();

        extentLogger.info("Clicking on Discussion Group button");
        pages.channels().discussionGroup.click();
    }

    @Test
    public void clickOnUserName() {

        extentLogger = report.createTest("Click on username test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on General Channel");
        pages.generalChanel().clickGeneralChannel.click();

        extentLogger.info("Clicking on Invite button");
        pages.generalChanel().inviteButton.click();

        extentLogger.info("Clicking on search box");
        pages.generalChanel().searchBox.click();

        extentLogger.info("Selecting EventsCRM_Manager4 user");
        pages.generalChanel().EventsCRM_Manager4.click();

        extentLogger.info("Verifying actual username equals to expected username 'EventsCRM_Manager4' ");
        assertEquals(pages.generalChanel().selectedUser.getText(), "EventsCRM_Manager4");

        extentLogger.pass("Pass : Click on username test");

    }

}
