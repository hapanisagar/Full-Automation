import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;
    @Given("^User is on login page and verify the Login page Title$")
    public void user_is_on_login_page_and_verify_the_Login_page_Title(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("^User Enter Username and Password and click on Login$")
    public void user_Enter_Username_and_Password_and_click_on_Login(){
       // driver.findElement(By.className("ico-login")).click();


    }

    @Then("^User is on Homepage of User$")
    public void user_is_on_Homepage_of_User()  {

    }
}
