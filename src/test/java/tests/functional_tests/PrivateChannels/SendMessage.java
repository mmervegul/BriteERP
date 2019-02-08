package tests.functional_tests.PrivateChannels;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class SendMessage extends TestBase {

    @Test
    public void sendMessage() {

        extentLogger = report.createTest("Send message test");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on private channel plus sign");
        pages.privateChannel().privateChannelPlusButton.click();

        extentLogger.info("Adding new person to private channel and clicking enter");
        pages.privateChannel().addAPrivateChannelBox.sendKeys("SalesManager4", Keys.ENTER);

        extentLogger.info("Clicking and writing some message to write something box");
        pages.privateChannel().writeSomethingBox.sendKeys("Hello");

        extentLogger.info("Clicking on send button");
        pages.privateChannel().sendButton.click();

        extentLogger.pass("Pass : Send message test");




    }
}
