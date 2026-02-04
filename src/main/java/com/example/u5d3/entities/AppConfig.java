package com.example.u5d3.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean(name = "toppings_tomato")
    public Topping toppingTomatoBean() {
        return new Topping(0, 0,"Tomato");
    }

    @Bean(name = "toppings_cheese")
    public Topping toppingCheeseBean() {
        return new Topping( 92, 1.2,"Cheese");
    }

    @Bean (name= "Salami")
    public Topping toppingSalami() { return new Topping (123,1.3, "Salami");}


    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        return new Pizza("Pizza Margherita", tList);
    }

    @Bean (name="pizza_salami")
    public Pizza pizzaSalamiBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalami());
        return new Pizza("Pizza Salami", tList);
    }

    @Bean(name= "Water")
    public Drink drinkWaterBean(){
            return new Drink(0,2.5,"Water");
    }

    @Bean
    public List<Pizza> pizzaList(){
        List<Pizza> pizze = new ArrayList<>();
        pizze.add(pizzaMargheritaBean());
        pizze.add(pizzaSalamiBean());
        return pizze;
    }

    @Bean
    public List<Drink> drinksList(){
        List<Drink> drinks = new ArrayList<>();
        drinks.add(drinkWaterBean());
        return drinks;
    }


}
