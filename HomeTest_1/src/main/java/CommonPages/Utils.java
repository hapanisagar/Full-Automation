package CommonPages;

import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {
    public static void clickOnElement(By by){driver.findElement(by).click();}

    public static String dateStamp(){
        SimpleDateFormat format = new SimpleDateFormat("mm.dd.yyyy.hh.");
        return format.format(new Date());

    }


}
