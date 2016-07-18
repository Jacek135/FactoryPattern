package main.java.Pizzeria.Lokale;

import main.java.Pizza.Pizza;
import main.java.Pizzeria.Pizzeria;
import main.java.RodzajePizzy.Wloska.WloskaOwoceMorzaPizza;
import main.java.RodzajePizzy.Wloska.WloskaPepperoniPizza;
import main.java.RodzajePizzy.Wloska.WloskaSerowaPizza;
import main.java.RodzajePizzy.Wloska.WloskaWegetarianskaPizza;

public class WloskaPizzeria extends Pizzeria {

    @Override
    public Pizza utworzPizza(String type) {
        Pizza pizza = null;

        if (type.equals("serowa")) {
            pizza = new WloskaSerowaPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new WloskaPepperoniPizza();
        } else if (type.equals("owocemorza")) {
            pizza = new WloskaOwoceMorzaPizza();
        } else if (type.equals("wegetarianska")) {
            pizza = new WloskaWegetarianskaPizza();
        }
        return pizza;
    }
}
