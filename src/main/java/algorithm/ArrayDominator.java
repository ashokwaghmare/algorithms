package algorithm;

import java.util.HashMap;
import java.util.Map;

public class ArrayDominator {

    //3, 4, 3, 2, 3, -1, 3, 3
    public int dominator(int[] A) {
       if(A.length == 0) return -1;

       int dominatorCount = 0;
       int dominator = A[0];
       int dominatorIndex = -1;
       for(int i =0; i< A.length; i++) {
           if(A[i] == dominator) {
               dominatorIndex = i;
               dominatorCount = dominatorCount + 1;
           } else {
               dominatorCount = dominatorCount - 1;
           }

           if(dominatorCount == 0) {
               dominatorCount = dominatorCount + 1;
               dominator = A[i];
               dominatorIndex = i;
           }
       }

       int size = 0;
       for(int a: A){
           if(dominator == a)
               size++;
       }

       if(size > A.length/2)
           return dominatorIndex;
       else
           return -1;
    }
}
