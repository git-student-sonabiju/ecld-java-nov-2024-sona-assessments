package com.ecld.java.assess4a;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private String customerId;
	private double amount;
	private List<String> items;
	private LocalDate orderDate;

	// Constructors,getters and setters
	public Order(String customerId, double amount, List<String> items, LocalDate orderDate) {
		this.customerId = customerId;
		this.amount = amount;
		this.items = items;
		this.orderDate = orderDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public double getAmount() {
		return amount;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}
}