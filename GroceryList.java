package com.company;

import java.util.Scanner;
import static java.lang.System.out;

public class GroceryList {
    public static void main(String[] args) {

        String item1, item2, item3;
        int qty1, qty2, qty3;
        float cost1, cost2, cost3;
        Scanner keyboard = new Scanner(System.in);
        GroceryList grocery = new GroceryList();

        out.println("Please list three items on your grocery shopping list.");

        out.print("Item 1? ");
        item1 = keyboard.nextLine();
        out.print("\nItem 2? ");
        item2 = keyboard.nextLine();
        out.print("\nItem 3? ");
        item3 = keyboard.nextLine();

        out.println("\nNow, please enter the quantity of each item.");

        out.print("How many " + item1 + "? ");
        qty1 = keyboard.nextInt();
        keyboard.skip("\n");
        out.print("\nHow many " + item2 + "? ");
        qty2 = keyboard.nextInt();
        keyboard.skip("\n");
        out.print("\nHow many " + item3 + "? ");
        qty3 = keyboard.nextInt();
        keyboard.skip("\n");

        out.println("\nNow, please enter the price of each item.");

        out.print("How much does one " + item1 + "cost? ");
        cost1 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.print("\nHow much does one " + item2 + "cost? ");
        cost2 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.print("\nHow much does one " + item3 + "cost? ");
        cost3 = keyboard.nextFloat();
        keyboard.skip("\n");

        out.println("\nCalculating your grocery bill.");
        out.println("Your total cost is " + grocery.total(qty1, qty2, qty3, cost1, cost2, cost3));

    }

    private float total(int qty1, int qty2, int qty3, float cost1, float cost2, float cost3) {
        return (qty1 * cost1) + (qty2 * cost2) + (qty3 * cost3);
    }
}
