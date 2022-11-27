package WebElements;

import CommonPages.LoadProperty;
import CommonPages.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    private By _Registrationlink = By.className("ico-register");
    private By _Gender =By.id("gender-male");
    private By _Firstname = By.id("FirstName");
    private By _Lastname = By.id("LastName");
    private By _DateOfBirthDay = By.name("DateOfBirthDay");
    private By _DateOfBirthMonth = By.name("DateOfBirthMonth");
    private By _DateOfBirthYear =  By.name("DateOfBirthYear");
    private By _Email = By.id("Email");
    private By _CompanyDetail = By.id("Company");
    private By _Password = By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");
    private By _RegisterButton = By.xpath("//*[@id=\"register-button\"]");




   public void doRegister(){
            clickOnElement(_Registrationlink);
            clickOnElement(_Gender);
            enterText(_Firstname, loadProperty.getProperty("Firstname"));
            enterText(_Lastname, loadProperty.getProperty("Lastname"));
            enterText(_DateOfBirthDay, loadProperty.getProperty("DateOfBirthDay"));
            enterText(_DateOfBirthMonth, loadProperty.getProperty("DateOfBirthMonth"));
            enterText(_DateOfBirthYear, loadProperty.getProperty("DateOfBirthYear"));

            //selectValueFromDropDown((WebElement) _DateOfBirthDay, loadProperty.getProperty("DateOfBirthDay"));
            //selectValueFromDropDown((WebElement) _DateOfBirthMonth, loadProperty.getProperty("DateOfBirthMonth"));
           // selectValueFromDropDown((WebElement) _DateOfBirthYear, loadProperty.getProperty("DateOfBirthYear"));


   }
}
