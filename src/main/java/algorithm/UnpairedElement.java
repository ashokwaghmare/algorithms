package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnpairedElement {

    public int unpairedElement(int[] arr) {
        int Unpaired = arr[0];
        for(int i =1; i < arr.length; i++) {
            Unpaired = Unpaired ^ arr[i];
        }
        return Unpaired;
    }


}
