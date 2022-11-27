import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class A_FirstTestNGTestCase { //anotation with priority of run method
    WebDriver driver;
    @Test(priority = 1) // @Test called anotation it is used for run program insted of psvm
    void openBrowser(){
        System.out.println("Open Browser");

    }
    @Test(priority = 2)
    void register(){
        System.out.println("Reg Page");

    }
    @Test(priority = 3)
    void login(){
        System.out.println("Login page");

    }
    @Test(priority = 4)
    void closeBrowser(){
        System.out.println("Close Browser");


    }
}
