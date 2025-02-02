package com.ddd_bootcamp.domain;

import java.util.*;

public class Cart {
    private UUID id = UUID.randomUUID();
    private List<Product> removedProducts = new ArrayList<>();
    private Map<Product, Integer> items = new HashMap();

    public void add(Product product, int quantity) {
        items.put(product, quantity);
    }

    public void remove(Product product) {
        items.remove(product);
        removedProducts.add(product);
    }

    public List<Product> getRemovedProducts() {
        return removedProducts;
    }

    public List<Product> getProducts() {
        return items.keySet().stream().toList();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + items.keySet().stream().toList() +
                "removed products = " + removedProducts +
                '}';
    }
}
