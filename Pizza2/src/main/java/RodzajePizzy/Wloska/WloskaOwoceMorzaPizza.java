package main.java.RodzajePizzy.Wloska;

import main.java.Pizza.Pizza;

public class WloskaOwoceMorzaPizza extends Pizza {

    public WloskaOwoceMorzaPizza(){
        nazwa = this.getClass().toString();
        ciasto = "Cienkie kruche ciasto";
        sos = "Sos Marinara";
        dodatki.add("Tarty ser Reggiano");
    }
}
