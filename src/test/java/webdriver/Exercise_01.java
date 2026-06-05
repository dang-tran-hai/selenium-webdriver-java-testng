package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exercise_01 {

    // 1- Setup OS/Browser/web/Pages/Data/Variable/Object..

    WebDriver driver;
    @BeforeClass
    public void initialBrowser() {
        driver= new FirefoxDriver();

    }

    // 2-Action/Execute: interact element/ input/verify...
    @Test
    public void Register_Empty_Data (){
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");

        //Action
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("txtFirstname-error")).getText();

        //Assert
        Assert.assertEquals(driver.findElement(By.id("txtFirstname-error")).getText(), "Vui lòng nhập họ tên");
        Assert.assertEquals(driver.findElement(By.id("txtEmail-error")).getText(), "Vui lòng nhập email");
        Assert.assertEquals(driver.findElement(By.id("txtCEmail-error")).getText(), "Vui lòng nhập lại địa chỉ email");
        Assert.assertEquals(driver.findElement(By.id("txtPassword-error")).getText(), "Vui lòng nhập mật khẩu");
        Assert.assertEquals(driver.findElement(By.id("txtCPassword-error")).getText(), "Vui lòng nhập lại mật khẩu");
        Assert.assertEquals(driver.findElement(By.id("txtPhone-error")).getText(), "Vui lòng nhập số điện thoại.");



    }
    @Test
    public void Register_Invalid_Email (){
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");

        // Action
        driver.findElement(By.id("txtEmail")).sendKeys("123456@78@1");
        driver.findElement(By.id("txtCEmail")).sendKeys("123456@89");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("txtEmail-error")).getText();

        //Assert
        Assert.assertEquals(driver.findElement(By.id("txtEmail-error")).getText(),"Vui lòng nhập email hợp lệ");


    }

    @Test
    public void Register_Incorrect_Confirm_Email (){
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");

        // Action
        driver.findElement(By.id("txtEmail")).sendKeys("123456@78");
        driver.findElement(By.id("txtCEmail")).sendKeys("123456@89");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("txtCEmail-error")).getText();

        //Assert
        Assert.assertEquals(driver.findElement(By.id("txtCEmail-error")).getText(),"Email nhập lại không đúng");



    }

    @Test
    public void Register_Password_Less_Six (){
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");

        // Action
        driver.findElement(By.id("txtPassword")).sendKeys("12345");
        driver.findElement(By.id("txtCPassword")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("txtPassword-error")).getText();
        driver.findElement(By.id("txtCPassword-error")).getText();

        //Assert
        Assert.assertEquals(driver.findElement(By.id("txtPassword-error")).getText(),"Mật khẩu phải có ít nhất 6 ký tự");
        Assert.assertEquals(driver.findElement(By.id("txtCPassword-error")).getText(),"Mật khẩu phải có ít nhất 6 ký tự");


    }

    @Test
    public void Register_Incorrect_Confirm_Password (){
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        // Action
        driver.findElement(By.id("txtPassword")).sendKeys("12345");
        driver.findElement(By.id("txtCPassword")).sendKeys("12345@34");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("txtPassword-error")).getText();
        driver.findElement(By.id("txtCPassword-error")).getText();

        //Assert
        Assert.assertEquals(driver.findElement(By.id("txtPassword-error")).getText(),"Mật khẩu phải có ít nhất 6 ký tự");
        Assert.assertEquals(driver.findElement(By.id("txtCPassword-error")).getText(),"Mật khẩu bạn nhập không khớp");


    }

    @Test
    public void Register_Invalid_Phone_Number (){
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        // Action
        driver.findElement(By.id("txtPhone")).sendKeys("12345");
        //driver.findElement(By.id("txtCPassword")).sendKeys("12345@34");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("txtPhone-error")).getText();
        //driver.findElement(By.id("txtCPassword-error")).getText();

        //Assert
        Assert.assertEquals(driver.findElement(By.id("txtPhone-error")).getText(),"Số điện thoại bắt đầu bằng: 09 - 03 - 012 - 016 - 018 - 019 - 088 - 03 - 05 - 07 - 08");
        //Assert.assertEquals(driver.findElement(By.id("txtCPassword-error")).getText(),"Mật khẩu bạn nhập không khớp");


    }

    // 3-Clean: delete data test/account/ close browser ...
    @AfterClass
    public void cleanBrowser(){
        driver.quit();
    }

    //add comment to check new account





}
