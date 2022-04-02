package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent /= 100;
        double duty = amount * percent;
        while (amount >= 0) {
            amount += duty;
            amount -= salary;
            year += 1;
        }
        return year;
    }

}
