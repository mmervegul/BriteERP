package tests.smoke_tests;

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

        extentLogger.info("Clicking on starred message button");
        pages.linkButtons().starredMessageLinkButton.click();

        extentLogger.pass("Pass : Starred link button clickable test");
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
        pages.linkButtons().writeSomethingBox.click();

        extentLogger.pass("Pass : Write something box clickable test");

    }

    @Test
    public void plusSignClickableTest() {

        extentLogger = report.createTest("Plus sign clickable test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Verifying login page title");
        assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on plus sign");
        pages.generalChanel().channelsPlusSign.click();

        extentLogger.pass("Pass : Verifying plus sign clickable test");

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

        extentLogger.pass("Pass : Inbox link button is clickable");
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

}
