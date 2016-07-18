package main.java.Pizza;


import Factory.ProstaFabrykaPizzy;
import Interfaces.Pizza;

public class Pizzeria {
    ProstaFabrykaPizzy fabryka;

    public Pizzeria(ProstaFabrykaPizzy fabryka){
        this.fabryka = fabryka;
    }

    public Pizza zamowPizza(String type){
        Pizza pizza;

        pizza = fabryka.utworzPizza(type);

        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();
        return pizza;
    }
}
