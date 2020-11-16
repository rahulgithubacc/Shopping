package com.practice.shopping;

import com.practice.pages.OrderItems;
import org.testng.annotations.Test;

public class AddToCart extends BaseTest {

    @Test
    public void addItemsToCart() {
        OrderItems orderItems = new OrderItems(this.driver);
        orderItems.order();
    }
}
