package main.java.Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String nazwa;
    protected String ciasto;
    protected String sos;
    protected List<String> dodatki = new ArrayList<String>();

    public void przygotowanie(){
        System.out.println("Przygotowanie: " + nazwa);
        System.out.println("Wyrabianie ciasta.");
        System.out.println("Dodawanie sosu");
        System.out.println("Dodatki:  ");

        for(String i: dodatki){
            System.out.println("    " + i);
        }
    }

    public void pieczenie(){
        System.out.println("Pieczenie: 25 minut w temperaturze 350 st C");
    }

    public void krojenie(){
        System.out.println("Krojenie pizzy na 8 kawalow");
    }

    public void pakowanie(){
        System.out.println("Pakowanie pizzy");
    }

    public String pobierzNazwa(){
        return nazwa;
    }
}
