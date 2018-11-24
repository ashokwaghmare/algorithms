package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnpairedElement {

    public int unpairedElement(int[] arr) {
        List<Integer> list = arrayToList(arr);
        List<Integer> sorted = new Sort().quickSort(list);
        int unpaired = 0;
        for(int i=0; i<sorted.size()-1; i++){
            if(sorted.get(i) != sorted.get(i+1)){
                unpaired = sorted.get(i);
            }
        }
        return unpaired;
    }

    private List<Integer> arrayToList(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    private int[] listToArray(List<Integer> list) {
        return list.stream().mapToInt(i -> i).toArray();
    }
}
