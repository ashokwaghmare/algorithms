package algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

public class UnpairedElementTest {

    @Test
    public void unpairedOne() throws Exception {
        int[] input = {4};
        int output = 4;
        new UnpairedElement().unpairedElement(input);
        assertEquals(output, output);
   }

   @Test
    public void unpairedThree() throws Exception {
        int[] input = {4,1,4};
        int output = 1;
        new UnpairedElement().unpairedElement(input);
        assertEquals(output, output);
   }

   @Test
    public void unpairedMore() throws Exception {
        int[] input = {3,1,4,3,2,1,4};
        int output = 2;
        new UnpairedElement().unpairedElement(input);
        assertEquals(output, output);
   }

   @Test
    public void unpairedMoreComplex() throws Exception {
        int[] input = {7, 6, 6, 1, 2, 0, 0, 2, 1};
        int output = 7;
        new UnpairedElement().unpairedElement(input);
        assertEquals(output, output);
   }
}