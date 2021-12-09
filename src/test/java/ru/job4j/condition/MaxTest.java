package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax50To70Then70() {
        int left = 50;
        int right = 70;
        int result = Max.max(left, right);
        int expected = 70;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax60To23Then60() {
        int left = 60;
        int right = 23;
        int result = Max.max(left, right);
        int expected = 60;
        Assert.assertEquals(result, expected);
    }
}