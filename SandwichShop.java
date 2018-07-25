package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class SandwichShop {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int soldVeggies;
        int soldBurgers;
        int soldSubs;
        int soldSoup;

        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today?");
        soldVeggies = keyboard.nextInt();
        keyboard.skip("\n");

        if (soldVeggies >= goalForVeggies)
            out.println("\nMade goal for veggies.");
        else
            out.println("\nFell short for veggies.");


        out.println("The sales goal for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today?");
        soldBurgers = keyboard.nextInt();
        keyboard.skip("\n");

        if (soldBurgers >= goalForBurgers)
            out.println("\nMade goal for burgers.");
        else
            out.println("\nFell short for burgers.");


        out.println("The sales goal for subs is " + goalForSubs);
        out.println("How many subs were sold today?");
        soldSubs = keyboard.nextInt();
        keyboard.skip("\n");

        if (soldSubs >= goalForSubs)
            out.println("\nMade goal for subs.");
        else
            out.println("\nFell short for subs.");

        out.println("The sales goal for soup is " + goalForSoup);
        out.println("How many soup were sold today?");
        soldSoup = keyboard.nextInt();
        keyboard.skip("\n");

        if (soldSoup >= goalForSoup)
            out.println("\nMade goal for soup.");
        else
            out.println("\nFell short for soup.");

        if ((soldVeggies >= goalForVeggies) && (soldBurgers >= goalForBurgers) && (soldSubs >= goalForSubs) && (soldSoup >= goalForSoup))
            out.println("\nMade goal for everything!");
    }
}