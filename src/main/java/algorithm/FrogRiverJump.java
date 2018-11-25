package algorithm;

import java.util.HashMap;
import java.util.Map;

public class FrogRiverJump {

    public int jumpAt(int X, int[] A) {
        if(A.length == 0){
            return -1;
        }
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int i=0; i<A.length; i++){
           if(!map.containsKey(A[i]))
             map.put(A[i], true);
           if(map.size() == X){
               return i;
           }
        }
        return -1;
    }
}
