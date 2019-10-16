package GherkinFile;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class BrowserSelector extends Utils {
    LoadProps loadProps = new LoadProps();

    @Test
    public void setUpBrowser() {
        String browser = loadProps.getProperty("browser");
        //String browser = System.getProperty("browser");

        if (browser.equalsIgnoreCase("firefox")) {
          System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
          driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
           System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("IE")) {
           DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

            capabilities.setCapability("browser", "IE");
            capabilities.setCapability("ignoreProtectedModeSettings",true);

            System.setProperty(("webdriver.ie.driver"), "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");

            driver = new InternetExplorerDriver();



       } else {
            System.out.println("Browser name is empty or typed wrong " + browser );
        }
    }
}
