package webdriver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.URL;

public class Topic_06_WebBrowser_Commands {

    // 1- Setup OS/Browser/web/Pages/Data/Variable/Object..

    WebDriver driver;

    @BeforeClass
    public void initialBrowser() {
        driver = new FirefoxDriver();
        // driver.get("https://admin-demo.nopcommerce.com/");
        driver = new ChromeDriver();
        driver = new EdgeDriver();
        driver = new SafariDriver();
        driver = new InternetExplorerDriver();
        driver = new ChromiumDriver();

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://gridUrl:4444"), chromeOptions);
    }

    // 2-Action/Execute: interact element/ input/verify...
    @Test
    public void TC_01() {

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
