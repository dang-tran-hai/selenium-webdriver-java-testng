package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        driver.get("https://demo.nopcommerce.com/register");

        // tìm 1 element
        driver.findElement(By.id("")).click();

        //tìm nhiều element giống nhau
        driver.findElements(By.cssSelector("")).get(0).click();
    }




    @Test
    public void TC_01_ID() throws InterruptedException {

        driver.findElement(By.id("small-searchterms")).sendKeys("Macbook");
        Thread.sleep(3000);
        driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);

    }
    @Test
    public void TC_02_Class(){

    }
    @Test
    public void TC_03_Name(){

    }

    @Test
    public void TC_04_LinkText(){

    }

    @Test
    public void TC_05_Partial_Link_Text(){

    }

    @Test
    public void TC_06_Tagname(){

    }

    @Test
    public void TC_07_Css(){

    }

    @Test
    public void TC_08_XPath(){

    }



    @AfterClass
    public void cleanBrowser(){
        driver.quit();
    }


    public void clickToElement(String locator, int index) {

    }




}
