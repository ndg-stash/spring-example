package ru.gb.spring.example.component;

import org.springframework.stereotype.Component;

@Component
public class Worker {

    public void work() {
        System.out.println("Work someyhing");
    }
}
