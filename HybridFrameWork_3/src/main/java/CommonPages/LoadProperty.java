package CommonPages;

import java.io.FileInputStream;

import java.util.Properties;

public class LoadProperty {
   static Properties prop;
    static FileInputStream input;

// store configproperties file location in variable as fileLocation
static String fileLocation ="C:\\Users\\SAGAR\\IdeaProjects\\HybridFrameWork_3\\src\\test\\resources\\TestData\\config.properties";

public String getProperty(String keyName)  {

    prop = new Properties();
    try {
        input = new FileInputStream(fileLocation);
        prop.load(input);
        input.close();
    }catch (Exception e){
        e.printStackTrace();
    }
    return prop.getProperty(keyName);
}
}
