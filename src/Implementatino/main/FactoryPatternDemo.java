package Implementatino.main;

import Implementatino.Factory.ShapeFactory;
import Implementatino.Interfaces.Shape;

public class FactoryPatternDemo {

    public static void main (String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();


    }

}
