package com.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Authentication {
    private WebDriver driver;
    private WebDriverWait wait;

    public Authentication(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void signIn() {
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
    public void registration() {
        String reg_mail_xpath = "//input[@id='email_create']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reg_mail_xpath)));
        WebElement email = driver.findElement(By.xpath(reg_mail_xpath));
        email.sendKeys("rahul_deshmukh_1@yopmail.com ");
    }
}
