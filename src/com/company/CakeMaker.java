package com.company;


public abstract class CakeMaker implements Cake {

    protected Cake tempCake;

    public CakeMaker(Cake newCake) {

        this.tempCake = newCake;
    }

    public String getDescription() {
        return tempCake.getDescription();
    }

    public double getCost() {
        return tempCake.getCost();

    }

}