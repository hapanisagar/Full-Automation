package StepDefinations;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
    WebDriver driver;


    @When("^User click on Create new account link$")
    public void user_click_on_Create_new_account_link()  {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();

    }

    @Then("^User on register page and verify register page title$")
    public void user_on_register_page_and_verify_register_page_title()  {

    }

    @Then("^Enter first name and surname$")
    public void enter_first_name_and_surname() {
        driver.findElement(By.name("firstname")).sendKeys("Sachin");
        driver.findElement(By.name("lastname")).sendKeys("patel");

    }

    @Then("^Enter email id$")
    public void enter_email_id()  {
        driver.findElement(By.name("reg_email__")).sendKeys("Test@123gmail.com");


    }

    @Then("^Enter new password$")
    public void enter_new_password()  {
        driver.findElement(By.id("password_step_input")).sendKeys("Abcd1234");

    }

    @Then("^Enter date of birth$")
    public void enter_date_of_birth()  {
        driver.findElement(By.id("day")).sendKeys("10");
        driver.findElement(By.id("month")).sendKeys("Aug");
        driver.findElement(By.id("year")).sendKeys("2020");


    }

    @Then("^Select gender as male$")
    public void select_gender_as_male()  {
        driver.findElement(By.xpath("//*[@id=\"u_9_5_vF\"]")).click();

    }

    @Then("^Click on Sign up button$")
    public void click_on_Sign_up_button()  {
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();

    }

    @Then("^user able to register succesfully\\.$")
    public void user_able_to_register_succesfully() {

    }

    @Then("^User close the Browser$")
    public void user_close_the_Browser()  {

    }
}
