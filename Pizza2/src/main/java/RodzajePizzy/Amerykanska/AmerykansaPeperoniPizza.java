package main.java.RodzajePizzy.Amerykanska;

import main.java.Pizza.Pizza;

public class AmerykansaPeperoniPizza extends Pizza{

    public AmerykansaPeperoniPizza(){
        nazwa = this.getClass().toString();
        ciasto = "Extra grube, chrupie ciasto";
        sos = "Sos z poidorow sliwkowych";
        dodatki.add("Grubo tarty ser Mozzarella");
    }

    public void krojenie(){
        System.out.println("Krojenie pizzy na kwadratowe kawalki");
    }
}
