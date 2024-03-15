package org.example;


public class Instrument {
            double price;
            String color;

        public Instrument(double price, String color) {
            this.price = price;
            this.color = color;
        }
        public void makeNoise(){
            System.out.println("Instrument sounds");
        }
}
