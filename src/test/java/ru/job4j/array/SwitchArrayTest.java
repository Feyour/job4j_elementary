package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {1, 4, 2, 6, 4, 5, 6};
        int source = 2;
        int dest = input.length - 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 4, 4, 6, 2, 5, 6};
        Assert.assertArrayEquals(expected, result);

    }
}