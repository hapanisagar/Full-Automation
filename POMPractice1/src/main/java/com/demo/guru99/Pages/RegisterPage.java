package com.demo.guru99.Pages;

import com.demo.guru99.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    Utils utils;

    //    1.  Create your page object/object repository in the form of By Locators
    By registerLink = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By phone = By.name("phone");
    By email = By.id("userName");
    By address = By.name("address1");
    By city = By.name("city");
    By state = By.name("state");
    By postCode= By.name("postalCode");
    By country = By.name("country");
    By userName = By.id("email");
    By password = By.name("password");
    By confPassword = By.name("confirmPassword");
    By registerButton = By.name("submit");

    //    2. Create a constructor of SpecificPage class
    public RegisterPage(WebDriver driver){
        this.driver = driver;
        utils = new Utils(driver);


    }
    //    3. Page Actions
     public void clickOnRegisterLink(){
        utils.doClick(registerLink);

}
     public void doRegister(String FirstName,String LastName,String Phone,String Email,String Address,String City,String State,String PostCode,String Country,String Username,String Password,String Confirmpassword ){
        utils.doSendkey(firstName,FirstName);
        utils.doSendkey(lastName,LastName);
         utils.doSendkey(phone,Phone);
         utils.doSendkey(email,Email);
         utils.doSendkey(address,Address);
         utils.doSendkey(city,City);
         utils.doSendkey(state,State);
         utils.doSendkey(postCode,PostCode);
         utils.doSendkey(country,Country);
         utils.doSendkey(userName,Username);
         utils.doSendkey(password,Password);
         utils.doSendkey(confPassword,Confirmpassword);
         utils.doClick(registerButton);


     }
     public void acceptall(){
        driver.findElement(By.id("save")).click();

     }


}

