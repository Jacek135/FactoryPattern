package main.java.RodzajePizzy.Amerykanska;

import main.java.Pizza.Pizza;

public class AmerykansaOwoceMorzaPizza extends Pizza{

    public AmerykansaOwoceMorzaPizza(){
        nazwa = this.getClass().toString();
        ciasto = "Extra grube, chrupie ciasto";
        sos = "Sos z poidorow sliwkowych";
        dodatki.add("Grubo tarty ser Mozzarella");
    }

    public void krojenie(){
        System.out.println("Krojenie pizzy na kwadratowe kawalki");
    }
}
