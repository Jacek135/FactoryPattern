package Implementatino.Implementation;


import Implementatino.Interfaces.Shape;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draww() method");
    }
}
