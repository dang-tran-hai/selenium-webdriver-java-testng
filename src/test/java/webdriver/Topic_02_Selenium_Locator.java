package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        // tìm 1 element
        driver.findElement(By.id("")).click();

        //tìm nhiều element giống nhau
        driver.findElements(By.cssSelector("")).get(0).click();
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


    public void clickToElement(String locator, int index) {

    }




}
