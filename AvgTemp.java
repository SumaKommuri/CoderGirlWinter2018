package com.company;

import static java.lang.System.out;

public class AvgTemp {
    public static void main(String[] args) {

        int week1[] = {65, 68, 72, 83, 73, 66, 85};
        int week2[] = {86, 87, 85, 78, 79, 78, 80};
        String weekdays[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int wk1sum = 0, wk2sum = 0, wk1high = week1[0], wk2high = week2[0], wk1highindex = 0, wk2highindex = 0;


        for (int index = 0; index < weekdays.length; index++) {
            wk1sum += week1[index];
            wk2sum += week2[index];
            if (wk1high < week1[index]) {
                wk1high = week1[index];
                wk1highindex = index;
            }

            if (wk2high < week2[index]) {
                wk2high = week2[index];
                wk2highindex = index;
            }
        }
        out.println("The average daily-high temperature for week 1 is " + (wk1sum / week1.length) + ".");
        out.println("The average daily-high temperature for week 2 is " + (wk2sum / week2.length) + ".");
        out.println("In week 1," + weekdays[wk1highindex] + " was warmest, at " + wk1high + " degrees.");
        out.println("In week 2," + weekdays[wk2highindex] + " was warmest, at " + wk2high + " degrees.");

    }
}
