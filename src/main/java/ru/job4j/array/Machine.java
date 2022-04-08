package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int sum = money - price;
        for (int index = 0; index < coins.length; index++) {
            while (sum > 0) {
                if (sum >= coins[index]) {
                    rsl[size] = coins[index];
                    sum -= coins[index];
                    size += 1;
                } else {
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
