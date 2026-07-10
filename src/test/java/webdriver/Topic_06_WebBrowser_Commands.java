package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_00_Template {

    // 1- Setup OS/Browser/web/Pages/Data/Variable/Object..

    WebDriver driver;
    @BeforeClass
    public void initialBrowser() {
        driver= new FirefoxDriver();
        driver.get("https://admin-demo.nopcommerce.com/");
    }

    // 2-Action/Execute: interact element/ input/verify...
    @Test
    public void TC_01(){

    }
    @Test
    public void TC_02(){

    }


    // 3-Clean: delete data test/account/ close browser ...
    @AfterClass
    public void cleanBrowser(){
        driver.quit();
    }

    //add comment to check new account





}
