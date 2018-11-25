package algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistinctValueTest {

    @Test
    public void distictTest() throws Exception {
       int[] intput = {2, 2, 1, 1, 1, 3};
       int output =  new DistinctValue().distinctValue(intput);

       assertEquals(3, output);
    }
}