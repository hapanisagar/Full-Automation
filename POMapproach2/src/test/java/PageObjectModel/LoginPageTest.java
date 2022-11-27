package PageObjectModel;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {
    WebDriver driver;
    LoginPage loginpage;
    @BeforeMethod
    public void OpenBrowser() {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

         loginpage = new LoginPage(driver);
    }
    @Test
    public void loginTest(){
      loginpage.enterUsername("Dhoni");
      loginpage.enterPassword("Abcd1234");
      loginpage.clickOnLoginBtn();

    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();

    }



}

