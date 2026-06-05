package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Topic_03_Xpath_Css {

    // 1- Setup OS/Browser/web/Pages/Data/Variable/Object..

    WebDriver driver;
    @BeforeClass
    public void initialBrowser() {
        driver = new FirefoxDriver();
        //driver.get("https://live.techpanda.org/");
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    // 2-Action/Execute: interact element/ input/verify...
    @Test
    public void TC_01(){
        //driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();

        // //div[@class='footer']/div[4]/ul/li/a[@title='My Account'] đi từ node cha xuống lấy element thứ 2

        //driver.findElement(By.xpath("//li[@class='success-msg']//span")).click(); cần login

        //driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//div[@class='topic-block-body']/p[contains(text(),'purchase products or services over')]"));

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
