import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B_SecondTestNGTestCase {
    WebDriver driver;

    @Test(priority = 1)
                            // @Test called anotation it is used for run program insted of psvm
    void openBrowser() {
        System.out.println("Open Browser");
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }
}