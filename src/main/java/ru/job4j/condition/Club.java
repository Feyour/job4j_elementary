package ru.job4j.condition;

public class Club {
    public static void permisiion(boolean hasMoney, boolean byFriend) {
        if (hasMoney || byFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permisiion(true, true);
        permisiion(true, false);
        permisiion(false, true);
        permisiion(false, false);
    }
}
