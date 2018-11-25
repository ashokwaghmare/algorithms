package algorithm;

import static java.lang.Math.*;

public class TapeEquilibrium {


    public int getMinimumDiff(int[] A){
        int leftSum = 0;
        int rightSum = 0;

        leftSum = A[0];
        for(int i=1; i< A.length; i++) {
            rightSum = rightSum + A[i];
        }

        int result = abs(leftSum - rightSum);

        for(int j =1; j < A.length; j++ ) {
            if(abs(leftSum - rightSum) < result){
                result = abs(leftSum - rightSum);
            }
            leftSum = leftSum + A[j];
            rightSum = rightSum - A[j];
        }
        return result;
    }
}
