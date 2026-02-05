package com.example.u5d3.entities;

import com.example.u5d3.U5D3Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private final ApplicationContext ctx;

    public MyRunner(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public void run(String... args) throws Exception {
        Menu menu = ctx.getBean(Menu.class);
        menu.printMenu();

        Ordine ordine = ctx.getBean(Ordine.class);
        System.out.println(ordine);

    }
}
