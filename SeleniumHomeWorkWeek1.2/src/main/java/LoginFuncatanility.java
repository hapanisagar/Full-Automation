import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFuncatanility {
    public static void main(String[] args) {

        // 1.set property
        WebDriverManager.chromedriver().setup();
        //2.Create Instance
        WebDriver driver =new ChromeDriver();
        //3. use variable or class or method whatever you need
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("meetpatel2000@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("meet@2000");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();



    }
}
