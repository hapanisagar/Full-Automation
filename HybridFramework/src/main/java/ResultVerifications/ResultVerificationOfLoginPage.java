package ResultVerifications;

import CommonPages.Utils;
import org.testng.Assert;

public class ResultVerificationOfLoginPage extends Utils {
    public void loginPageTitle(){
        String Title = driver.getTitle();
        Assert.assertEquals(Title,"nopCommerce demo store. Login","Login page title not matched");
    }


}
