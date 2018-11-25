package algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class TapeEquilibriumTest {


    //case 1
    //1,2,3,4,5
    //mid    3 - 12 =  -9    // pick mid index
    //start  1 - 14 = -13   // pick index 1
    //end    10 -5 =  5      // pick last index
    //
    // case 2
    //1,2,3,4,5
    //mid    3 - 12 =  -9    // pick mid index
    //start  1 - 14 = -13   // pick index 1
    //end    10 -5 =  5      // pick last index

    @Test
    public void minimumDiff() throws Exception {
        int[] input = {3,1,2,4,3};
        int output = new TapeEquilibrium().getMinimumDiff(input);
        assertEquals(output, 1);
    }

    @Test
    public void minimumDiffOne() throws Exception {
        int[] input = {1,2,3,4,5};
        int output = new TapeEquilibrium().getMinimumDiff(input);
        assertEquals(output, 3);
    }

    @Test
    public void minimumDiffTwo() throws Exception {
        int[] input = {-1000, 1000};
        int output = new TapeEquilibrium().getMinimumDiff(input);
        assertEquals(output, 2000);
    }

}