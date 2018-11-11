package com.company;

public class Banana extends CakeMaker {

    public Banana(Cake newCake) {
        super(newCake);

    }

    public String getDescription() {
        return tempCake.getDescription() + ", Banana";
    }

    public double getCost() {
        return tempCake.getCost() + 1.80;

    }
}