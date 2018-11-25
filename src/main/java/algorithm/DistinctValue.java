package algorithm;

import java.util.HashMap;
import java.util.Map;

public class DistinctValue {

    public int distinctValue(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<A.length; i++) {
            if(!map.containsKey(A[i]))
                map.put(A[i], 1);
        }
        return map.size();
    }
}
