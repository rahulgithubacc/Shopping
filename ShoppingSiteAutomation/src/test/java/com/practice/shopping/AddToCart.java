package com.practice.shopping;

import com.practice.pages.OrderItemsPage;
import org.testng.annotations.Test;

public class AddToCart extends BaseTest {

    @Test
    public void addItemsToCart() {
        OrderItemsPage orderItems = new OrderItemsPage(this.driver);
        orderItems.order();
    }
}
