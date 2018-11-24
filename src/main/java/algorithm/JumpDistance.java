package algorithm;

public class JumpDistance {

    public int jumpOne(int x, int y, int D) {
        if(x == y) return 0;
        int toBeCovered = y - x;
        int jump = toBeCovered / D;
        if(((jump*D)+x) >= y){
            return jump;
        } else {
            return jump +1;
        }
    }
}
