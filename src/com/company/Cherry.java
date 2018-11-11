package com.company;

public class Cherry extends CakeMaker {

    public Cherry(Cake newCake) {
        super(newCake);

    }

    public String getDescription() {
        return tempCake.getDescription() + ", Cherry";
    }

    public double getCost() {
        return tempCake.getCost() + 2.00;

    }
}
