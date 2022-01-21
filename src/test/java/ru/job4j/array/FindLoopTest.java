package ru.job4j.array;

import org.junit.Test;
import  org.junit.Assert;

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
public void whenArrayHas3Then0() {
        int[] data = {3, 4, 5, 2};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
        }

@Test
public void whenArrayHas6ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
        }

@Test
public void whenFind3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
        }

@Test
public void whenFind5() {
        int[] data = new int[]{5, 2, 10, 2, 4, 12, 18};
        int el = 12;
        int start = 4;
        int finish = 6;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
        }

@Test
public void whenNotFind() {
        int[] data = new int[]{5, 2, 10, 2, 4, 12, 18};
        int el = 3;
        int start = 4;
        int finish = 6;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);

        }
}