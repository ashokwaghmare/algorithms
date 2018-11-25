package algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrogRiverJumpTest {

    @Test
    public void jumpEmpty() throws Exception {
        int[] input = {};
        int output = new FrogRiverJump().jumpAt(5, input);
        assertEquals(-1, output);
    }

    @Test
    public void jumpOne() throws Exception {
        int[] input = {1};
        int output = new FrogRiverJump().jumpAt(5, input);
        assertEquals(-1, output);
    }

    @Test
    public void jumpPositive() throws Exception {
        int[] input = {1, 3, 1, 4, 2, 3, 5, 4};
        int output = new FrogRiverJump().jumpAt(5, input);
        assertEquals(6, output);
    }
}