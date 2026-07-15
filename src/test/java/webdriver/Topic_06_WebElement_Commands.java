package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.URI;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;

public class Topic_06_WebElement_Commands {

    // 1- Setup OS/Browser/web/Pages/Data/Variable/Object..

    WebDriver driver;

    @BeforeClass
    public void initialBrowser() {

    }

    // 2-Action/Execute: interact element/ input/verify...
    @Test
    public void TC_01() {
        //

        WebElement webElement = driver.findElement(By.cssSelector(""));
        webElement.clear();
        webElement.sendKeys("");

    }

    @Test
    public void TC_02() {

    }

    // 3-Clean: delete data test/account/ close browser ...
    @AfterClass
    public void cleanBrowser() {
        driver.quit();
    }

    // add comment to check new account

}
