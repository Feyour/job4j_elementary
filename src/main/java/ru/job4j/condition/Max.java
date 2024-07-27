package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int s) {
        return Math.max(left, Math.max(right, s));
    }

    public static void main(String[] args) {
        int rsl = Max.max(4, 5);
        int rsl2 = Max.max(4, 5, 7);
        System.out.println(rsl);
        System.out.println(rsl2);

    }
}
