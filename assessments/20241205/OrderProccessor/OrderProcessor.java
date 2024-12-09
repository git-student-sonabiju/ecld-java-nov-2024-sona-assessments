package com.ecld.java.assesment2b;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderProcessor
{
     private LinkedList<Order> orders;

        public OrderProcessor() {
            orders = new LinkedList<>();
        }

        public void processOrder(Order order) {
            orders.add(order);
        }

        public List<Order> getOrdersByCustomer(String customerName) {
            return orders.stream()
                    .filter(order -> order.getCustomerName().equalsIgnoreCase(customerName))
                    .collect(Collectors.toList());
        }

        public double getTotalRevenue() {
            return orders.stream().mapToDouble(Order::calculateTotal).sum();
        }

        public double getAverageOrderValue() {
            return orders.stream().mapToDouble(Order::calculateTotal).average().orElse(0);
        }

        public List<String> getTopCustomers(int n) {
            return orders.stream()
                    .collect(Collectors.groupingBy(Order::getCustomerName, Collectors.summingDouble(Order::calculateTotal)))
                    .entrySet().stream()
                    .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                    .limit(n)
                    .map(e -> e.getKey())
                    .collect(Collectors.toList());
        }

        public void processOrdersInFIFO() {
            while (!orders.isEmpty()) {
                Order order = orders.removeFirst();
            }
        }
    }
