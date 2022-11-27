package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver;
    @Given("^User able to open browser$")
    public void user_able_to_open_browser()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^Enter url$")
    public void enter_url() throws InterruptedException {
        driver.get("https://en-gb.facebook.com/");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
       // js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
       // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       // driver.manage().deleteAllCookies();
       // driver.findElement(By.xpath("//*[@id=\"u_0_e_5z\"]")).click();
        //Alert alert = driver.switchTo().alert();
       // System.out.println(alert.getText());
       // alert.accept();

    }

    @Then("^User is on login page and verify login page title$")
    public void user_is_on_login_page_and_verify_login_page_title()  {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Facebook – log in or sign up",title);



    }
    @When("^User enter \"([^\"]*)\" and \"([^\"]*)\" and click on login button$")
    public void user_enter_and_and_click_on_login_button(String username, String password) {
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();

    }

    @Then("^User is on home page$")
    public void user_is_on_home_page()  {

    }

    @Then("^User close the browser$")
    public void user_close_the_browser()  {
       // driver.quit();

    }

}
