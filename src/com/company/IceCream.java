package com.company;

public class IceCream extends CakeMaker {

    public IceCream(Cake newCake) {
        super(newCake);

    }

    public String getDescription() {
        return tempCake.getDescription() + ", Ice Cream";
    }

    public double getCost() {
        return tempCake.getCost() + 1.45;

    }

}