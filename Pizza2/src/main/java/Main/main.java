package main.java.Main;

import main.java.Pizza.Pizza;
import main.java.Pizzeria.Lokale.AmerykanskaPizzeria;
import main.java.Pizzeria.Lokale.WloskaPizzeria;
import main.java.Pizzeria.Pizzeria;

public class main {
    public static void main(String[] args){
        Pizzeria wloska = new WloskaPizzeria();
        Pizzeria amerykansa = new AmerykanskaPizzeria();

        Pizza pizza = wloska.zamowPizza("serowa");
        System.out.println("Eryk zamowil: " + pizza.pobierzNazwa() + "\n");

        pizza = amerykansa.zamowPizza("serowa");
        System.out.println("Jacek zamowil: " + pizza.pobierzNazwa() + "\n");
    }
}
