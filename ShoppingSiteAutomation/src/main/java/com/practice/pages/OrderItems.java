package com.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderItems {
    private WebDriver driver;
    public OrderItems(WebDriver driver) {
        this.driver = driver;
    }
    public void order() {
        String add_to_cart_xpath = "//a[@title='Faded Short Sleeve T-shirts']/parent::h5/following-sibling::div[@class='button-container']/a";
        WebElement add_to_cart = driver.findElement(By.xpath(add_to_cart_xpath));
        add_to_cart.click();
    }
}
