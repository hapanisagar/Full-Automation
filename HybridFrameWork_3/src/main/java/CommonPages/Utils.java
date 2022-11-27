package CommonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils extends BasePage{
    //method for clickOnElement

    public static void clickOnElement(By by){driver.findElement(by).click();}

    //method for enterText
    public static void enterText(By by,String text){driver.findElement(by).sendKeys(text);}

    //( Generic methods - Reusable methods which can be used with different data)
    //           (Create it always outside the main method)
   /* public static void selectValueFromDropDown(WebElement element,String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);*/
    }





