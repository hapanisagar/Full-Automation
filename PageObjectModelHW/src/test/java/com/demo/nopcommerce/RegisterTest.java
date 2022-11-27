package com.demo.nopcommerce;

import com.demo.nopcommerce.Base.BasePage;
import com.demo.nopcommerce.Pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class RegisterTest {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    RegisterPage registerPage;
    @BeforeMethod
    public void openBrowser() throws IOException {
        basePage = new BasePage();
        prop = basePage. initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        registerPage =new RegisterPage(driver);


    }
    @Test
    public void registerTest(){
        registerPage.clickOnRegisterLink();
        registerPage.doRegister(prop.getProperty("Firstname"), prop.getProperty("Lastname"),prop.getProperty("DateOfBirthDay"), prop.getProperty("DateOfBirthMonth"),prop.getProperty("DateOfBirthYear"), prop.getProperty("Email"), prop.getProperty("CompanyDetail"), prop.getProperty("Password"), prop.getProperty("ConfirmPassword") );

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
