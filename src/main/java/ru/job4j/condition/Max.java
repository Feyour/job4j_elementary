package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int s) {
        return max(left, max(right, s));
    }

    public static int max(int left, int right, int s, int b) {
        return max(max(left, b), max(right, s));
    }

    public static void main(String[] args) {
        int rsl = Max.max(4, 5);
        int rsl2 = Max.max(4, 5, 7);
        int rsl3 = Max.max(4, 5, 7, 15);
        System.out.println(rsl);
        System.out.println(rsl2);
        System.out.println(rsl3);

    }
}
