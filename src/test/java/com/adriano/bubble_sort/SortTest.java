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
    public void testSortWithNoElements() {
        List<Integer> result = bubbleSort.sortList(Arrays.asList());
        List<Integer> expected = Arrays.asList();

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSortWhenListToShortIsNull() {
        List<Integer> result = bubbleSort.sortList(null);
        List<Integer> expected = Arrays.asList();

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSortWithOneElements() {
        List<Integer> result = bubbleSort.sortList(Arrays.asList(1));
        List<Integer> expected = Arrays.asList(1);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSortTwoElements() {
        List<Integer> result = bubbleSort.sortList(Arrays.asList(2, 1));
        List<Integer> expected = Arrays.asList(1, 2);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSortTreeElements() {
        List<Integer> result = bubbleSort.sortList(Arrays.asList(3, 2, 1));
        List<Integer> expected = Arrays.asList(1, 2, 3);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSortFourElements() {
        List<Integer> result = bubbleSort.sortList(Arrays.asList(2, 4, 1, 3));
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);

        Assert.assertEquals(expected, result);
    }


    @Test
    public void testSortUsingSortedList() {
        List<Integer> result = bubbleSort.sortList(Arrays.asList(1, 2, 3, 4));
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);

        Assert.assertEquals(expected, result);
    }
}