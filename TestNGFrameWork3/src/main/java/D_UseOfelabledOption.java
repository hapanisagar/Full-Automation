import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class D_UseOfelabledOption {
    WebDriver driver;

    @Test(priority = 1)
    void openBrowser() {
        System.out.println("Open Browser");

    }

    @Test(priority = 2,enabled = false) //for skip or avoid or disable some Test case than use this enabled =false option
    void register() {                   // by this method we can again run this TC in future if we need it by enabled = true option
        System.out.println("Reg Page");

    }

    @Test(priority = 3)
    void login() {
        System.out.println("Login page");

    }

    @Test(priority = 4)
    void closeBrowser() {
        System.out.println("Close Browser");


    }
}
