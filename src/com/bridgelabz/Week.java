package com.bridgelabz;
import java.util.LinkedList;
import java.util.Queue;

public class Week {
    private Queue<WeekDay> weekDays;

    public Week(String[] dates) {
        weekDays = new LinkedList<>();
        weekDays.add(new WeekDay("Sunday", dates[0]));
        weekDays.add(new WeekDay("Monday", dates[1]));
        weekDays.add(new WeekDay("Tuesday", dates[2]));
        weekDays.add(new WeekDay("Wednesday", dates[3]));
        weekDays.add(new WeekDay("Thursday", dates[4]));
        weekDays.add(new WeekDay("Friday", dates[5]));
        weekDays.add(new WeekDay("Saturday", dates[6]));
    }

    public Queue<WeekDay> getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(Queue<WeekDay> weekDays) {
        this.weekDays = weekDays;
    }
}
