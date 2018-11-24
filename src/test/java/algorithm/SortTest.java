package algorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class SortTest {
    @Test
    public void quickSort() throws Exception {
        int[] arr = {3,4,5,1,2,5};
        int[] out = {1,2,3,4,5,5};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        List<Integer> a = new Sort().quickSort(list);
        int[] ans = a.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(ans, out);
    }

}