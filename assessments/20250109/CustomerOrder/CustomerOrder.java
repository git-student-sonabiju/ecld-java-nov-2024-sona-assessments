package com.ecld.java.assess4a;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerOrder {
	public static Map<String, Double> analyzeOrders(List<Order> orders) {
		return orders.stream()
				.filter(order -> order.getAmount() > 100)  //filter()
				.filter(order -> order.getOrderDate().getYear() == 2024)
				.collect(Collectors.groupingBy(   // collect() and groupingBy()
						Order::getCustomerId,
						Collectors.summingDouble(Order::getAmount)  //summingDouble()
				));
	}

	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
				new Order("C1", 150.0, Arrays.asList("Item1", "Item2"), LocalDate.of(2024, 1,
						15)),
				new Order("C1", 50.0, Arrays.asList("Item3"), LocalDate.of(2024, 1, 20)),
				new Order("C2", 200.0, Arrays.asList("Item1", "Item4"), LocalDate.of(2024, 1,
						15)),
				new Order("C1", 120.0, Arrays.asList("Item2", "Item5"), LocalDate.of(2023, 12,
						15))
		);
		Map<String, Double> result = analyzeOrders(orders);
		result.forEach((customerId, totalAmount) ->
				System.out.println("Customer Id: " + customerId + ", Total Amount: " + totalAmount));
	}
}
