package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    //Constructor
    LoginPage(WebDriver driver){
   this.driver=driver;

    }
   // Store Locator in Variable

    By userName = By.id("user-name");
    By passWord = By.id("password");
    By loginBtn = By.id("login-button");

   /* public void doLogin(String UName,String Pwd){
        driver.findElement(userName).sendKeys(UName);
        driver.findElement(passWord).sendKeys(Pwd);
        driver.findElement(loginBtn).click(); */
    public void enterUsername(String uname){
        driver.findElement(userName).sendKeys(uname);
    }
    public void enterPassword(String pwd){
        driver.findElement(passWord).sendKeys(pwd);
    }
    public void clickOnLoginBtn(){
        driver.findElement(loginBtn).click();
    }


    }

