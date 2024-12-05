package com.ecld.java.assesment2b;

import java.time.LocalDateTime;
import java.util.List;

public class RegularOrder extends Order {
    protected double minimumForDiscount = 100.0;
    protected double discountPercent = 10.0;

    public RegularOrder(String orderId, String customerName, LocalDateTime orderDate, List<OrderItem> items) {
        super(orderId, customerName, orderDate, items);
    }

    @Override
    public double calculateTotal() {
        return items.stream().mapToDouble(OrderItem::getTotalPrice).sum();
    }

    @Override
    public double calculateDiscount() {
        double total = calculateTotal();
        return total >= minimumForDiscount ? total * (discountPercent / 100) : 0;
    }
}
