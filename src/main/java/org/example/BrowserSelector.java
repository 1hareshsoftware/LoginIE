package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends BasePage {
    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getProperty("browser");

    public void setUPBrowser() {

        //if (browser.equalsIgnoreCase("internet explorer")) {
            System.setProperty("webdriver.ie.driver", "src\\Resource\\BrowserDrivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
       // } else {
         //   System.out.println("Browser is Wrong");



    }
}
