package algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpDistanceTest {

    @Test
    public void jumpOne() throws Exception {
        int output = new JumpDistance().jump(10, 85, 30);

        assertEquals(output, 3);
    }

    @Test
    public void jumpTwo() throws Exception {
        int output = new JumpDistance().jump(100, 100, 30);

        assertEquals(output, 0);
    }

    @Test
    public void jumpTwo1() throws Exception {
        int output = new JumpDistance().jump(100, 110, 30);

        assertEquals(output, 1);
    }

    @Test
    public void jumpTwo2() throws Exception {
        int output = new JumpDistance().jump(100, 130, 30);

        assertEquals(output, 1);
    }

    @Test
    public void jumpTwo3() throws Exception {
        int output = new JumpDistance().jump(100, 140, 30);

        assertEquals(output, 2);
    }

    @Test
    public void jumpTwo4() throws Exception {
        int output = new JumpDistance().jump(1, 140, 30);

        assertEquals(output, 5);
    }
}