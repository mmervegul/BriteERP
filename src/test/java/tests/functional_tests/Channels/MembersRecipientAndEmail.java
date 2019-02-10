package tests.functional_tests.Channels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.TestBase;

import java.util.*;

public class MembersRecipientAndEmail extends TestBase {

    @Test
    public void membersRecipientAndEmail() {

        extentLogger = report.createTest("Find all members recipient and email");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Clicking on Channels button");
        pages.channels().channelsLink.click();

        extentLogger.info("Clicking on 'sales' channel");
        pages.channels().firstSalesChannel.click();

        extentLogger.info("Clicking on 'Members' button");
        pages.channels().membersButton.click();

        extentLogger.info("Finding all members recipient and email");
        List<WebElement> allUsers = driver.findElements(By.xpath("//tbody[@class='ui-sortable']"));

        for (WebElement str : allUsers) {
            System.out.println(str.getText());
        }

        extentLogger.pass("Pass : Find all members recipient and email");

    }
}
