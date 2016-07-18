package main.java.RodzajePizzy.Wloska;

import main.java.Pizza.Pizza;

public class WloskaWegetarianskaPizza extends Pizza {

    public WloskaWegetarianskaPizza(){
        nazwa = this.getClass().toString();
        ciasto = "Cienkie kruche ciasto";
        sos = "Sos Marinara";
        dodatki.add("Tarty ser Reggiano");
    }
}
