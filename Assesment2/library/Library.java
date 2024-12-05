package com.ecld.java.assesment2a;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void removeItem(String id) {
        items.removeIf(item -> item.getId().equals(id));
    }

    public LibraryItem searchByTitle(String title) {
        return items.stream()
                .filter(item -> item.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    public boolean borrowItem(String id) {
        for (LibraryItem item : items) {
            if (item.getId().equals(id) && item.isAvailable()) {
                item.setAvailable(false);
                return true;
            }
        }
        return false;
    }

    public boolean returnItem(String id) {
        for (LibraryItem item : items) {
            if (item.getId().equals(id) && !item.isAvailable()) {
                item.setAvailable(true);
                return true;
            }
        }
        return false;
    }

    public List<LibraryItem> getOverdueItems(int daysOverdue) {
        return items.stream()
                .filter(item -> !item.isAvailable() && item.calculateLateFee(daysOverdue) > 0)
                .collect(Collectors.toList());
    }
}