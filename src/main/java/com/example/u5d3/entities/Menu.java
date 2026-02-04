package com.example.u5d3.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Menu {
    @Autowired
    private List<Pizza> pizze;
    @Autowired
    private List<Drink> drinksList;

    public void printMenu(){
        System.out.println("MENU");
        System.out.println("--------");
        System.out.println("Pizze:");
        pizze.forEach(p-> System.out.println(p));
        System.out.println();
        System.out.println("Bevande");
        drinksList.forEach(d -> System.out.println(d));
    }

    public Menu(List<Pizza> pizze, List<Drink> daBere) {
        this.pizze = pizze;
        this.drinksList = daBere;
    }

    public Menu() {
    }

}
