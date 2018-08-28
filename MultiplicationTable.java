package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        out.println("Welcomw to multiplication tables \n");
        out.println("How large would you like to see them \n");
        int size = keyboard.nextInt();
        keyboard.skip("\n");

        for (int x = 0; x <= size; x++) {
            for (int y = 0; y <= size; y++) {
                out.println(x + "*" + y + "=" + (x * y));
            }
        }

    }
}
