package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class SandwichShop {
    public static void main(String[] args) {

        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        SandwichShop item = new SandwichShop();

        out.println("Checking sales goals.");

        boolean veggie = item.goalCheck("Veggie Sandwitch", goalForVeggies);
        boolean burger = item.goalCheck("burgers", goalForBurgers);
        boolean subs = item.goalCheck("subs", goalForSubs);
        boolean soup = item.goalCheck("soup", goalForSoup);

        if (veggie && burger && subs && soup)
            out.println("\nMade goal for everything!");

    }

    private boolean goalCheck(String item, int goalForItem) {

        int soldItem;
        Scanner keyboard = new Scanner(System.in);

        out.println("The sales goal for " + item + " is " + goalForItem);
        out.println("How many " + item + " were sold today?");
        soldItem = keyboard.nextInt();
        keyboard.skip("\n");

        if (soldItem >= goalForItem) {
            out.println("\nMade goal for " + item + ".");
            return true;
        } else {
            out.println("\nFell short for " + item + ".");
            return false;
        }
    }
}
