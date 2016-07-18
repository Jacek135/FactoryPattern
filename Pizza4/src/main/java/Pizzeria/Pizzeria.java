package main.java.Pizzeria;

import main.java.Pizza.Pizza;

public abstract class Pizzeria {
    public Pizza zamowPizza (String type){
        Pizza pizza;

        pizza = utworzPizza(type);

        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();

        return pizza;
    }

    protected abstract Pizza utworzPizza(String type);

}
