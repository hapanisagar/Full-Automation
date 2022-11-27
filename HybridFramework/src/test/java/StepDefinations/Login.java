package StepDefinations;

import ResultVerifications.ResultVerificationForHomePage;
import ResultVerifications.ResultVerificationOfLoginPage;
import WebElements.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {
    LoginPage loginPage =new LoginPage();
    ResultVerificationOfLoginPage resultVerificationOfLoginPage = new ResultVerificationOfLoginPage();
    ResultVerificationForHomePage resultVerificationForHomePage = new ResultVerificationForHomePage();

    @Given("^User on login page and  verify login page title$")
    public void user_on_login_page_and_verify_login_page_title()  {
        resultVerificationOfLoginPage.loginPageTitle();

    }

    @Then("^User enter username and password and click on login button$")
    public void user_enter_username_and_password_and_click_on_login_button(){
        loginPage.doLogin();

    }

    @Then("^User is on Home page of user$")
    public void user_is_on_Home_page_of_user() {
        resultVerificationForHomePage.homePageTitle();

    }




}
