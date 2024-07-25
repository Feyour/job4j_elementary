package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double actual = a.distance(b);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when01to20then2dot23() {
        double expected = 2.23;
        Point a = new Point(0, 1);
        Point b = new Point(2, 0);
        double actual = a.distance(b);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when10to10then0() {
        double expected = 0;
        Point a = new Point(1, 0);
        Point b = new Point(1, 0);
        double actual = a.distance(b);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when12to11then1() {
        double expected = 1;
        Point a = new Point(1, 2);
        Point b = new Point(1, 1);
        double actual = a.distance(b);
        assertEquals(expected, actual, 0.01);
    }
}
