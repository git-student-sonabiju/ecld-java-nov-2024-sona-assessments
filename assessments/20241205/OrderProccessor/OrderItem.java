package com.ecld.java.assesment2b;

public class OrderItem
{
    protected String productId;
    protected int quantity;
    protected double pricePerUnit;

    public OrderItem(String productId,int quantity,double pricePerUnit)
    {
        this.productId=productId;
        this.quantity=quantity;
        this.pricePerUnit=pricePerUnit;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
    public double getTotalPrice()
    {
        return quantity*pricePerUnit;
    }
}
