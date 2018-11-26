package algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDominatorTest {

    @Test
    public void dominator() {
        int[] arr = {};
        assertEquals(new ArrayDominator().dominator(arr), -1);
    }

    @Test
    public void dominatorOne() {
        int[] arr = {1};
        assertEquals(new ArrayDominator().dominator(arr), 0);
    }

    @Test
    public void dominatorTwo() {
        int[] arr = {1,2,2};
        assertEquals(new ArrayDominator().dominator(arr), 2);
    }

    @Test
    public void dominatorThree() {
        int[] arr = {1,2,2,1,1};
        assertEquals(new ArrayDominator().dominator(arr), 4);
    }

    @Test
    public void dominatorFour() {
        int[] arr = {1, 2, 2, 1, 1, 1};
        assertEquals(new ArrayDominator().dominator(arr), 5);
    }

    @Test
    public void dominatorFive() {
        int[] arr = {1, 2, 2, 3, 3, 1};
        assertEquals(new ArrayDominator().dominator(arr), -1);
    }
    @Test
    public void dominatorSix() {
        int[] arr = {1, 2, 2, 1};
        assertEquals(new ArrayDominator().dominator(arr), -1);
    }

    @Test
    public void dominatorSeven() {
        int[] arr = {3, 4, 3, 2, 3, -1, 3, 3};
        assertEquals(new ArrayDominator().dominator(arr), 7);
    }

    @Test
    public void dominatorEight() {
        int[] arr = {4, 4, 4, 4, 4, -1, 3, 3};
        assertEquals(new ArrayDominator().dominator(arr), 4);
    }

}