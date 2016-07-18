package Zamowienia;

import Factory.ProstaFabrykaPizzy;
import main.java.Pizza.Pizzeria;

public class Main {
    public static void main(String[] arg) {
        ProstaFabrykaPizzy prostaFabrykaPizzy = new ProstaFabrykaPizzy();

        Pizzeria pizzeria = new Pizzeria(prostaFabrykaPizzy);
        pizzeria.zamowPizza("wegetarianska");

    }
}
