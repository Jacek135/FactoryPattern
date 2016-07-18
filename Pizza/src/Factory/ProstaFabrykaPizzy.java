package Factory;

import Implementation.OwoceMozaPizza;
import Implementation.PepperoniPizza;
import Implementation.SerowaPizza;
import Implementation.WegetarianskaPizza;
import Interfaces.Pizza;

public class ProstaFabrykaPizzy {

    public Pizza utworzPizza(String type){
        Pizza pizza = null;

        if(type.equals("serowa")){
            pizza = new SerowaPizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if (type.equals("owocemorza")){
            pizza = new OwoceMozaPizza();
        } else if (type.equals("wegetarianska")) {
            pizza = new WegetarianskaPizza();
        }
        return pizza;
    }
}
