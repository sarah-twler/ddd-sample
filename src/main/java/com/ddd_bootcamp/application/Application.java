package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Price;
import com.ddd_bootcamp.domain.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Map<String, Price> competitorPrices = new HashMap<>();
        competitorPrices.put("Apple Pencil", new Price(100.00, "USD"));
        competitorPrices.put("Sony Wireless headphone", new Price(100.00, "USD"));

        Product applePencil = new Product("Apple Pencil", new Price(competitorPrices.get("Apple Pencil").getPrice() * 0.9, "USD"));
        Product headPhone = new Product("Sony Wireless headphone", new Price(100.00, "USD"));

        cart.add(applePencil, 1);
        cart.add(headPhone, 1);

        cart.remove(applePencil);

        System.out.println("Cart = " + cart);
        List<Product> products = cart.getProducts();

        System.out.println("----------------------------------------");
        System.out.println("products = " + products);
        System.out.println("----------------------------------------");

    }
}
