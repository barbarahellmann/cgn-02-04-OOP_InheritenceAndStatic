package org.example;


public class Violin extends Instrument {
    int numberOfStrings;

    public Violin(double price, String color, int numberOfStrings){
        super(price,color);
    this.numberOfStrings = numberOfStrings;
    }
}
