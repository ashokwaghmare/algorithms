package algorithm;

public class JumpDistance {

    public int jump(int x, int y, int D) {

        if(x == y) return 0;

        int Distance = x;
        int jump = D;
        int jumpCount = 0;
        do{
           Distance = Distance + jump;
           jumpCount = jumpCount + 1;
        }while(Distance < y);
        return jumpCount;
    }
}
