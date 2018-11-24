package algorithm;

public class SequenceActive {

    public int[] getForOneADay(int[] states) {
        int[] arr;
        int leftValue = 0;
        int rightValue = 0;
        arr = new int[states.length];

        for(int i = 0; i<states.length; i++){
            if(i == 0)
                leftValue = 0;
            else {
                leftValue = states[i-1];
            }
            if((i+1) == states.length)
                rightValue = 0;
            else {
                rightValue = states[i+1];
            }
            arr[i] = getState(leftValue, rightValue);
        }

        return arr;
    }

    public int[] multipleDays(int[] states, int days){
        int[] result = states;
        for(int i =0;i<days; i++)
            result = getForOneADay(result);
        return result;
    }

    private int getState(int left, int right) {
        if(left == right) return 0;
        return 1;
    }
}
