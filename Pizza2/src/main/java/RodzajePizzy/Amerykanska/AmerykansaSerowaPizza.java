package main.java.RodzajePizzy.Amerykanska;

import main.java.Pizza.Pizza;

public class AmerykansaSerowaPizza extends Pizza{

    public AmerykansaSerowaPizza(){
        nazwa = "Amerykansa Pizza Serowa";
        ciasto = "Extra grube, chrupie ciasto";
        sos = "Sos z poidorow sliwkowych";
        dodatki.add("Grubo tarty ser Mozzarella");
    }

    public void krojenie(){
        System.out.println("Krojenie pizzy na kwadratowe kawalki");
    }
}
