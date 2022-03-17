package com.adriano.bubble_sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SortTest {

    private BubbleSort bubbleSort;

    @Before
    public void init() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testShotWithNoElements() {
        List<Integer> result = bubbleSort.shortList(Arrays.asList());
        List<Integer> expected = Arrays.asList();

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testShotWhenListToShortIsNull() {
        List<Integer> result = bubbleSort.shortList(null);
        List<Integer> expected = Arrays.asList();

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testShotWithOneElements() {
        List<Integer> result = bubbleSort.shortList(Arrays.asList(1));
        List<Integer> expected = Arrays.asList(1);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testShotTwoElements() {
        List<Integer> result = bubbleSort.shortList(Arrays.asList(2, 1));
        List<Integer> expected = Arrays.asList(1, 2);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testShotTreeElements() {
        List<Integer> result = bubbleSort.shortList(Arrays.asList(3, 2, 1));
        List<Integer> expected = Arrays.asList(1, 2, 3);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testShotFourElements() {
        List<Integer> result = bubbleSort.shortList(Arrays.asList(2, 4, 1, 3));
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);

        Assert.assertEquals(expected, result);
    }

}