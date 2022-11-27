package StepDefinations;

import WebElements.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Register {
    RegisterPage registerPage = new RegisterPage();
    @Given("^User able to open browser$")
    public void user_able_to_open_browser()  {

    }

    @Given("^Enter Url$")
    public void enter_Url()  {

    }

    @Then("^User click on register link$")
    public void user_click_on_register_link()  {
        registerPage.doRegister();


    }

    @Then("^User on register page and verify register page title$")
    public void user_on_register_page_and_verify_register_page_title()  {

    }

    @Then("^select gender as male$")
    public void select_gender_as_male()  {

    }

    @Then("^enter first name and last name$")
    public void enter_first_name_and_last_name()  {

    }

    @Then("^enter Date of birth$")
    public void enter_Date_of_birth() {

    }

    @Then("^enter email id$")
    public void enter_email_id()  {

    }

    @Then("^enter company detail$")
    public void enter_company_detail()  {

    }

    @Then("^Uncheck  in newsletter field box$")
    public void uncheck_in_newsletter_field_box()  {

    }

    @Then("^enter Password$")
    public void enter_Password()  {

    }

    @Then("^enter confirm password$")
    public void enter_confirm_password()  {

    }

    @Then("^click on register button$")
    public void click_on_register_button() {

    }

    @Then("^user able to register succesfully\\.$")
    public void user_able_to_register_succesfully()  {

    }

    @Then("^User close the Browser$")
    public void user_close_the_Browser()  {

    }

}
