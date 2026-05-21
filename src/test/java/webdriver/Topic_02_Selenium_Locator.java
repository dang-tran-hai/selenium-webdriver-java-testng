package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_Selenium_Locator {

    WebDriver driver;
    @BeforeClass
    public void initialBrowser() {
        // open browser
        driver= new FirefoxDriver();

        // open application
        driver.get("https://admin-demo.nopcommerce.com/login");
    }


    @Test
    public void TC_01(){

        // interact email address
        driver.findElement()


    }
    @Test
    public void TC_02(){

    }



    @AfterClass
    public void cleanBrowser(){
        driver.quit();
    }







}
