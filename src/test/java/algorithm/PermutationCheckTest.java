package algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationCheckTest {

    @Test
    public void checkPerm() throws Exception {
        int[] input = {4,1,3,2};
        int output = new PermutationCheck().isPermuted(input);
        assertEquals(output, 1);
    }

    @Test
    public void checkPermOne() throws Exception {
        int[] input = {4,1,3};
        int output = new PermutationCheck().isPermuted(input);
        assertEquals(output, 0);
    }

    @Test
    public void checkPermTwo() throws Exception {
        int[] input = {1,1};
        int output = new PermutationCheck().isPermuted(input);
        assertEquals(output, 0);
    }

    @Test
    public void checkPermThree() throws Exception {
        int[] input = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
        int output = new PermutationCheck().isPermuted(input);
        assertEquals(output, 0);
    }
}