package CommonPages;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperty {
    static Properties prop;
    static FileInputStream input;
    static String filelocation = "C:\\Users\\SAGAR\\IdeaProjects\\HybridFramework\\src\\test\\resources\\TestData\\config.properties";


    public String getProperty(String keyName) {
        prop = new Properties();
        try {
            input = new FileInputStream(filelocation);
            prop.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //getting keyName
        return prop.getProperty(keyName);
    }
}

