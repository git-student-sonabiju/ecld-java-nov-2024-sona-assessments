package com.ecld.java.assesment2b;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Order
{
    protected String orderId;
    protected String customerName;
    protected LocalDateTime orderDate;
    protected List<OrderItem> items;

    public Order(String orderId,String customerName,LocalDateTime orderDate,List<OrderItem> items)
    {
        this.orderId=orderId;
        this.customerName=customerName;
        this.orderDate=orderDate;
        this.items=items;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }
    public abstract double calculateTotal();
    public abstract double calculateDiscount();

}
