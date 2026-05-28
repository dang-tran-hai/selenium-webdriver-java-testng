package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
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

    }




    @Test
    public void TC_01_ID() throws InterruptedException {

        driver.findElement(By.id("small-searchterms")).sendKeys("Macbook");
        Thread.sleep(3000);
        // driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("FirstName")).sendKeys("Automation");
        Thread.sleep(3000);

    }
    @Test
    public void TC_02_Class() throws InterruptedException {
        // giá trị trong class mà không có khoảng trắng thì lấy toàn bộ
        // giá trị có khoảng trắng thì lấy phần nào là duy nhất
        driver.findElement(By.className("register-next-step-button")).click();
        Thread.sleep(3000);
    }
    @Test
    public void TC_03_Name(){
        driver.findElement(By.name("FirstName"));
        driver.findElement(By.name("LastName"));

    }

    @Test
    public void TC_04_LinkText() throws InterruptedException {
        // chỉ làm việc với element là link và có text
        // thẻ a và có thuộc tính href
        // phải lấy hết toàn bộ text không chừa cái nào hết (tuyệt đối)
        driver.findElement(By.linkText("Search"));
        driver.findElement(By.linkText("Wishlist")).click();
        Thread.sleep(3000);


    }

    @Test
    public void TC_05_Partial_Link_Text() throws InterruptedException {
        // chỉ làm việc với element là link
        // có thể lấy toàn bộ text  hoặc 1 phần (hay dùng)

        driver.findElement(By.partialLinkText("Search"));
        driver.findElement(By.partialLinkText("Digital")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("downloads")).click();

    }

    @Test
    public void TC_06_Tagname(){
        // Tên thẻ giống như thằng HTML
        // Tìm tất cả các element giống nhau (thẻ của component giống nhau)
        // Tất cả các textbox/ checkbox/ radio/ link/ button/..
        driver.findElements(By.tagName("button"));
        driver.findElement(By.tagName("input"));
        driver.findElement(By.tagName("label"));


    }

    @Test
    public void TC_07_Css(){
        // Cách viết của Css kết hợp id/ link/ partial link
        // Css không hỗ trợ text
        driver.findElement(By.cssSelector("input[id='Company']"));
        driver.findElement(By.cssSelector("input#Company"));
        driver.findElement(By.cssSelector("#Company"));
        driver.findElement(By.cssSelector("button.register-next-step-button"));
        driver.findElement(By.cssSelector("button[class='button-1 register-next-step-button']"));
        driver.findElement(By.cssSelector("a[href*='register?']")); // partial link
        driver.findElement(By.cssSelector("a[href*='/register?returnUrl=%2Fdigital-downloads']"));

        driver.findElement(By.cssSelector("a"));
        driver.findElement(By.cssSelector("button"));
        driver.findElement(By.cssSelector("input"));

    }

    @Test
    public void TC_08_XPath(){
        // Css làm được gì thì Xpath đều làm được hết
        // truyền cú pháp đúng nó mới tìm thấy
        driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        driver.findElement(By.xpath("//input[@id='FirstName']"));
        driver.findElement(By.xpath("//input[@id='Password']"));
        driver.findElement(By.xpath("//input[@id='Company']"));
        driver.findElement(By.xpath("//input[@id='Company']"));

        driver.findElement(By.xpath("//button[@class='button-1 register-next-step-button']"));
        driver.findElement(By.xpath("//button[contains(@class,'register-next-step-button')]"));

        driver.findElement(By.xpath("//select[@name='customerCurrency']"));
        driver.findElement(By.xpath("//a[text()='Register']"));
        driver.findElement(By.xpath("//a[text()='Shipping & returns']"));
        driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
        driver.findElement(By.xpath("//a")); // tagname -> lấy tất cả thẻ a ra
        driver.findElement(By.xpath("//button"));
        driver.findElement(By.xpath("//input"));

    }

    @Test
    public void TC_09_Relative_Locator() {
        driver.get("https://demo.nopcommerce.com/login");
        // Element/ By A
        // khai báo biến passwordTextboxBy hứng lấy giá trị bên phải có kiểu dữ liệu là By
        By passwordTextboxBy = By.cssSelector("input#Password");

        WebElement passwordTextbox = driver.findElement(By.cssSelector("input#Password"));

        // Element/ By B
        By rememberMeCheckboxBy = By.cssSelector("input#RememberMe");
        By rememberMeChecboxByone = By.id("RememberMe");

        By forgotPasswordLinkby = By.cssSelector("span.forgot-password");

        By loginButtonBy = By.cssSelector("button.login-button");

        WebElement rememberMeLabelText = driver.findElement(RelativeLocator.with(By.tagName("label"))
                .above(loginButtonBy) // label đang nằm trên login button
                .below(passwordTextboxBy).toLeftOf(forgotPasswordLinkby)
                .toRightOf(rememberMeCheckboxBy)
                .near(rememberMeChecboxByone)
                .near(forgotPasswordLinkby)

        );
        // 1- dùng relative locator khi không thể định danh được element đó
        // 2- dùng để test GUI - vị trí element có khớp với design không

    }

    @AfterClass
    public void cleanBrowser(){
        driver.quit();
    }


    public void clickToElement(String locator, int index) {

    }




}
