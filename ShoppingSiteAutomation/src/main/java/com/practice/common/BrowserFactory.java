package com.practice.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver createInstance(String browserName) {
        BrowserType browserType = BrowserType.valueOf(browserName);
        WebDriver driver = null;
        switch (browserType) {
            case LOCAL_CHROME:
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case LOCAL_FIREFOX:
                System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;

        }
        return driver;
    }
}
