package main.java.Pizzeria.Lokale;

import main.java.Pizza.Pizza;
import main.java.Pizzeria.Pizzeria;
import main.java.RodzajePizzy.Amerykanska.AmerykansaOwoceMorzaPizza;
import main.java.RodzajePizzy.Amerykanska.AmerykansaPeperoniPizza;
import main.java.RodzajePizzy.Amerykanska.AmerykansaSerowaPizza;
import main.java.RodzajePizzy.Amerykanska.AmerykansaWegeterianskaPizza;

public class AmerykanskaPizzeria extends Pizzeria{

    @Override
    protected Pizza utworzPizza(String type) {
            Pizza pizza = null;

            if (type.equals("serowa")) {
                pizza = new AmerykansaSerowaPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new AmerykansaPeperoniPizza();
            } else if (type.equals("owocemorza")) {
                pizza = new AmerykansaOwoceMorzaPizza();
            } else if (type.equals("wegetarianska")) {
                pizza = new AmerykansaWegeterianskaPizza();
            }
            return pizza;

    }
}
