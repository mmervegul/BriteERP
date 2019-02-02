package tests.functional_tests.GeneralChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ApplicationConstants;
import utilities.ConfigurationReader;
import utilities.TestBase;

import java.util.List;

public class MessagesTime extends TestBase {


    @Test
    public void messagesTime(){

        extentLogger = report.createTest("InboxMessage");

        driver.manage().window().maximize();

        extentLogger.info("Going to the URL");
        driver.get(ConfigurationReader.getProperty("url"));

        extentLogger.info("Verifying home page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on BriteErpDemo");
        pages.login().BriteErpDemoButton.click();

        extentLogger.info("Logging to the application with correct username and password");
        pages.login().managerUserLogin();

        extentLogger.info("Verifying login page title");
        Assert.assertEquals(driver.getTitle(), ApplicationConstants.LOGINPAGE);

        extentLogger.info("Clicking on General Channel");
        pages.generalChanel().clickGeneralChannel.click();

        List<WebElement> allRows = driver.findElements(By.xpath("//p[@class='o_mail_info']"));

        for (WebElement header : allRows) {
            System.out.println(header.getText());
        }

        extentLogger.pass("Pass : Messages time test");

    }

}
