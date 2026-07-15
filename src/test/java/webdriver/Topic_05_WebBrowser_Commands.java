package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.URI;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;

public class Topic_05_WebBrowser_Commands {

    // 1- Setup OS/Browser/web/Pages/Data/Variable/Object..

    WebDriver driver;

    @BeforeClass
    public void initialBrowser() throws MalformedURLException {
        driver = new FirefoxDriver();
        // driver.get("https://admin-demo.nopcommerce.com/");
        driver = new ChromeDriver();
        driver = new EdgeDriver();
        //driver = new SafariDriver();
        //driver = new InternetExplorerDriver();
        //driver = new ChromiumDriver();

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(URI.create("https://www.youtube.com").toURL(), chromeOptions);
    }

    // 2-Action/Execute: interact element/ input/verify...
    @Test
    public void TC_01() {
        // tương tác với browser

        // mở ra  1 page url
        driver.get("https://www.youtube.com/");

        // đóng tab đang đứng trên browser
        driver.close();

        // đóng/thoát browser
        driver.quit();

        // tìm ra 1 element
        driver.findElement(By.cssSelector(""));
        // tìm ra nhiều element
        driver.findElements(By.cssSelector(""));
        // lấy ra URL của page hiện tại
        driver.getCurrentUrl();
        // lấy ra title của page hiện tại
        driver.getTitle();
        // lấy ra source code (HTML/CSS/JS...) của page hiện tại
        driver.getPageSource();
        // lấy ra window/ Tab ID của page hiện tại
        String getWindowID= driver.getWindowHandle();

        // lấy ra window/ Tab ID của tất cả các tab/ window khác
        driver.getWindowHandles();

        // timeout
        // chờ cho vệc tìm element thành công trong khoảng thời gian cho trước
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        // chờ cho việc 1 page được load thành công trong khoảng thời gian cho trước
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));

        // chờ cho đoạn script được thực thi thành công trong khoảng thời gian cho trước
        // chỉ áp dụng cho thư viện JavascriptExecutor
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));

        driver.manage().timeouts().getScriptTimeout();
        driver.manage().timeouts().getPageLoadTimeout();
        driver.manage().timeouts().getImplicitWaitTimeout();

        // browser window
        // phóng to/ thu nhỏ / tràn viền browser lên khi chạy
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
        // vị tr của browser trên màn hình
        driver.manage().window().setPosition(new Point(133,452));
        // kích thước chiều rộng & cao của browser
        driver.manage().window().setSize(new Dimension(1336, 768));
        driver.manage().window().getSize();

        // Log
        // lấy ra tất cả các loại log type
        Set<String> logType= driver.manage().logs().getAvailableLogTypes();
        // lấy ra 1 loại log type bất kỳ
        driver.manage().logs().get(LogType.DRIVER);
        driver.manage().logs().get(LogType.BROWSER);
        driver.manage().logs().get(LogType.PERFORMANCE);
        driver.manage().logs().get(LogType.CLIENT);

        // Cookie
        // lấy ra tất cả cookie
        Set<Cookie> allCookies = driver.manage().getCookies();

        // lấy ra 1 loại cookie
        driver.manage().getCookieNamed("truyen ten cookies")
        // set cookie cho 1 page bất kỳ
        for (Cookie cookie : allCookies) {
            driver.manage().addCookie(cookie);
            // xóa từng cái cookie
            driver.manage().deleteCookie(cookie);
        }

        //xóa toàn bộ cookie
        driver.manage().deleteAllCookies();

        // Alert
        driver.switchTo().alert().accept();
        driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();

        // Frame/iFrame
        driver.switchTo().frame("");
        driver.switchTo().frame(12);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe")));
        driver.switchTo().defaultContent();
        driver.switchTo().activeElement();
        driver.switchTo().parentFrame();

        // switch qua window/tab mong muốn
        driver.switchTo().window(getWindowID);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);

        // Navigation - điều hướng page
        // tải lại trang - F5
        driver.navigate().refresh();

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.youtube.com/");





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
