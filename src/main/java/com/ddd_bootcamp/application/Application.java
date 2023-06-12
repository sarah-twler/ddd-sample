package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Price;
import com.ddd_bootcamp.domain.Product;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product applePencil = new Product("Apple Pencil", new Price(50));
        Product headPhone = new Product("Sony Wireless headphone", new Price(100));
        cart.add(applePencil, 2);
        cart.add(headPhone, 1);

        cart.remove(applePencil);

        System.out.println("Cart = " + cart);
        List<Product> products = cart.getProducts();

        System.out.println("----------------------------------------");
        System.out.println("products = " + products);
        System.out.println("----------------------------------------");

    }
}
