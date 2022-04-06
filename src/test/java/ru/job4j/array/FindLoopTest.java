package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {1, 5, 3, 6};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);

    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[]{2, 3, 9, 6, 3, 5, 5, 0};
        int el = 8;
        int start = 3;
        int finish = 6;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas3Then3() {
        int[] data = new int[]{1, 4, 2, 3, 5, 3, 4, 0};
        int el = 3;
        int start = 0;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas1Then2() {
        int[] data = new int[]{0, 2, 1, 4, 1, 0, 3, 0};
        int el = 1;
        int start = 1;
        int finish = 7;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}