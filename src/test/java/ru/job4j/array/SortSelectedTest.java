package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {8, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf6elements() {
        int[] data = new int[] {3, 6, 7, 0, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 3, 6, 7};
        Assert.assertArrayEquals(expected, result);
    }
}