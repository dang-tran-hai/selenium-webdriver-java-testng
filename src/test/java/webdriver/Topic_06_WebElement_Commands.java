package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
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

        // xoá dữ liệu trước khi nhập
        webElement.clear();
        // click vào 1 element button/checkbox/radio/link/...clickable
        webElement.click();
        // chỉ có tác dụng với form
        // tương tự action enter gửi request lên  mà không cần click vào submit button
        webElement.submit();

        // dùng cho tất cả các loại element để kiểm tra nó hiển thị hoặc không
        // tất cả các loại hàm có tiền tố là  đều phải kiểm tra tính đúng sai
        webElement.isDisplayed();
        webElement.isEnabled();
        webElement.isSelected();

        // mong đợi 1 element có kết quả trả về là đúng
        Assert.assertTrue(webElement.isDisplayed());

        // để kiểm tra 1 element đã được chọn hay chưa
        // dành cho 3 loại element (checkbox/radio/dropdown)
        Assert.assertTrue(webElement.isSelected());
        Assert.assertFalse(webElement.isSelected());

        // để kiểm tra 1 element cho phép thao tác lên hay  (không bị disable)
        // dành cho tất cả các loại element
        Assert.assertTrue(webElement.isEnabled());
        Assert.assertFalse(webElement.isDisplayed());

        // lấy ra text của element  (link/button/message...)
        // các hàm tiền tố getXXX sẽ trả về dữ liệu dùng để kiểm tra ở bước tiếp th
        // nếu kiểm tra trực tiếp thì không cần khai báo
        // nếu dùng qua các bước sau thì phải khai báo biến
        webElement.getText();
        webElement.clear();
        webElement.sendKeys("");
        webElement.click();
        // không cần khai báo biến
        Assert.assertEquals(webElement.getText(), "This is a required.");

        // cần khai báo biến
        String userID= webElement.getText();
        Assert.assertEquals(userID, "32DSQW");

        // thường dùng ở cái  của selenium 3.x trở xuống
        webElement.getAttribute("");

        // thường dùng ở cái  của selenium 4.x trở lên
        webElement.getDomAttribute("");
        webElement.getDomProperty("");
        webElement.getDomProperty("");

        // lấy ra các thuộc tính attribute về CSS của element
        // Font/ color/ size/ location/ properties...
        // firefox nằm ở tab style
        // chrome/ edge nằm ở tab rules
        webElement.getCssValue("color");
        webElement.getCssValue("font-family");
        webElement.getCssValue("font-size");

        // xử lý shadow DOM
        webElement.getShadowRoot();

        // nằm trong tab Accessibil
        // selenium version 4.x
        webElement.getAccessibleName();
        webElement.getAriaRole();

        // đặt 1 toạ độ
        new Point (1300,3000);

        // lấy ra toạ độ trục tung và hoành của element từ toạ độ trên
        Point locationElement= webElement.getLocation();
        locationElement.getX();
        locationElement.getY();

        // lấy ra chiều rộng, cao của element
        Dimension elementSize= webElement.getSize();
        elementSize.getWidth();
        elementSize.getHeight();

       Rectangle  rectangleElement= webElement.getRect();
        rectangleElement.getX();2
        rectangleElement.getY();

        // khi không biết tên thẻ của element là gì (trong trường hợp dùng CSS để viết tắt locator)
        // từ locator sẽ ra tên thẻ tương ứng
        webElement.getTagName();

        // lấy ra hình ảnh của trang/ element trả về kiểu File/byte...
        webElement.getScreenshotAs(OutputType.BYTES);
        webElement.getScreenshotAs(OutputType.FILE);
        webElement.getScreenshotAs(OutputType.BASE64);





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
