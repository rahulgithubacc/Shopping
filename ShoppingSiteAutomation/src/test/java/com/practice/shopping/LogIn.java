package com.practice.shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class LogIn extends BaseTest {
    @Test
    public void logInClick() {
        String loginxpath = "//a[contains(text(),'Sign')]";
        driver.findElement(By.xpath(loginxpath)).click();
    }

    @Test
    public void login() {
        String login_email_xpath = "//input[@id = 'email']";
        String password_xpath = "//input[@id='passwd']";
        String button_xpath = "//button[@id='SubmitLogin']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(login_email_xpath)));
        WebElement login_email = driver.findElement(By.xpath(login_email_xpath));
        WebElement password = driver.findElement(By.xpath(password_xpath));
        WebElement button = driver.findElement(By.xpath(button_xpath));
        login_email.sendKeys("rahul_deshmukh_1@yopmail.com");
        password.sendKeys("Rahul1996");
        button.click();
    }

}
