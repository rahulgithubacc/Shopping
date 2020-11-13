package com.practice.shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddToCart extends BaseTest {

    @Test
    public void addItemsToCart() {
        String add_to_cart_xpath = "//a[@title='Faded Short Sleeve T-shirts']/parent::h5/following-sibling::div[@class='button-container']/a";
        WebElement add_to_cart = driver.findElement(By.xpath(add_to_cart_xpath));
        add_to_cart.click();
    }
}
