package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import read.ReadFile;

import java.util.ResourceBundle;

public class BrowserExec {

    private static WebDriver driver;
    /*private static CharSequence osString = "Mac";*/

    public static WebDriver getChromeDriver(String browserName) {

        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setJavascriptEnabled(true);
        desiredCapabilities.setBrowserName(browserName);
        selectOS();
        driver = new ChromeDriver();
        return driver;
    }

    public static void selectOS(){

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")){
            System.setProperty(BaseTest.configProp.getString("chromePath"),
                    BaseTest.configProp.getString("chromeDriverPath"));        }
        else if (os.contains("mac")){
            System.setProperty(BaseTest.configProp.getString("chromePath"),
                    BaseTest.configProp.getString("chromeDriverPathMac"));        }
        else if (os.contains("nix") || os.contains("aix") || os.contains("nux")){
        }
    }

    /*public static void selectOS(){

        if (getOperatingSystem().contains(osString))
        {
            System.setProperty(BaseTest.configProp.getString("chromePath"),
                    BaseTest.configProp.getString("chromeDriverPathMac"));
        }else
        {
            System.setProperty(BaseTest.configProp.getString("chromePath"),
                    BaseTest.configProp.getString("chromeDriverPath"));
        }
    }

    public static String getOperatingSystem() {
        String os = System.getProperty("os.name");
        return os;
    }*/

    public static WebDriver getFirefox(String browserName) {

        DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
        desiredCapabilities.setJavascriptEnabled(true);
        desiredCapabilities.setBrowserName(browserName);
        System.setProperty(BaseTest.configProp.getString("chromePath"), BaseTest.configProp.getString("chromeDriverPath"));
        driver = new FirefoxDriver();
        return driver;
    }
}