package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class SandwichShopNew {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        SandwichShopNew goal = new SandwichShopNew();

        out.println("Checking sales goals.");

        boolean veggie = goal.GoalCheck("Veggie Sandwitch", goalForVeggies);
        boolean burger = goal.GoalCheck("burgers", goalForBurgers);
        boolean subs = goal.GoalCheck("subs", goalForSubs);
        boolean soup = goal.GoalCheck("soup", goalForSoup);

        if (veggie && burger && subs && soup)
            out.println("\nMade goal for everything!");

    }

    private boolean GoalCheck(String item, int goalForItem) {

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
