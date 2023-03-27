package com.bridgelabz;
import java.util.LinkedList;
import java.util.Queue;
public class WeekMain {
    public static void main(String[] args) {
        String[][] dates = {{"01/01/2023", "01/02/2023", "01/03/2023", "01/04/2023", "01/05/2023", "01/06/2023", "01/07/2023"}};
        WeekCalender calendar = new WeekCalender(dates);
        calendar.display();
    }
}
