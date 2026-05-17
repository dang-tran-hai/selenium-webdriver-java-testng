package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Check_slack_messages {

    @Test
    public void testGoogleSearch() {
        // Khởi tạo trình duyệt Chrome
        WebDriver driver = new ChromeDriver();

        // Mở trang web
        driver.get("https://www.google.com");

        // In tiêu đề trang để kiểm tra
        System.out.println("Tiêu đề trang là: " + driver.getTitle());

        // Đóng trình duyệt
        driver.quit();
    }
}