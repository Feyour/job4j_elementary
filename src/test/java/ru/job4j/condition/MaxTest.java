package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax3to7Then7() {
        int left = 3;
        int right = 4;
        int s = 7;
        int result = Max.max(left, right);
        int result2 = Max.max(left, right, s);
        int expected = 7;
        Assert.assertEquals(result, result2, expected);

    }

    @Test
    public void whenMax6to2Then6() {
        int left = 6;
        int right = 2;
        int s = 3;
        int result = Max.max(left, right);
        int result2 = Max.max(left, right, s);
        int expected = 6;
        Assert.assertEquals(result, result2, expected);
    }

    @Test
    public void whenMax5to5Then5() {
        int left = 5;
        int right = 5;
        int s = 5;
        int result = Max.max(left, right);
        int result2 = Max.max(left, right, s);
        int expected = 5;
        Assert.assertEquals(result, result2, expected);

    }

}