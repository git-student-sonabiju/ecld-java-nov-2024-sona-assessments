package com.ecld.java.assesment2b;

import java.time.LocalDateTime;
import java.util.List;

public class PriorityOrder extends Order
{
    protected boolean expressShipping;
    protected double additionalFee;

    public PriorityOrder(String orderId, String customerName, LocalDateTime orderDate, List<OrderItem> items,boolean expressShipping, double additionalFee)
    {
        super(orderId, customerName, orderDate, items);
        this.expressShipping = expressShipping;
        this.additionalFee = additionalFee;
    }

}
