package algorithm;

import java.util.HashMap;
import java.util.Map;

public class PermutationCheck {


    //4,3,2,5
    public int isPermuted(int[] A) {
        int maxN = A.length;
        int greatestElem = A[0];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i =1; i< A.length; i++){
            if(map.containsKey(A[i])) {
                return 0;
            } else {
                map.put(A[i], 1);
            }
            if(greatestElem < A[i]){
                greatestElem = A[i];
            }
        }
        if(greatestElem == maxN){
            return 1;
        } else {
            return 0;
        }
    }

}
