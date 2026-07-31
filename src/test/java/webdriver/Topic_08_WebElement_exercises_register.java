package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_08_WebElement_exercises_register {

    // 1- Setup OS/Browser/web/Pages/Data/Variable/Object..

    WebDriver driver;

    @BeforeClass
    public void initialBrowser() {
        driver = new FirefoxDriver();




    }

    // 2-Action/Execute: interact element/ input/verify...
    @Test
    public void TC_01_SignUp() {
        driver.get("https://login.mailchimp.com/signup/");

    }

    // 3-Clean: delete data test/account/ close browser ...
    @AfterClass
    public void cleanBrowser() {
        driver.quit();
    }

}
