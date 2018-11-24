package hello;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftingTest {
    @Test
    public void shiftZero() throws Exception {
        int[] input = {};
        int[] output = {};
        ArrayShifting arrayShifting = new ArrayShifting();
        assertArrayEquals(arrayShifting.shift(input, 1), output);
    }

    @Test
    public void shiftOne() throws Exception {
        int[] input = {1};
        int[] output = {1};
        ArrayShifting arrayShifting = new ArrayShifting();
        assertArrayEquals(arrayShifting.shift(input, 1), output);
    }

    @Test
    public void shiftTwo() throws Exception {
        int[] input = {1, 2, 3};
        int[] output = {3, 1, 2};
        ArrayShifting arrayShifting = new ArrayShifting();
        assertArrayEquals(arrayShifting.shift(input, 1), output);
    }

    @Test
    public void shiftMore() throws Exception {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] output = {6, 1, 2, 3, 4, 5};
        ArrayShifting arrayShifting = new ArrayShifting();
        assertArrayEquals(arrayShifting.shift(input, 1), output);
    }

    @Test
    public void shiftMoreForTwo() throws Exception {
        int[] input = {1, 2, 3};
        int[] output = {2, 3, 1};
        ArrayShifting arrayShifting = new ArrayShifting();
        assertArrayEquals(arrayShifting.shift(input, 2), output);
    }

    @Test
    public void shiftMoreForFour() throws Exception {
        int[] input = {1, 2, 3, 4};
        int[] output = {1, 2, 3, 4};
        ArrayShifting arrayShifting = new ArrayShifting();
        assertArrayEquals(arrayShifting.shift(input, 4), output);
    }

}