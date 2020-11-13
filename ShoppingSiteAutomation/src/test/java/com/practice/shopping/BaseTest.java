package com.practice.shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("http://automationpractice.com/index.php");
    }
    @AfterSuite
    public void afterTest() {
        driver.quit();
    }
}
