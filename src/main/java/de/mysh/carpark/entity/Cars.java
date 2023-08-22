package de.mysh.carpark.entity;

public class Cars {
    public String colour;
    public String make;

    public Cars(String colour, String make) {
        this.colour = colour;
        this.make = make;
    }

    public void drivesAndBreaks() {
        System.out.println("Эта машина может ехать и тормозиить.");
    }
}

