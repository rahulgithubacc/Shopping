package com.practice.shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Registration extends BaseTest{

    @Test
    public void logInClick() {
        String loginxpath = "//a[contains(text(),'Sign')]";
        driver.findElement(By.xpath(loginxpath)).click();
    }

    @Test
    public void registration() {
        String reg_mail_xpath = "//input[@id='email_create']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reg_mail_xpath)));
        WebElement email = driver.findElement(By.xpath(reg_mail_xpath));
        email.sendKeys("rahul_deshmukh_1@yopmail.com ");
    }

}
