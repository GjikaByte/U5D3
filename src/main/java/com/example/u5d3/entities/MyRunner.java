package com.example.u5d3.entities;

import com.example.u5d3.U5D3Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        ConfigurableApplicationContext ctx = SpringApplication.run(U5D3Application.class, args);
        Menu m = ctx.getBean(Menu.class);
        m.printMenu();

    }
}
