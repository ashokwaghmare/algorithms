package hello;

public class ArrayShifting {

    private int[] shift(int[] A) {
        int[] shiftedArray = new int[A.length];

        for(int i=0; i < (A.length - 1); i++){
            shiftedArray[i+1] = A[i];
        }

        shiftedArray[0] = A[A.length -1];
        return shiftedArray;
    }

    // Without recursion
    /*public int[] shift(int[] A, int K) {
        int[] multiShift = new int[A.length];
        multiShift = A;
        for(int i =0; i<K; i++)
            multiShift = shift(multiShift);
        return multiShift;
    }*/

    public int[] shift(int[] A, int K){
        int[] arr = {};
        if(A.length == 0) return arr;
        else return recur(A, K);
    }

    private int[] recur(int[] A, int K) {
        if(K == 0) return A;
        else return recur(shift(A), (K-1));
    }
}