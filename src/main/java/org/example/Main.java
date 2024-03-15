package org.example;

public class Main {
    public static void main(String[] args) {

        Instrument piano = new Instrument(
                3000.00, "Black"
        );

        Instrument violin = new Violin(
                200.00, "Red", 4
        );

        violin.makeNoise();
    }
}