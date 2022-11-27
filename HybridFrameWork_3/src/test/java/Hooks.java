import CommonPages.BrowserSelector;
import CommonPages.Utils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.remote.BrowserType;

public class Hooks extends Utils {
    //    Create object for Browser selector class
    BrowserSelector browserSelector = new BrowserSelector();


    @Before
    public void openBrowser(){
        browserSelector.openSelectedBrowser();


    }
    @After
    public void closeBrowser(){

       // driver.quit();




    }


}
