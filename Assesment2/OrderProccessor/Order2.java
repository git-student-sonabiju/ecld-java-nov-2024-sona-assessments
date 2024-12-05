package com.ecld.java.assesment2b;
import java.util.Iterator;
import java.util.LinkedList;

public class Order2 implements Iterator<Order> {
    private LinkedList<Order> orders;
    private int currentIndex = 0;

    public Order2(LinkedList<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < orders.size();
    }

    @Override
    public Order next() {
        return orders.get(currentIndex++);
    }
}
