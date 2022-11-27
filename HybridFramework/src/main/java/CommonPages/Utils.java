package CommonPages;

import org.openqa.selenium.By;

public class Utils extends BasePage{
    //Method for click on WebElement
    public static void clickOnElement(By by){driver.findElement(by).click();}

    //Method for enterText
    public static void doSendkey(By by,String text){driver.findElement(by).sendKeys(text);}


}
