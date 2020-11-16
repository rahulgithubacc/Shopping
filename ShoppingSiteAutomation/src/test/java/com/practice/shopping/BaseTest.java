package com.practice.shopping;

import com.practice.common.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @BeforeTest
    @Parameters({"browser"})

    public void beforeTest(String browser) {
        driver = BrowserFactory.createInstance(browser);
        wait = new WebDriverWait(driver, 10);
        driver.get("http://automationpractice.com/index.php");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}

