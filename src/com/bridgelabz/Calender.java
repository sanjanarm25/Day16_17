package com.bridgelabz;

import java.util.Calendar;

public class Calender {
    private static void printCalendar(int[][] calendarArray) {
     System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < calendarArray.length; i++) {
        for (int j = 0; j < calendarArray[i].length; j++) {
            if (calendarArray[i][j] == -1) {
                System.out.print("   ");
            } else if (calendarArray[i][j] < 10) {
                System.out.print(" " + calendarArray[i][j] + " ");
            } else {
                System.out.print(calendarArray[i][j] + " ");
            }
        }
        System.out.println();
    }
}



    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);

        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        int[][] calendarArray = new int[6][7];

        int dayOfMonth = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j < firstDayOfWeek - 1) {
                    calendarArray[i][j] = -1;
                } else if (dayOfMonth > daysInMonth) {
                    break;
                } else {
                    calendarArray[i][j] = dayOfMonth++;
                }
            }
        }

        printCalendar(calendarArray);

    }
}
