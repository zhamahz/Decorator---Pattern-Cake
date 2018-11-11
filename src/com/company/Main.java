package com.company;


public class Main {

    public static void main(String[] args) {

        Cake cake1 = new Banana(new IceCream(new Cream(new ChokoCake())));

        System.out.println("Ingredients: " + cake1.getDescription());
        System.out.println("Total cost: $" + cake1.getCost());

        Cake cake2 = new Cream(new Banana(new ChokoCake()));

        System.out.println("Ingredients: " + cake2.getDescription());
        System.out.println("Total cost: $" + cake2.getCost());

        Cake cake3 = new Cream(new Cherry(new CherryCake()));

        System.out.println("Ingredients: " + cake3.getDescription());
        System.out.println("Total cost: $" + cake3.getCost());
    }

}
