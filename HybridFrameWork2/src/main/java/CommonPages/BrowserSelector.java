package CommonPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    //Create an object to call load property
    LoadProperty loadProperty = new LoadProperty();
    String browserName = loadProperty.getProperty("browser");
    public void openSelectedBrowser(){
        if(browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if (browserName.equals("edge")){
            WebDriverManager.firefoxdriver().setup();
            driver = new EdgeDriver();
        }else {
            System.out.println("Browser not matched");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //Page loading timeout
        driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
        //Applying implicitly wait to driver object
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        //open URL
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");


    }
}
