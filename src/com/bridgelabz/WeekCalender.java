package com.bridgelabz;
import java.util.LinkedList;
import java.util.Queue;
public class WeekCalender {
    private Queue<Week> weeks;

    public WeekCalender(String[][] dates) {
        weeks = new LinkedList<>();
        for (String[] weekDates : dates) {
            weeks.add(new Week(weekDates));
        }
    }

    public Queue<Week> getWeeks() {
        return weeks;
    }

    public void setWeeks(Queue<Week> weeks) {
        this.weeks = weeks;
    }

    public void display() {
        for (Week week : weeks) {
            for (WeekDay weekDay : week.getWeekDays()) {
                System.out.print(weekDay.toString() + "\t");
            }
            System.out.println();
        }
    }
}
