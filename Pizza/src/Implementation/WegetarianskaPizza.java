package Implementation;

import Interfaces.Pizza;

public class WegetarianskaPizza implements Pizza {
    @Override
    public void przygotowanie() {
        System.out.println("Szukam skladnikow");
    }

    @Override
    public void pieczenie() {
        System.out.println("Pieke");
    }

    @Override
    public void krojenie() {
        System.out.println("Kroje");
    }

    @Override
    public void pakowanie() {
        System.out.println("Pakuje");
    }
}
