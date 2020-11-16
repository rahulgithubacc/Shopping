package com.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickSignIn() {
        String signInXpath = "//a[contains(text(),'Sign')]";
        driver.findElement(By.xpath(signInXpath)).click();
    }


}
