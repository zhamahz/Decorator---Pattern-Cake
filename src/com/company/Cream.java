package com.company;


public class Cream extends CakeMaker {

    public Cream(Cake newCake) {
        super(newCake);

    }

    public String getDescription() {
        return tempCake.getDescription() + ", Cream";
    }

    public double getCost() {
        return tempCake.getCost() + 1.00;

    }

}
