package GherkinFile;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();

    @Before

    public void setUpBrowser(){

        browserSelector.setUpBrowser();

       driver.manage().window().maximize();

        driver.get("http://demo.nopcommerce.com");

    }
    @After
    public void closeBrowser(){
        driver.quit();

    }

}
