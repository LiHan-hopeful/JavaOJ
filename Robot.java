import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
       return factorial(y,x+y-2)/factorial(1,x-1);
    }
     
    int factorial(int f,int t){
        int res=1;
        for(int i=f;i<=t;i++){
            res = res*i;
        }
        return res;
    }
}