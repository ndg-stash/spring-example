package ru.gb.spring.example.component;

import org.springframework.stereotype.Component;

@Component
public class Seller {
    public void sell() {
        System.out.println("Sell some items");
    }
}
