package com.company;

import static java.lang.System.out;

public class Temperatures {
    public static void main(String[] args) {
        int temp[][] = {{68, 70, 76, 70, 68, 71, 75}, {76, 76, 87, 84, 82, 75, 83}, {73, 72, 81, 78, 76, 73, 77}, {64, 65, 69, 68, 70, 74, 72}};
        String time[] = {"7:00 AM", "3:00 PM", "7:00 PM", "3:00 AM"};
        String days[] = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int timeSumArr[] = new int[4];
        int daySumArr[] = new int[7];
        int timeSum = 0, daySum = 0, tot = 0;

        out.println("Temperature Calculator \n");
        out.println("The data provided are:");

        for (int r = 0; r < time.length; r++) {
            out.print(time[r] + ": ");
            int c;
            for (c = 0; c < 7; c++) {
                timeSum += temp[r][c];
                out.print(c == 6 ? temp[r][c] : temp[r][c] + ", ");
               /* if (c == 6)
                    out.print(temp[r][c]);
                else
                    out.print(temp[r][c] + ", ");*/

            }
            timeSumArr[r] = (timeSum / (c));
            timeSum = 0;
            out.println();
        }

        for (int c = 0; c < 7; c++) {
            for (int r = 0; r < 4; r++) {
                daySum += temp[r][c];
                tot += temp[r][c];
            }
            daySumArr[c] = daySum / 4;
            daySum = 0;
        }

        out.println("\nBased on that data, the following are the average temperatures for the week. \n");
        printMethod(days, daySumArr);
        printMethod(time, timeSumArr);
        out.println("The final average temperature for the week was:\n");
        out.println("Overall: " + (tot / (7 * 4)));

    }

    public static void printMethod(String printArray[], int sumArr[]) {
        for (int i = 0; i < printArray.length; i++) {
            out.println(printArray[i] + ": " + (sumArr[i]));
        }
        out.println();
    }

}
