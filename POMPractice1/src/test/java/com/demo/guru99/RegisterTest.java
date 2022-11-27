package com.demo.guru99;

import com.demo.guru99.Base.BasePage;
import com.demo.guru99.Pages.RegisterPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class RegisterTest {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    RegisterPage registerPage;

    @BeforeMethod
    public void openBrowser() throws InterruptedException {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        //Thread.sleep(5000);
       // Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"denyAll\"]/span[1]/div/span")).click();
        //driver.manage().deleteAllCookies();
        registerPage =new RegisterPage(driver);

      }
      @Test
        public void registerTest(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        registerPage.acceptall();
        registerPage.clickOnRegisterLink();
        registerPage.doRegister(prop.getProperty("FirstName"),prop.getProperty("LastName"), prop.getProperty("Phone"), prop.getProperty("Email"), prop.getProperty("Address"), prop.getProperty("City"), prop.getProperty("State/Province"), prop.getProperty("PostalCode"), prop.getProperty("Country"), prop.getProperty("UserName"), prop.getProperty("Password"), prop.getProperty("ConfirmPassword") );
    }
        @AfterMethod
        public  void closeBrowser(){
        driver.quit();
     }

}