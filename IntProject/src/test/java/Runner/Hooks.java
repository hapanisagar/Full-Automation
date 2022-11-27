package Runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new WebDriver;

        driver.get("https://www.amazon.co.uk/");

    }

}
